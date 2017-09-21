package Inquire;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Inquire {

    private String inquir;
    private String result;


    public void setInquir(String inquir) {
        this.inquir = inquir;
    }

    public void respons(){
        URL url;
        HttpURLConnection conn;
        BufferedReader rd;
        String line;

        try {
            url = new URL(this.inquir);
            conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            rd = new BufferedReader(new InputStreamReader(conn.getInputStream(),"UTF-8"));
            while ((line = rd.readLine()) != null) {
                this.result += line;
            }

            rd.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public String getResult(){
        return this.result;
    }
}
