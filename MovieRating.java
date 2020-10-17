import java.util.Scanner;

class MovieRating {
    public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);

      System.out.println("Please enter the movie name");

      String text = scan.nextLine();

      System.out.println("Please enter the running time in minutes.");

      int time = scan.nextInt();
      
      int hrs = time/60;
      int min = time%60;

      System.out.println("Please enter ratings from the movie review website.");

      int w1 = scan.nextInt();
      int w2 = scan.nextInt();
      int w3 = scan.nextInt();

      double wav = ((double)w1 + (double)w2 + (double)w3) / 3;

      System.out.println("Please enter ratings from the focus group.");

      double foc1 = scan.nextDouble();
      double foc2 = scan.nextDouble();

      double focav = (foc1 + foc2) / 2;

      System.out.println("Please enter the average movie critic rating.");

      double critic = scan.nextDouble();

      double over = (wav* 0.2 + focav* 0.3 + critic*0.5);

      System.out.println("Title: " + text);
      
      System.out.println("Running time: " + hrs + "h" + min);

      System.out.println("Average website rating: " + wav );

      System.out.println("Average focus group rating: " + focav);

      System.out.println("Average movie critic rating: " + critic);

      System.out.println("Overall movie rating: " + (int)(over + 0.5));






        
        

    }
}