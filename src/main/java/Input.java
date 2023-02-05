import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class Input {

    public void parse(String file, LineStorage lines) throws FileNotFoundException {

        // pass the path to the file as a parameter
        File f = new File(file);
        Scanner sc = new Scanner(f);
        lines.lines = new ArrayList<String>();
        while (sc.hasNextLine())
            lines.lines.add(sc.nextLine());
    }
}
