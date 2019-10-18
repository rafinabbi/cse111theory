package Assignment_03;
//Lab5_Task12//
public class Cat {

    public String color = "White";
    public String action = "sitting";

    public Cat(){
        this.color= "White";
        this.action = "sitting";
    }

    public Cat(String c){
        this.color=c;
    }

    public Cat(String c, String a){
        this.color=a;
        this.action=c;
    }
    public void printCat(){
        // System.out.println(this.action + " cat is " + this.color);
        System.out.println(this.color + " cat is " + this.action);
    }
    public void changeColor(String d){
        this.color=d;
    }

}