package cinema;

public class Main {

    public static void main(String[] args) {
        CinemaHall cinemaHall1 = new CinemaHall("PINOKJO", 5,10);
        cinemaHall1.showHall();

        cinemaHall1.bookPlace(4,6);
        cinemaHall1.showHall();
    }
}
