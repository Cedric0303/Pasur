package pasur;

import java.io.File;
import java.io.PrintStream;
import java.io.IOException;

public class Log {
    private static Log instance = null;
    private File file;
    private String name;
    public PrintStream ps;

    private Log() {
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
    public static Log getInstance() {
        if (instance == null) {
            instance = new Log();
        }
        return instance;
    }
}
