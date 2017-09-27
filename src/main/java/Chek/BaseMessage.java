package Chek;

import java.util.ArrayList;

public class BaseMessage {
    private static ArrayList baseMessage = new ArrayList<String>();

    public static synchronized boolean check(String message){

        for (int i=0;i<baseMessage.size();i++){
            if (baseMessage.get(i).equals(message)) return true;
        }
        addMessage(message);
        return false;
    }

    private static void addMessage(String message){
        baseMessage.add(message);
    }
}
