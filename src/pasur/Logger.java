package pasur;

import java.io.File;
import java.io.PrintStream;
import java.io.IOException;

public class Logger {
    private static Logger instance = null;
    private File file;
    private String name;
    public PrintStream ps;

    private Logger() {
        try {
            this.name = "pasur.log";
            this.file = new File(this.name);
            this.ps = new PrintStream(this.file);
            System.setOut(ps);
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        } 
    }
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }
}
