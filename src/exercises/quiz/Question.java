package exercises.quiz;

import java.util.ArrayList;

public class Question {
    public String correctAnswer;
    public String questionStatement;
    public ArrayList<String> answerList;
    public String directions;

    public String getStatement(){
        return questionStatement;
    }

    public ArrayList<String> getAnswers(){
        return answerList;
    }

    public String getAnswer(){
        return correctAnswer;
    }

    public String getDirections(){
        return directions;
    }
}
