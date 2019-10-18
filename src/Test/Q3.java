package Test;

public class Q3{
    public static void main(String args[]){
        Test3.methodA();
    }
}
 class Test3{
    public static int sum;
    public static int y;

    public static void methodA(){
         int x=2;
         int y =3;
        int [] msg = new int[1];
        msg[0] = 3;
        y = Test3.y + msg[0];
        methodB(msg, msg[0]);
        x = Test3.y + msg[0];
        sum = x + y + msg[0];
        System.out.println(x + " " + y+ " " + sum);
    }

    private static void methodB(int[] mg2, int mg1){
        int x = 0;
        y = y + mg2[0];
        x = x + 33 + mg1;
        sum = sum + x + y;
        mg2[0] = y + mg1;
        mg1 = mg1 + x + 2;
        System.out.println(x + " " + y+ " " + sum);
    }
}
