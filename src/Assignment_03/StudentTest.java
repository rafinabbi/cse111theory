package Assignment_03;
//Lab5_Task7//
public class StudentTest{
    public static void main(String [] args){
        StudentT s1 = new StudentT();
        System.out.println(s1.getName());

        StudentT s2 = new StudentT("Matin");
        System.out.println(s2.getName());

        StudentT s3 = new StudentT("Saad");
        System.out.println(s3.getName());
        System.out.println(StudentT.numberOfStudents);
    }
}
