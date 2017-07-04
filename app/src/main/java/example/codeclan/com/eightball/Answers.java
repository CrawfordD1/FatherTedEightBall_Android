package example.codeclan.com.eightball;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by user on 29/06/2017.
 */

public class Answers implements Answerable {

    private ArrayList<String> answers;

    public Answers() {
        answers = new ArrayList<String>();
        setupAnswers();
    }

    public Answers(ArrayList<String> newAnswers) {
        this.answers = newAnswers;
    }

    private void setupAnswers() {
        String[] answersToAdd = {
                "Yes!",
                "That would be an ecumenical matter!",
                "Go on Go on Go on...",
                "Feck off!"
        };

        for (String answer : answersToAdd) {
            answers.add(answer);
        }
    }

    public ArrayList<String> getAnswers() {
        return new ArrayList<String>(answers);
    }

    public int getLength() {
        return answers.size();
    }

    public void add(String newAnswer) {
        answers.add(newAnswer);
    }

    public String getAnswerAtIndex(int index) {
        return answers.get(index);
    }

    public String getAnswer() {
        Random random = new Random();
        return getAnswerAtIndex(random.nextInt(getLength()));
    }



}
