package Sheet;


import FileRead.*;

import java.io.IOException;
import java.util.List;

public class LinkTwitter {
    private static List<String> LinkTwitterList;
    private static int IndexTwitterList = -1;
    private static FileRead fileRead;

    private static List<String>  getLinkTwitterList()  {
        fileRead = new FileRead();
        fileRead.setPathc(FileConfig.getLink_panch());
        try {
            return fileRead.readCurrenciesFile();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String getLink(){
        if (LinkTwitterList == null){
            LinkTwitterList = getLinkTwitterList();
        }
        if (LinkTwitterList.size() > 0){
            if(IndexTwitterList<LinkTwitterList.size())
                IndexTwitterList++;
            else IndexTwitterList = 0;
            return LinkTwitterList.get(IndexTwitterList);
        }
        return null;
    }



}
