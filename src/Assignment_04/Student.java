package Assignment_04;

public class Student {
    String name;
    static int course;
    static int b;
    Course c[]= new Course[11];
    public Student(String Name){
        System.out.println();
        this.name=Name;

    }
    public Student(String a,String c){

    }

    public void addCourse(Course c1, Course c2, Course c3, Course c4) {
        c[course +1]=c1;
        c[course +2]=c2;
        c[course +3]=c3;
        c[course +4]=c4;
        course = course +4;
    }
    public void addCourse(Course c1, Course c2, Course c3) {
        c[course +1]=c1;
        c[course +2]=c2;
        c[course +3]=c3;
        course = course +3;
    }

    public String getID() {
        return null;
    }

    public void completePreUni() {

    }

    public String isPreUni() {
        return null;
    }

    public boolean isNSU() {
    }

    public Object getName() {
        return null;
    }
    public int size(){

    }
}
