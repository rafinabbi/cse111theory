package Assignment_02;

    import java.util.Scanner;

    public class Task01 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            int x = 10;
            int y = 4;
            double z = 1.5;
            Add aa= new Add();
            Sub su= new Sub();   //The README file says, you cannot make changes to the main(). Your OOP is appreciated!:) 
            Multiply mul= new Multiply();
            Worker01 w = new Worker01();

            System.out.println(w.doubleIt(x)); //20
            System.out.println(w.doubleIt(y)); //8

            int a = aa.add(x,y);
            System.out.println(a); //14

            double e = aa.add(x,z);
            System.out.println(e); //11.5

            double f = aa.add(x,z,y);
            System.out.println(f); //15.5

            int b = mul.multiply(x,y);
            System.out.println(b); //40

            int c = su.subtract(x,y);
            System.out.println(c); //6

            int d = su.subtract(y,x);
            System.out.println(d); //6

            System.out.println(w.calculate(x,y,y)); //Result is 10
            System.out.println(w.calculate(y,x,x)); //Result is 4
            System.out.println(makeMeme()); //*genius meme face. When you finally complete one task of this assignment.

        }
        public static String makeMeme(){
            return (":V");
        }

    }
