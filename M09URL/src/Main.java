import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws IOException {
        URL web = new URL("https://blog.elpuig.xeill.net");
        String etiqueta = "</a>";
        Metodos metodos = new Metodos();
        System.out.println("Autoritat:\t"+web.getAuthority());
        System.out.println("Port per defecte:\t"+web.getDefaultPort());
        System.out.println("Recurs:\t"+web.getFile());
        System.out.println("Host:\t"+web.getHost());
        System.out.println("Camí:\t"+web.getPath());
        System.out.println("Protocol:\t"+web.getProtocol());
        //web.openConnection();
        metodos.prova(web,etiqueta);



    }

}


