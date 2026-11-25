import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.*;

public class CopiarPegar {
    public static void main(String[] args) throws FileNotFoundException, IOException {

        FileInputStream in = new FileInputStream("./src/img/descarga.jpg");
        FileOutputStream out = new FileOutputStream("./src/img/descarga_copia.jpg");
        int n = 0, c;
        System.out.print("\nCopiando ...");
        while ((c = in.read()) != -1) {
            out.write(c);
            n++;
        }
        in.close();
        out.close();
        System.out.print("\nSe han copiado " + n + " Bytes\n");

    }
}
