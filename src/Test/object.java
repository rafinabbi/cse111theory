package Test;

public class object {
    static int i=1;
    static int x=0;
    static int y=99;
    public object(String x) {
        System.out.println("name: "+x);
    }

    public void rolladd(object a){
        x=this.i++;
        System.out.println("roll: "+x);
    }
    public void seatcapacity(object obji) {
        x=this.y--;
            System.out.println("seat remaining: "+x);
    }
}
