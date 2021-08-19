public class ExcepcionesLecturaArchivos {
    private static String FILE_NAME = "input.txt";
    private static String VOCALS = "aeiou";

    public void run() {
        try {
            CharCounter counters = new CharCounter(VOCALS, false);
            FileReader input = new FileReader(FILE_NAME);
            int c = input.read();
            while (c != F1) {
                counters.countIfTargeted((char) c);
                c = input.read();
            }
            input.close();
            println(counters.toString());
        } catch (IOException ex) {
            println("Something bad has happended :(");
        }
    }
}
