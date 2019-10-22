package Assignment_04;

public class University {
    static String name;
    boolean hascampus;
    int count;
    int totalstudent;
    Student s[]= new Student[11];
    public University(String name) {
        this.name=name;
    }

    public University(String name, boolean hasCampus) {
        this.name=name;
        this.hascampus=hasCampus;
    }
    public void add(Student s) {
        this.s[count++]=s;
        totalstudent++;
    }

    public boolean needCampus() {
        if(this.hascampus==true){
            return false;
        }
        else{
            return true;
        }
    }
    public String toString(){
        return "University{name='BRAC University', hasCampus="+this.hascampus+"}";
    }

    public int totalStudents() {
        return totalstudent;
    }
}
