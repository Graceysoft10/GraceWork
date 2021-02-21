import java.util.Scanner;
public class RootOfQuadraticEquation{
 public static void main(String [] args){
	double firstRoot = 0 , secondRoot = 0;
Scanner loi = new Scanner(System.in);
System.out.println("Enter the value of a");
double a = loi.nextDouble();

System.out.println("Enter the value of b");
double b = loi.nextDouble();

System.out.println("Enter the value of c");
double c = loi.nextDouble();

double discriminant = (b*b)-(4*a*c);
double sqrt = Math.sqrt(discriminant);

if (discriminant > 0){
	firstRoot = (-b + sqrt)/(2 * a);
	secondRoot = (-b - sqrt)/(2 * a);
System.out.println("Roots are " +  firstRoot  +  " and "  + secondRoot);

if(discriminant == 0){
System.out.println("Root is  " + (-b + sqrt)/(2 * a) );




}




}







}




}