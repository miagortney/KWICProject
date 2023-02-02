public class KWIC {
    public static void main(String[] args) {
        execute("testing file\nwith line breaks\nfor OOP assignment");
    }
    public static void execute(String file) {
        LineStorage lines = new LineStorage();
        Input input = new Input();
        CircularShifter shifter = new CircularShifter();
        Alphabetizer alphabetizer = new Alphabetizer();
        Output output = new Output();
        input.parse(file, lines);
        shifter.setup(lines);
        alphabetizer.alpha(shifter);
        output.print(alphabetizer);
    }
}
