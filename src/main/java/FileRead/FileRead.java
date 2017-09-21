package FileRead;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileRead {

    private  String pathc;
    private BufferedReader reader;

    public  void setPathc(String sPatch){
        pathc = sPatch;
    }

    public List<String> readCurrenciesFile() throws IOException {

        this.reader = new BufferedReader(new FileReader(this.pathc));
        String line;
        List<String> currencies = new ArrayList<String>();
        while ((line = reader.readLine()) != null) {
            currencies.add(line);
        }
        return currencies;
    }

    public void close(){
        try {
            this.reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
