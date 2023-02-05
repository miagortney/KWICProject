import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class AlphabetizerTest {

    @Test
    public void validTest() {

        ArrayList<String[]> list = new ArrayList<>();
        ArrayList<String[]> answer = new ArrayList<>();
        Alphabetizer a = new Alphabetizer();
        CircularShifter s = new CircularShifter();

        list.add(new String[] {"hello", "universe"});
        list.add(new String[] {"hello", "world"});
        list.add(new String[] {"what's", "up"});
        list.add(new String[] {"don't stop"});
        list.add(new String[] {"believing"});
        list.add(new String[] {"hold", "onto"});
        list.add(new String[] {"that", "feeling"});

        answer.add(new String[] {"believing"});
        answer.add(new String[] {"don't stop"});
        answer.add(new String[] {"hello", "universe"});
        answer.add(new String[] {"hello", "world"});
        answer.add(new String[] {"hold", "onto"});
        answer.add(new String[] {"that", "feeling"});
        answer.add(new String[] {"what's", "up"});

        s.shiftedLines = list;

        a.alpha(s);

        for (int i = 0; i < answer.size(); i++) {
            assertArrayEquals(answer.get(i), a.alphabetizedLines.get(i),
                    "Failed on line " + i + ", lines should match");
        }
    }

}
