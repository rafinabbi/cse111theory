package Postmid;


public class Alfie extends John {
        String power = "Jewsish leader";
        public void method1() {
            super.method1();
            System.out.println("Gunman m1");
            System.out.println(this);
        }
        public void method3() {
            System.out.println("Gunman m2");
        }
    }
    class Arthur extends TommyShelby {
        String power = "Arthur Shelby";
        public void method1() {
            System.out.println("mercenary m1");
        }
        public void method2() {
            System.out.println("mercenary m2");
        }
        public void method3() {
            System.out.println("mercenary m3");
            method1();
        }
        public String toString(){
            return "The elder brother is "+ power;
        }
    }
    class John extends Arthur {
        String power = "hotShot";
        public void method1() {
            System.out.println("Jonny m1");
        }
        public void method4() {
            System.out.println("Jonny m4");
        }
        public String toString(){
            method2();
            return "Johny gets married because he is "+ power;
        }
    }
    class Polly extends TommyShelby {
        String power = "Polly Gray ";
        public void method2() {
            System.out.println("Polly m2");
        }
        public void method3() {
            System.out.println("Polly m3");
        }
        public String toString(){
            return "The Accountant is "+ power;
        }
    }
    class TommyShelby{
        String power = "Thomas Shelby";
        public void method1() {
            method2();
            System.out.println("Godfather m1");
        }
        public void method2() {
            System.out.println("Godfather m2");
        }
        public String toString(){
            method2();
            return "Godfather is"+ power;
        }
    }


