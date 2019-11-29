package Test;



public class Driver {
    public static void main(String[] args) {

        Media anime1 = new Anime("Dragon Ball Z", "1996", "9", "It has only one part");
        Media series1 = new Series("Stranger Things", "2016", "9", "It has only one part");
        Media series2 = new Series("Unbelievable", "2019", "9", "It has only one part");
        Media movie1 = new Movie("Joker", "2019", "8", "It has only one part");
        Media movie2 = new Movie("Maleficent", "2014", "7", "It has only one part");
        Media anime2 = new Anime("Death Note", "2006", "9", "It has only one part");
        // anime.inputName();
        // series.inputName();
        // movie.inputName();
        System.out.println("Total anime: " + Anime.numberOfMedia);
        System.out.println("Total series: " + Series.numberOfMedia);
        System.out.println("Total movie: " + Movie.numberOfMedia);
        System.out.println();
        print(anime1);
        print(anime2);
        print(series1);
        print(series2);
        print(movie1);
        print(movie2);


        System.out.println("RECENT   UPDATES !!!\n");
        anime1.updateSeasons("It has 4 seasons");
        series1.updateSeasons("It has 3 seasons");
        movie2.updateSeasons("It has 2 seasons");
        anime1.newRating("8");
        series1.newRating("10");
        movie1.newRating("9");
        movie2.newRating("9.5");


        print(anime1);
        print(anime2);
        print(series1);
        print(series2);
        print(movie1);
        print(movie2);
    }

    public static void print(Media a) {
        System.out.println(a);
    }


}

