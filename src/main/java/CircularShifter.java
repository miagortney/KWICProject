import java.util.ArrayList;

public class CircularShifter {
    ArrayList<String[]> shiftedLines;
    public void setup(LineStorage lines) {
        shiftedLines = new ArrayList<String[]>();
        for (String line: lines.lines){
            String[] lineWords = line.split(" ");
            for (int i = 0; i < lineWords.length; i++) {
                String[] shiftedLine = new String[lineWords.length];
                getShiftedLine(lineWords, shiftedLine, i);
                shiftedLines.add(shiftedLine);
            }
        }
    }

    private void getShiftedLine(String[] src, String shifted[], int startIndex){
        for(int i = startIndex; i < startIndex + src.length; i++){
            shifted[i - startIndex] = src[i % src.length];
        }
    }
}
