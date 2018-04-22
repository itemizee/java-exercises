package exercises.school;

import java.util.ArrayList;

public class Course {
    private static int nextId = 1;

    private final int id;
    private String name;
    private int credits;
    private ArrayList<Student> students = new ArrayList<>();

    public Course(String aName, int aCredits){
        id = nextId;
        name = aName;
        credits = aCredits;

        nextId++;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getCredits(){
        return credits;
    }

    public ArrayList<Student> getStudents(){
        return students;
    }

    public void setName(String aName){
        name = aName;
    }

    public void setCredits(int aCredits){
        credits = aCredits;
    }

    public void addStudent(Student aStudent){
        students.add(aStudent);
    }

    public boolean equals(Object o)
    {
        boolean r;

        if(o == this)
            r = true;
        else if(o == null)
            r = false;
        else if(o.getClass() != getClass())
            r = false;
        else {
            Course course = (Course) o;
            r = course.getId() == id;
        }

        return r;
    }

    public String toString(){
        String string = name + "(Credits: " + credits + ")\n\nStudents enrolled: \n";

        for(Student s : students)
            string += s.getName() + "\n";

        return string;
    }

}
