public class AirCon{
   private boolean isOn;
   private String productName;
   private int temperature = 15;


public void decreaseTemperature(){
	if(temperature > 15 && temperature >= 30)
	temperature --;
}

public String getProductName(){
       return productName;

}

public int getTemperature(){
       return temperature;

}

public void increaseTemperature(){
	if(temperature < 15 && temperature <= 30)
	temperature ++;

}

public boolean isOn(){
	return true;

}

public void setOn(){

}
public void setProductName(String prodName){
	productName = prodName;

}

public void setTemperature(){
}

}