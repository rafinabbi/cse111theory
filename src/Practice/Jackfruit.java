package Practice;

public class Jackfruit extends Fruit {
//    private boolean formalin = false;
    String name;
    public Jackfruit(){
        super(true,"jackfruit");
    }

public String getName(){
    return "Jackfruit";
}
    public boolean hasFormalin(){
        return false;
    }
    public String toString(){
        return "Jackfruits are good for you";
    }

}
