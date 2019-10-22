package Practice;

 class Avenger {
    private String name = "";
    private String power = "";
    public Avenger(){
        System.out.println("Super hero name and power need to be set.");
    }
     public Avenger(String n){
         System.out.println("Power for "+n+" needs to be set.");
         this.name=n;
     }
     public Avenger(String n,String p){
         System.out.println(n+" is ready to attack.");
         this.name=n;
         this.power=p;
     }
    public void setName(String n){
        this.name=n;
    }
    public void setPower(String p){
        this.power=p;
    }
    public void attack(){
        System.out.println(name+"*is*"+power+"ing");
    }
}
public class Midterm {
    public static void main (String[] args) {
        Avenger tony = new Avenger();
        tony.setName("Iron Man");
        tony.setPower("blast");
        Avenger natasha = new Avenger("Black Widow");
        natasha.setPower("shoot");
        Avenger bruce = new Avenger("Hulk", "smash");
        Avenger steve = new Avenger("Captain America", "punch");
        System.out.println("*****************");
        tony.attack();
        natasha.attack();
        bruce.attack();
        steve.attack();
    }
}
