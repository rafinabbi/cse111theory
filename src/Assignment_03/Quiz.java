package Assignment_03;
//Lab5_Task11//
public class Quiz {
    public static void main (String[] args){
        Dog odie = new Dog("Red");
        Dog goofy = new Dog("Blue");
        odie.bark();
        goofy.bark();
        odie.changeColor("Brown");
        odie.bark();
    }
}
