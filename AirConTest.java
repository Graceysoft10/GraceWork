public class AirConTest{
 public static void main(String[] args){

   AirConditioner gracey = new AirConditioner();

	gracey.setProductName("Virony");
	gracey.getProductName();
	gracey.setTemperature();
	gracey.getTemperature();
	gracey.increaseTemperature();
	gracey.decreaseTemperature();
	gracey.isOn();
	gracey.setOn();

System.out.printf("The name of my air condition is %s%n" ,gracey.getProductName());
System.out.printf("The temperature of my air condition is %d%n" ,gracey.getTemperature());


}



}