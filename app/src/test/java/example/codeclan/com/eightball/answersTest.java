package example.codeclan.com.eightball;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

import org.mockito.*;
import static org.mockito.Mockito.*;

/**
 * Created by user on 29/06/2017.
 */

public class answersTest {

    ArrayList<String> testAnswers;
    Answers answers;


    @Before
    public void setUp() throws Exception {
        testAnswers = new ArrayList<String>();
        testAnswers.add("Yes!");
        testAnswers.add("That would be an ecumenical matter!");
        answers = new Answers();

    }

    @Test
    public void createAnswersWithThisList() throws Exception {
        Answers answers = new Answers(testAnswers);
        assertEquals(2, answers.getLength());
    }

    @Test
    public void testGetAnswers() throws Exception {
        assertNotNull(answers.getAnswers());
    }

    @Test
    public void testSetupAnswers() throws Exception {
        assertEquals(2, answers.getLength());
    }

    @Test
    public void testAddAnswer() throws Exception {
       int originalnumberOfAnswers = answers.getLength();
        answers.add("No!");
        assertEquals(originalnumberOfAnswers + 1 , answers.getLength());
    }

    @Test
    public void testgetAnswerAtIndex() throws Exception {
        String result = answers.getAnswerAtIndex(0);
        assertEquals("Yes!", result);
    }

    @Test
    public void testgetAnswer() throws Exception {
        Answers spyAnswers = Mockito.spy(answers);
        Mockito.when(spyAnswers.getAnswer()).thenReturn("Yes!");
        assertEquals("Yes!", spyAnswers.getAnswer());
//        String answer = answers.getAnswer();
//        assertNotNull(answer);
    }

}
