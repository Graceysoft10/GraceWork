public class Account{

  private String name;

  private double balance;

public Account(String name, double newBalance){
	this.name = name;	
	if(balance > 0.0 )
	balance = newBalance;

  
}  

public void deposit(double depositAmount){
	balance = depositAmount + balance ;


}

public double getBalance(){
	return balance;

}

public void setName(String newAccName){
	name = newAccName;


}

public String getName(){
	return name;

public double withdraw(){
	return withdraw;
}

}

  




