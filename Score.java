import java.util.Scanner;
public class Score{
public static void main(String [] args){
	
Scanner space = new Scanner(System.in);


System.out.println("Enter your Score");
double userScore = space.nextDouble();

if(userScore< 40  ){
System.out.println("you failed!");
}


if(userScore> 40){
System.out.println("you passed!");


}


}




}