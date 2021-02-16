public class AccountTest{
 public static void main(String[] arg){

Account gracey = new Account("game", 600.00);

	gracey.setName("GRACE");
	gracey.getName();
	gracey.deposit(1000);
System.out.printf("My account name is %s%n", gracey.getName());
System.out.printf(" My Account balance is %.2f%n", gracey.getBalance());



}




}