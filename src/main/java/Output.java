
/**
 * Class that handles output functions
 */
public class Output {

    /**
     * Print alphabetized lines to screen
     * @param alphabetizer Alphabetizer that holds alphabetized lines
     */
    public void print(Alphabetizer alphabetizer) {
        for (String[] line : alphabetizer.alphabetizedLines) {
            for (String s : line) {
                System.out.print(s + " ");
            }
            System.out.print('\n');
        }
    }
}
