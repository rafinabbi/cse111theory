package Prep_b4_Final.check_casting;

public class Tester {
    public static void main(String[] args) {
        It it = new It();
        Graphics grp= new Graphics();
        Photoshop pht= new Photoshop();
        Illustrator ill= new Illustrator();
        WebDev wd=new WebDev();
        Php ph= new Php();
        Object it1 = new It();
        Object grp1= new Graphics();
        It pht2= new Photoshop();
        Graphics ill2= new Illustrator();
        Photoshop ill3= new Illustrator();
        //WebDev wd=new WebDev();
        WebDev ph2= new Php();
        Object ph3= new Php();
        System.out.println((Php)ph2);
    }
}
