import java.util.ArrayList;

/**
 * Class that handles shifting lines
 */
public class CircularShifter {
    ArrayList<String[]> shiftedLines;

    /**
     * Shifts lines and stores every variation of the shift
     * @param lines LineStorage object that holds lines to be shifted
     */
    public void setup(LineStorage lines) {
        shiftedLines = new ArrayList<>();
        for (String line: lines.lines){
            String[] lineWords = line.split(" ");
            for (int i = 0; i < lineWords.length; i++) {
                String[] shiftedLine = new String[lineWords.length];
                getShiftedLine(lineWords, shiftedLine, i);
                shiftedLines.add(shiftedLine);
            }
        }
    }

    /**
     * Shifts one line of strings depending on the start index
     * @param src source string to be shifted
     * @param shifted variable to hold shifted string array
     * @param startIndex index to start with
     */
    private void getShiftedLine(String[] src, String[] shifted, int startIndex){
        for(int i = startIndex; i < startIndex + src.length; i++){
            shifted[i - startIndex] = src[i % src.length];
        }
    }
}
