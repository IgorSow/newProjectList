package cinema;

public class CinemaHall {

    private String name;
    private String[][] hall;
    private int row;
    private int col;


    public CinemaHall(String name, int row, int col) {
        this.name = name;
        this.hall = new String[row][col];
      buildHall();
    }

    private void buildHall(){

        for (int i=0; i < hall.length; i++ ){
            for (int j=0 ; j <hall[i].length; j++){

                hall[i][j] = "FREE";
            }
        }
    }

    public void showHall(){
        for (int i=0; i < hall.length; i++ ){

            System.out.println(" ");
            System.out.print("ROW\t" + i);
            for (int j=0 ; j <hall[i].length; j++){

                System.out.print("\t" + hall[i][j]);
            }
        }
    }
    public void bookPlace(int row,int col){

        hall[row][col] = " BOOKED";
    }



}
