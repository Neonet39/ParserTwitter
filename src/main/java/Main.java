import FileRead.FileConfig;
import Flows.Flows;
import Parser.Parse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
       BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        System.out.println("Input file link:");
       String numa = reader.readLine();
        FileConfig.setLink_panch(numa);

        System.out.println("Input file key:");
        String key = reader.readLine();
        FileConfig.setKey_patch(key);

        for (int i=0;i<20;i++) {
            Flows flows = new Flows();
            flows.start();
        }

        System.out.println();

    }
}
