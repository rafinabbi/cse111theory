package Assignment_03;
//Lab5_Task7//
public class StudentT {
    private String name;
    static int numberOfStudents;
    public StudentT(){
        this.name="default name";
        numberOfStudents++;
    }
    public StudentT(String name){
        this.name=name;
        numberOfStudents++;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
