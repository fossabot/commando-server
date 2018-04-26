package rnd.util.helper;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;


public class CommandHelper {

    public static void execCmd(String cmd) throws Exception {

        Process p = Runtime.getRuntime().exec(cmd);
        printIS(p.getInputStream());
        printIS(p.getErrorStream());
    }

    public static void printIS(InputStream is) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String line = "";
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

    }
    
    public static void main(String[] args) throws Exception {
        execCmd("ls -ltr");
    }

}
