package exercises.quiz;

import java.util.ArrayList;

public class TrueFalse extends Question {


    public TrueFalse(String aCorrectAnswer, String aQuestionStatement, ArrayList<String> aAnswerList){
        correctAnswer = aCorrectAnswer;
        questionStatement = aQuestionStatement;
        answerList = aAnswerList;
        directions = "True or False: Type 1 or 2 then hit enter";
    }

}
