import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class FirstTest {

    @Test
    public  void stringTest(){
    String input1 = "Codeup";
    String input2 = "CodeUp";
    assertEquals(input1, input2);


    }
    @Test
    public void arrayTest1(){
        List<String> languages = new ArrayList<>();
        List<String> moreLanguages = new ArrayList<>();
        assertNotSame(languages, moreLanguages);

    }
    @Test
    public void arrayTest2(){
        int[] numbers = {1, 2, 3};
        int[] otherNumbers = new int[3];
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;
        assertArrayEquals(numbers, otherNumbers);

    }
    @Test
    public void stringTest2(){
        String language = "PHP";
        assertTrue(language.contains("H")); // use assertTrue for this statement
        assertFalse(language.contains("J")); // use assertFalse for this statement

    }
}
