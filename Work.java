import java.util.Scanner;
   public class Work{
   public static void main(String[] args){

   int guessNumber = 100;

   Scanner input = new Scanner(System.in);
   System.out.println("Guess your Number");
   int userGuess = input.nextInt();

   if(userGuess == guessNumber)
   System.out.println("You are Correct!");

   if (userGuess > guessNumber)
   System.out.print("Too High");

   if (userGuess < guessNumber)
   System.out.print("Too Low");


}



}