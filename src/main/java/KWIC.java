import java.io.FileNotFoundException;

public class KWIC {
    public static void main(String[] args) throws FileNotFoundException {
        execute("C:\\Users\\Nana\\Documents\\Baylor\\Courses\\OOP\\Week 3\\KWIC\\KWICProject\\src\\main\\java\\a.txt");
    }
    public static void execute(String file) throws FileNotFoundException {
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
