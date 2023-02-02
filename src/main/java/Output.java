public class Output {

    public void print(Alphabetizer alphabetizer) {
        for (String[] line : alphabetizer.alphabetizedLines) {
            for (String s : line) {
                System.out.println(s + " ");
            }
        }
    }
}
