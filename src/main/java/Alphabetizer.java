import java.util.ArrayList;

public class Alphabetizer {

    ArrayList<String[]> alphabetizedLines = new ArrayList<>();

    public void swap(String[] s1, String[] s2) {
        String[] temp = s1;
        s1 = s2;
        s2 = temp;
    }

    public void alpha(CircularShifter shifter) {


        ArrayList<String[]> lines = shifter.shiftedLines;

        for (int i = 0; i < lines.size() - 1; i++) {
            for (int j = 0; j < lines.size() - i - 1; j++) {
                if (lines.get(j)[0].compareTo(lines.get(j + 1)[0]) > 0) {
                    swap(lines.get(j), lines.get(j + 1));
                }
            }
        }

        alphabetizedLines.addAll(lines);
    }
}
