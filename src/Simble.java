import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Simble {

    public static void main(String[] args) throws IOException {
        if (args.length > 1) {
            System.out.println("Usage: simble [script]");
            System.exit(64);
        }
        else if (args.length == 1) {
            runFile(args[0]);
        }
        else {
            runPrompt();
        }
    }

    private static void runFile(String path) throws IOException {
        byte[] bytes = Files.readAllBytes(Paths.get(path));

    }

    private static void runPrompt() {

    }
}
