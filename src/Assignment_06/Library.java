package Assignment_06;

import java.util.Scanner;

public class Library {
Scanner s= new Scanner(System.in);
    String etaki;
    String name;
    String progress;
    String rating;
    String favchar;

    public Library(String etaki,String name ,String progress, String rating,String favchar) {
        this.etaki=etaki;
        this.name=name;
        this.progress=progress;
        this.rating=rating;
        this.favchar=favchar;

    }



    @Override
    public String toString() {
        return "====Library====\n" +
                "etaki='" + etaki + '\'' +
                "|| name='" + name + '\'' +
                "|| progress='" + progress + '\'' +
                "|| rating='" + rating + '\'' +
                "|| favchar='" + favchar + '\'';
    }
    public void replace(String a){
        if(a.equals("etaki") ){
            this.etaki=s.nextLine();
            System.out.println(etaki);
        }
        if(a.equals("name")){
            this.name=s.nextLine();
            System.out.println(name);
        }
        if(a.equals("progress")){
            this.progress=s.nextLine();
            System.out.println(progress);
        }
        if(a.equals("rating")){
            this.rating=s.nextLine();
            System.out.println(rating);
        }
        if(a.equals("favchar")){
            this.favchar=s.nextLine();
            System.out.println(favchar);

        }

    }

    public void print() {
        System.out.println(toString());
    }

    public void delete(String a){

        if(a.equals("etaki") ){
            this.etaki=null;
            System.out.println(etaki);
        }
        if(a.equals("name")){
            this.name=null;
            System.out.println(name);
        }
        if(a.equals("progress")){
            this.progress=null;
            System.out.println(progress);
        }
        if(a.equals("rating")){
            this.rating=null;
            System.out.println(rating);
        }
        if(a.equals("favchar")){
            this.favchar=null;
            System.out.println(favchar);

        }
    }
}
