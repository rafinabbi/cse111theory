package Assignment_03;
//Lab5_Task8//
public class Teacher {
    public String name;
    public String department;
    String courses="";
    public Teacher(String Name, String Department) {
        this.department=Department;
        this.name=Name;
    }

    public void addCourse(Course c) {
        courses+=c.course +"\n";
    }

    public void printDetail() {
        System.out.println("========================");
        System.out.println("Name: "+name);
        System.out.println("Department: "+department);
        System.out.println("List of courses");
        System.out.println("========================");
        System.out.print(courses);
        System.out.println("========================");
    }
}
