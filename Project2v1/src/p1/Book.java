package p1;

public class Book {
private int itemNum;
private String description;
private int quantity;
private double price;
private double subtotal;
private static int countItemNum = 1;
public Book() {
	super();
}


public Book (String description,double price) {
	
	
	this.itemNum = countItemNum++;
	this.description = description;
	
	this.price = price;
	
	
}

public void getQuantity(int quantity) {
	this.quantity = quantity;
}
public int setQuantity() {
	return quantity;
}
public void getSubtotal(double d) {
	this.subtotal = d;
}
public double setSubtotal() {
	return subtotal;
}



public int getItemNum() {
	return itemNum;
}
public void setItemNum(int itemNum) {
	this.itemNum = itemNum;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}

public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}

@Override
public String toString() {
	return "MenuItem [itemNum=" + itemNum + ", description=" + description + ", quantity=" + quantity + ", price="
			+ price + ", subtotal=" + subtotal + "]";
}



}
