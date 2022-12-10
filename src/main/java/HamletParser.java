import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by thook on 10/7/15.
 */
public class HamletParser {

    private String hamletData;
    Pattern p1 = Pattern.compile("Hamlet");
    Pattern p2 = Pattern.compile("Horatio");

    public Pattern getP1() {
        return p1;
    }

    public Pattern getP2() {
        return p2;
    }
    public boolean find(Pattern pattern){
        return pattern.matcher(hamletData).find();
    }
    public String repalceStr(Pattern pattern, String matchString, String replaceString){
        if(pattern.matcher(matchString).find()){
          return  pattern.matcher(matchString).replaceAll(replaceString);
        }
        return null;
    }

    public HamletParser(){
        this.hamletData = loadFile();
    }

    private String loadFile(){
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("hamlet.txt").getFile());
        StringBuilder result = new StringBuilder("");


        try(Scanner scanner = new Scanner(file)){
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                result.append(line).append("\n");
            }

            scanner.close();
        }catch(IOException e){
            e.printStackTrace();
        }

        return result.toString();
    }

    public String getHamletData(){
        return hamletData;
    }

}
