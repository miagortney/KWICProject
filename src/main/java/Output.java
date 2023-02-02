public class Output {

    public void print(Alphabetizer alphabetizer) {
        for (String[] line : alphabetizer.alphabetizedLines) {
            for (String s : line) {
                System.out.print(s + " ");
            }
            System.out.print('\n');
        }
    }
}
