import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OutputTest {

    @Test
    public void validTest() {

        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        PrintStream stdout = System.out;
        PrintStream out = new PrintStream(bytes);
        System.setOut(out);
        Alphabetizer a = new Alphabetizer();
        Output o = new Output();

        String test = "hello universe \nhello world " +
                "\nwhat's up \ndon't stop \nbelieving \nhold onto \nthat feeling \n";

        ArrayList<String[]> list = new ArrayList<>();

        list.add(new String[] {"hello", "universe"});
        list.add(new String[] {"hello", "world"});
        list.add(new String[] {"what's", "up"});
        list.add(new String[] {"don't stop"});
        list.add(new String[] {"believing"});
        list.add(new String[] {"hold", "onto"});
        list.add(new String[] {"that", "feeling"});

        a.alphabetizedLines = list;
        o.print(a);

        assertEquals(test, bytes.toString(), "Strings should match");
    }
}
