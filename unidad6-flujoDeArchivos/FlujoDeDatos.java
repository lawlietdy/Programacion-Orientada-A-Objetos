import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class flujoDeDatos{
    public static void main(String[] args) {
        Path inputPath = Paths.get("Ejemplo.txt");
        InputStream input;

        try {
            input = Files.newInputStream(inputPath, StandardOpenOption.READ);

            int i;
            while((i = input.read()) != -1)
                System.out.print((char)i);

            System.out.println("\nProceso terminado");
            input.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
