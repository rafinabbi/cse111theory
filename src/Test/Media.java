package Test;


import java.util.Scanner;

public class Media {
    Scanner bob=new Scanner(System.in);
    String  name;
 // String numberOfMedia;
    String rating;
    String yearOfRelease;
    String seasons;


    public Media(String name, String year, String rating,String seasons){
        this.name=name;
        this.yearOfRelease=year;
        this.rating=rating;
        this.seasons=seasons;
    }
    public void updateSeasons(String seasons){
      this.seasons=seasons;
    }

    public String toString() {
        return "Name: "+this.name+"\nYear Of Release: "+this.yearOfRelease+"\nRating: "+this.rating+"\nSeasons:"+this.seasons+"\n";
    }

    public void newRating(String rating) {
        this.rating=rating;
    }
}
