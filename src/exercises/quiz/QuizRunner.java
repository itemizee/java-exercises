package exercises.quiz;

import java.util.ArrayList;

public class QuizRunner {
    public static void main(String args[]){

        Quiz mathQuiz = new Quiz();

        ArrayList<String> answers = new ArrayList<>();
        answers.add("4");
        answers.add("5");
        answers.add("3");
        answers.add("2.5");
        MultipleChoice q = new MultipleChoice("1","What is 2 + 2?",answers);
        mathQuiz.addQuestion(q);

        ArrayList<String> a = new ArrayList<>();
        a.add("Sharks");
        a.add("Penguins");
        a.add("Golden Knights");
        a.add("Jets");
        MultipleChoice q2 = new MultipleChoice("3","Who is going to win the Stanley Cup?",a);
        mathQuiz.addQuestion(q2);

        ArrayList<String> a2 = new ArrayList<>();
        a2.add("True");
        a2.add("False");
        TrueFalse q3 = new TrueFalse("1","My name is Josh",a2);
        mathQuiz.addQuestion(q3);

        ArrayList<String> a3 = new ArrayList<>();
        a3.add("True");
        a3.add("False");
        TrueFalse q4 = new TrueFalse("2","Your name is Josh",a3);
        mathQuiz.addQuestion(q4);

        ArrayList<String> a11 = new ArrayList<>();
        a11.add("Sharks");
        a11.add("Penguins");
        a11.add("Kings");
        a11.add("Jets");
        Checkbox q5 = new Checkbox("124","Select all teams in the playoffs still",a11);
        mathQuiz.addQuestion(q5);

        ArrayList<String> a22 = new ArrayList<>();
        a22.add("Chess");
        a22.add("Barbie World");
        a22.add("Starcraft");
        a22.add("Hello kitty adventure island");
        Checkbox q22 = new Checkbox("13","Select all games i like",a22);
        mathQuiz.addQuestion(q22);

        mathQuiz.runQuiz();


    }
}
