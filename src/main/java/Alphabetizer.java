import java.util.ArrayList;

public class Alphabetizer {

    ArrayList<String[]> alphabetizedLines = new ArrayList<>();

    public boolean compareStrings(String s1, String s2) {

        boolean comparison = true;
        boolean greater = false;
        int i = 0;
        while (comparison) {
            if (s1.toLowerCase().charAt(i) > s2.toLowerCase().charAt(i)) {
                greater = true;
                comparison = false;
            } else if (s1.toLowerCase().charAt(i) < s2.toLowerCase().charAt(i)) {
                comparison = false;
            }
            i++;
        }
        return greater;
    }

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
