package Test;


public class Anime extends Media{
   public static int numberOfMedia;
    public int number;
    public Anime(String name, String year, String rating,String seasons) {
        super(name, year, rating,seasons);
         this.numberOfMedia=numberOfMedia+1;
         this.number=numberOfMedia;
        }


    public String toString() {
        return "Number Of Anime: "+this.number+"\n"+super.toString();
    }
}

