package Parser;


import FileRead.*;

import java.util.ArrayList;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parse {
    private ArrayList<String> filleKey = FilleKey.getKey();


    public ArrayList<String> parseCheckKeyMessage(String text){
        ArrayList actualList = new ArrayList<String>();

        Pattern pattern = Pattern.compile("(?<=data-aria-label-part=\\\"0\\\">)[\\w\\W]*?(?=<)");
        Matcher matcher = pattern.matcher(text);
        String tt;

        while (matcher.find()) {
           tt = text.substring(matcher.start(), matcher.end());
           String[] arr = tt.split(" ");
           if(this.chekKey(arr)){
                actualList.add(tt);
           }

        }

        return actualList;
    }

    private  boolean chekKey(String[] arr){
        for (int i = 0;i<arr.length;i++){
            for (int j = 0; j< filleKey.size(); j++)

                if(arr[i].toUpperCase().equals(filleKey.get(j).toUpperCase())){
                    return true;
            }
        }
        return false;
    }
}
