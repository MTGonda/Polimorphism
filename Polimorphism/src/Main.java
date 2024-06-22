import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

       Movie theMovie = new Adventure("Star Wars");
       theMovie.watchMovie();

        Movie theMovie1 = Movie.getMovie("Science","Star Wars");
        theMovie1.watchMovie();

        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("Enter type A= Adventure, C= Comedy, S= Science fiction, or Q to quit: ");
            String type = scanner.nextLine();
            if("Qq".contains(type)) {
                break;
            }
            System.out.print("Enter Movie Title: ");
            String title = scanner.nextLine();
            Movie movie = Movie.getMovie(type,title);
            movie.watchMovie();
        }



    }
}