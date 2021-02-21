public class Invoice{
 private int partNumber;
 private String partDescription;
 private int quantityOfItemProduct;
 private double pricePerItem;
 private double invoiceAmount;

public Invoice(int partNumber, String partDescription, int quantityOfItemProduct, double pricePerItem){

}

public void setPartNumber(int partNumber){
	this.partNumber = partNumber;
}

public void setPartDescription(String partDescription){
	this.partDescription = partDescription;

}

public void setQuantityOfItemProduct(int QuantityOfItemProduct){
	this.quantityOfItemProduct = quantityOfItemProduct;

} 

public void setPricePerItem(double pricePerItem){
	pricePerItem = pricePerItem;

}

public int getPartNumber(){
	return partNumber;

}

public String getPartDescription(){
	return partDescription;

}

public int getQuantityOfItemProduct(){
	return quantityOfItemProduct;
}
public double getPricePerItem(){
	return pricePerItem;
} 

public double getInvoiceAmount(){
	return invoiceAmount;
}




}