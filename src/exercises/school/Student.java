package exercises.school;

public class Student {

    private static int nextId = 1;
    private String name;
    private final int id;
    private int credits;
    private double GPA;

    public Student(String aName, int aCredits, double aGPA)
    {
        name = aName;
        id = nextId;
        credits = aCredits;
        GPA = aGPA;

        nextId++;
    }

    public Student(String aName)
    {
        this(aName, 0, 0.0);
    }

    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }

    public int getCredits(){
        return credits;
    }

    public double getGPA(){
        return GPA;
    }

    public void setName(String aName){
        name = aName;
    }

    public void setCredits(int aCredits){
        credits = aCredits;
    }

    public void setGPA(double aGPA){
        GPA = aGPA;
    }

    public void addGrade(int courseCredits, double grade){
        double old = credits*GPA;
        credits += courseCredits;
        GPA = (old + (courseCredits*grade)) / credits;
    }

    public String getGradeLevel(){
        String gradeLevel = "freshman";

        if(credits >= 30) {
            gradeLevel = "sophomore";
            if (credits >= 60) {
                gradeLevel = "junior";
                if (credits >= 90)
                    gradeLevel = "senior";
            }
        }

        return gradeLevel;
    }

    public String toString(){
        return name + " (Credits: " + credits + ", GPA: " + GPA + ")";
    }

    public boolean equals(Object o){
        boolean r;

        if(o == this)
            r = true;
        else if(o == null)
            r = false;
        else if(o.getClass() != getClass())
            r = false;
        else{
            Student student = (Student) o;
            r = student.getId() == id;
        }

        return r;
    }
}
