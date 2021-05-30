package devices;
import java.io.*;


public class URL {
    public static void main(String[] args) throws Exception {

        java.net.URL YouTube;
        YouTube = new java.net.URL("https://play.google.com/store/apps/details?id=com.google.android.youtube&hl=en_US&gl=US");
        BufferedReader in = new BufferedReader(
                new InputStreamReader(YouTube.openStream()));

        String inputLine;
        while ((inputLine = in.readLine()) != null)
            System.out.println(inputLine);
        in.close();
    }
}