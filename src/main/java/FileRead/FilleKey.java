package FileRead;


import java.io.IOException;
import java.util.ArrayList;

public class FilleKey {
    private static ArrayList<String> key;

    public static ArrayList<String> getKey(){
        if (key==null){
           return readKey();

        }else return key;

    }

    private static ArrayList<String> readKey(){
        FileRead fileRead = new FileRead();
        fileRead.setPathc(FileConfig.getKey_patch());
        try {
            key = (ArrayList<String>) fileRead.readCurrenciesFile();
            fileRead.close();
            return key;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
