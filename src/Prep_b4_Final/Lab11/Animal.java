package Prep_b4_Final.Lab11;


abstract public class Animal {
    //Name of the Animal
    private String name;

    //Constructor
    Animal(String _name){
        this.name = _name;
    }

    //Return name
    protected String getName(){
        return name;
    }
}
//Driver class
 class AnimalTorture {

    private void hugAnimal(SoundSource a){
        a.makeSound();
    }

    public static void main(String[] args) {
        Dog d = new Dog("Rover");
        AnimalTorture at = new AnimalTorture();
        at.hugAnimal(d);
    }
}
//Interface for making sound.
 interface SoundSource {
    public void makeSound();
}
class Dog extends Animal implements SoundSource {
    Dog(String a){
        super(a);
    }

    public void makeSound() {
        System.out.println(getName()+" is crying");
    }
}

