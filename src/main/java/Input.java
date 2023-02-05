import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Class that handles input functions
 */
public class Input {

    /**
     * Parses input into lines to store in LineStorage
     * 
     * @param file  string to parse
     * @param lines LineStorage object to store parsed lines
     */
    public void parse(String file, LineStorage lines) throws FileNotFoundException {
        // pass the path to the file as a parameter
        File f = new File(file);
        Scanner sc = new Scanner(f);
        lines.lines = new ArrayList<String>();
        while (sc.hasNextLine())
            lines.lines.add(sc.nextLine());
    }
}
