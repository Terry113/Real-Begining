package p1.application;

public class LibraryObj {
	private String title;
	private double price;
	@Override
	public String toString() {
		return "LibraryObj [title=" + title + ", price=" + price + "]";
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public LibraryObj(String title, double price) {
		super();
		this.title = title;
		this.price = price;
	}
	
	
}
