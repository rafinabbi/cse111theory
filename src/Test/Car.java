package Test;

public class Car {
    public String carmaker;
    public String carmodel;
    String count;
    public Car(String carmaker,String carmodel){
        this.carmaker=carmaker;
        this.carmodel=carmodel;
        count="z";
    }
    public Car(String carmaker){
        this.carmaker=carmaker;
        count="y";
    }
    public Car(){
        count="x";
    }
//    public boolean equals(Object obj){
//        return true;
//    }
    public void start() {
        if(count=="x"){
            System.out.println("Car is Starting");
        }
        if(count=="y"){
            System.out.println("Car make "+ carmaker + " is strating");
        }
        if(count=="z"){
            System.out.println("Car make"+ carmaker +", model:"+carmodel+ " is strating");
        }
    }
}

