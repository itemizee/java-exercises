package exercises.quiz;

import java.util.ArrayList;

public class Checkbox extends Question{


    public Checkbox(String aCorrectAnswer, String aQuestionStatement, ArrayList<String> aAnswerList){
        correctAnswer = aCorrectAnswer;
        questionStatement = aQuestionStatement;
        answerList = aAnswerList;
        directions = "Checkbox: Pick all answers that are correct.  " +
                "Type all numbers in ascending order, then hit enter. Example: if 1, 2 and 3, are correct... type 123 then hit enter";
    }

}
