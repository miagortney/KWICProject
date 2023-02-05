import java.util.ArrayList;

/**
 * Class that handles alphabetizing lines
 */
public class Alphabetizer {

    ArrayList<String[]> alphabetizedLines = new ArrayList<>();

    /**
     * Compare two strings character by character
     * @param s1 the first string to be compared
     * @param s2 the second string to be compared
     * @return true or false based on if the first string is greater than
     * the second string
     */
    public boolean compareStrings(String s1, String s2) {

        boolean comparison = true;
        boolean greater = false;
        int i = 0;

        if (s1.equals(s2)) {
            comparison = false;
        }

        while (comparison) {

            if (s1.toLowerCase().charAt(i) > s2.toLowerCase().charAt(i)) {
                greater = true;
                comparison = false;
            } else if (s1.toLowerCase().charAt(i) < s2.toLowerCase().charAt(i)) {
                comparison = false;
            }

            if (i == s1.length() - 1 || i == s2.length() - 1) {
                if (s1.length() > s2.length()) {
                    greater = true;
                    comparison = false;
                } else if (s1.length() < s2.length()) {
                    comparison = false;
                }
            }

            i++;
        }
        return greater;
    }

    /**
     * Sort shifted lines in alphabetical order
     * @param shifter CircularShifter object that holds shifted lines
     */
    public void alpha(CircularShifter shifter) {

        ArrayList<String[]> lines = shifter.shiftedLines;
        String[] temp;

        for (int i = 0; i < lines.size() - 1; i++) {
            for (int j = 0; j < lines.size() - i - 1; j++) {
                if (compareStrings(lines.get(j)[0], lines.get(j + 1)[0])) {
                    temp = lines.get(j);
                    lines.set(j, lines.get(j + 1));
                    lines.set(j + 1, temp);
                }
            }
        }

        alphabetizedLines.addAll(lines);
    }
}
