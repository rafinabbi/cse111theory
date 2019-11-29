package Test;

public class Series extends Media {
    public static int numberOfMedia;
    public int number;
   public Series (String name, String year, String rating,String seasons) {
        super(name, year, rating,seasons);
        this.numberOfMedia=numberOfMedia+1;
        this.number=numberOfMedia;
    }
    public String toString() {
        return "Number Of Series: "+this.number+"\n"+super.toString();
    }
}
