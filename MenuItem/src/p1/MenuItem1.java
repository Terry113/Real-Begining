package p1;

public class MenuItem1 {
private int itemNum;
private String description;
private int quantity;
private double price;
private double subtotal;
public MenuItem1() {
	super();
}


public MenuItem1(int itemNum, String description,double price) {
	
	
	this.itemNum = itemNum;
	this.description = description;
	this.quantity = 1;
	this.price = price;
	this.subtotal = quantity * price;
	
}

public int getQuantity() {
	return quantity;
}


public void setQuantity(int quantity) {
	this.quantity = quantity;
}

public void setSubtotal() {
	subtotal = 1.0 * quantity * price;
}
public double getSubtotal() {
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
