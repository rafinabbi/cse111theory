package Test;


public class Movie extends Media{
    public static int numberOfMedia;
    public int number;
    public Movie(String name, String year, String rating,String seasons) {
        super(name, year, rating,seasons);
        this.numberOfMedia=numberOfMedia+1;
        this.number=numberOfMedia;
    }
    public String toString() {
        return "Number Of Movie: "+this.number+"\n"+super.toString();
    }
}
