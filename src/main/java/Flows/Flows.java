package Flows;

import Chek.BaseMessage;
import Inquire.Inquire;
import Parser.Parse;
import Sheet.LinkTwitter;

import java.util.ArrayList;

public class Flows extends Thread{
    private Inquire inquire = new Inquire();
    private Parse parseMessActual = new Parse();
    private ArrayList actualList = new ArrayList<String>();
    public void run() {
        while (true) {
            String linkTwetter = LinkTwitter.getLink();

            if (linkTwetter != null) {
                inquire.setInquir(linkTwetter);
                inquire.respons();
                actualList = parseMessActual.parseCheckKeyMessage(inquire.getResult());
                if (actualList.size() > 0) {
                    for (int i = 0; i < actualList.size(); i++) {
                        if (BaseMessage.check(actualList.get(i).toString())) {

                            System.out.println("New message->:" + actualList.get(i) + "profelle: ->" + linkTwetter);
                            System.out.println();
                        }

                    }
                }


            }
        }
    }
}
