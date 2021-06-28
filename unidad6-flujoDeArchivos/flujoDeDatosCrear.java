import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class flujoDeDatosCrear{
    public static void main(String[] args) {
        Path inputPath = Paths.get("Ejemplo.txt");
        Path outpuntPath = Paths.get("Ejempleo2.txt");

        InputStream input;

        try {
            input = Files.newInputStream(inputPath, StandardOpenOption.READ);
            Files.newOutputStream(outpuntPath,StandardOpenOption.CREATE);
            OutputStream outputStraeam = Files.newOutputStream(outpuntPath, StandardOpenOption.WRITE);
            int i;
            byte[] data = new byte[1024];
            while((i = input.read(data)) != -1)
                outputStraeam.write(data);

            System.out.println("Proceso terminado");
            input.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}