package exercises.quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    private ArrayList<Question> questions = new ArrayList<>();
    private double correct = 0;
    private double totalQuestions = 0;
    Scanner scanner = new Scanner(System.in);

    public void addQuestion(Question aQuestion){
        questions.add(aQuestion);
    }

    public void runQuiz(){
        correct = 0;
        totalQuestions = questions.size();
        for(Question q : questions)
        {
            System.out.println(q.getDirections());
            System.out.println(q.getStatement());

            int count = 1;
            for(String s : q.getAnswers()) {
                System.out.println(count + ": " + s);
                count++;
            }
            if(scanner.nextLine().equals(q.getAnswer()))
            {
                System.out.println("correct");
                correct++;
            }
            else
            {
                System.out.println("incorrect");
            }
        }

        System.out.println("Correct answers: " + correct + " out of " +
                totalQuestions + "... Grade: " + (correct / totalQuestions) * 100 + "%");
    }
}
