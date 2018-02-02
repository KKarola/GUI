package GUI_1.Task_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Finder {
    String path;
    String line;
    String regexForIf = "if\\s*\\(.*?\\)";
    String regexForWariant = "wariant";
    String regexForComment = "//|\"";
    String regexForComment1 = "/\\*";
    String regexForComment2 = "\\*/";
    boolean comment;
    int ifCount = 0;
    int wariantCount = 0;

    public Finder (String path) {
        this.path = path;
    }

    public int getIfCount () {
        try (BufferedReader bufferReader = new BufferedReader(new FileReader(path))) {
            while ((line = bufferReader.readLine()) != null) {

                Pattern patternForComment = Pattern.compile(regexForComment);
                Matcher matcherForComment = patternForComment.matcher(line);

                Pattern patternForComment1 = Pattern.compile(regexForComment1);
                Matcher matcherForComment1 = patternForComment1.matcher(line);

                Pattern patternForComment2 = Pattern.compile(regexForComment2);
                Matcher matcherForComment2 = patternForComment2.matcher(line);

                Pattern patternForIf = Pattern.compile(regexForIf);
                Matcher matcherForIf = patternForIf.matcher(line);

                if(matcherForComment1.find()){
                    if(matcherForIf.find()) {
                        if(matcherForComment1.start() > matcherForIf.start()) {
                            do {
                                ifCount++;
                            } while (matcherForIf.find());
                        }
                    }
                    comment = true;
                }

                if(matcherForComment2.find()){
                    if(matcherForIf.find()) {
                        if(matcherForComment2.start() < matcherForIf.start()) {
                            do {
                                ifCount++;
                            } while (matcherForIf.find());
                        }
                    }
                    comment = false;
                }

                if(matcherForIf.find() && !comment) {
                    if(!matcherForComment.find()) {
                        do {
                            ifCount++;
                        } while (matcherForIf.find());
                    }
                    else {
                        do{
                            if(matcherForComment.start() > matcherForIf.start()) {
                                ifCount ++;
                            }
                        } while (matcherForIf.find());

                    }
                }
            }

        } catch (IOException e) {
            System.out.println("Blad wejscia-wyjscia " + e);
        }
        return ifCount;
    }

    public int getStringCount (String slowo) {
        try (BufferedReader bufferReader = new BufferedReader(new FileReader(path))) {
            while ((line = bufferReader.readLine()) != null) {

                Pattern patternForWariant = Pattern.compile(regexForWariant);
                Matcher matcherForWariant = patternForWariant.matcher(line);
                boolean matchForWariant = matcherForWariant.find();
                if(matchForWariant) {
                    do{
                        wariantCount ++;
                    } while(matcherForWariant.find());
                }
            }
        } catch (IOException e) {
            System.out.println("Blad wejscia-wyjscia " + e);
        }
        return wariantCount;

    }
}