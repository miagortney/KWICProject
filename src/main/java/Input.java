/**
 * Class that handles input functions
 */
public class Input {

    /**
     * Parses input into lines to store in LineStorage
     * @param file string to parse
     * @param lines LineStorage object to store parsed lines
     */
    public void parse(String file, LineStorage lines) {
        lines.lines = file.split("\n");
    }
}
