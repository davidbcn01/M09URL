import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class Metodos {
    public void prova(URL url, String etiqueta) throws IOException {
        BufferedReader in = new BufferedReader( new InputStreamReader(url.openStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            if(inputLine.contains(etiqueta)) {
                System.out.println(inputLine.replaceAll("<\\/?a>","").trim());

                //bw.write(inputLine + "\n");
            }
        }
        //bw.close();
        in.close();
    }
}
