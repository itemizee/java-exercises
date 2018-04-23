package exercises.quiz;

import java.util.ArrayList;

public class MultipleChoice extends Question {


    public MultipleChoice(String aCorrectAnswer, String aQuestionStatement, ArrayList<String> aAnswerList){
        correctAnswer = aCorrectAnswer;
        questionStatement = aQuestionStatement;
        answerList = aAnswerList;
        directions = "Multiple Choice: Pick one answer and type the corresponding number, then enter.";
    }

}
