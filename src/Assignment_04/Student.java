package Assignment_04;

public class Student {
    public int scourse=0;
    String name;
    String type_of_student;
//    int course;
    static int arr;
    static int id=-1;
    static int count;
    int id2;
    SizePrinter course = new SizePrinter();
    Course c[]= new Course[11];
    public Student(String Name){
        this.name=Name;
        count++;
        id++;
        id2=id;
//        if(count==1){
////        this.id++;
//            System.out.println("Name: "+this.name);
//            System.out.println("ID: "+"0");
//            System.out.println("University: "+"null");
//            System.out.println("List of Courses: ");
//            for (int i = 0; i <4 ; i++) {
//                System.out.println("List of Courses: "+c[i]);
//            }
//        }
//        else{
//            this.id++;
//            System.out.println("Name: "+this.name);
//            System.out.println("ID: "+this.id);
//            System.out.println("University: "+"null");
//            System.out.println("List of Courses: ");
//            for (int i = 0; i <4 ; i++) {
//                System.out.println("List of Courses: "+c[i]);
//            }
//        }
    }
    public String toString(){
        return "Name: "+this.name+"\n"+"ID: "+"0"+"\n"+"Regular Student"+"\n"+"University: "+"null"+"\n"+"List of Courses: "+c[0]+" "+c[1]+" "+c[2]+" "+c[3]+"\n";
    }
    public Student(String Name,String type_of_student){
        scourse++;
        this.name=Name;
        this.type_of_student=type_of_student;
        this.id++;
        id2=id;
    }

    public void addCourse(Course c1, Course c2, Course c3, Course c4) {
        this.c[scourse++]=c1;
        this.c[scourse++]=c2;
        this.c[scourse++]=c3;
        this.c[scourse++]=c4;
        course.course+=4;
    }
    public void addCourse(Course c1, Course c2, Course c3) {
        this.c[scourse++]=c1;
        this.c[scourse++]=c2;
        this.c[scourse++]=c3;
        course.course+=3;
    }

    public int getID() {
        return this.id2;
    }


    public void completePreUni() {
        this.type_of_student="";
    }

    public boolean isPreUni() {
        if(this.type_of_student=="Pre-Uni"){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isNSU() {
        if(University.name=="Brac University"){
            return false;
        }
        else{
            return true;
        }
    }

    public String getName() {
        return this.name;
    }

}
