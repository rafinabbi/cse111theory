package Assignment_03;
//Lab5_Task11//
public class Dog {
    private String color = "Black";

    public Dog(String s) {
        this.color=s;
    }

    public void bark() {
        System.out.println(this.color +" dog is barking ");
    }

    public void changeColor(String b) {
        this.color=b;
    }
}

