package CanClassHo;

/**
 * @author Hien Ho
 * This program will format all information of Can like company, content, size, price
 * using constructors, getters and setters to set up
 */

public class CanHo {
		private String Company;
		private String Content;
		private double Size;
		private double Price;
/**
 * Default constructor
 */
	public CanHo() {
			
		}
	
/**
 * constructor just use two items
 * @param company
 * @param content
 */
	public CanHo(String company, String content) {
		Company = company;
		Content = content;
	}
/**
 * constructor use all the items
 * @param company
 * @param content
 * @param size
 * @param price
 */
	public CanHo(String company, String content, double size, double price) {
		Company = company;
		Content = content;
		Size = size;
		Price = price;
	}

	public String getCompany() {
		return Company;
	}

	public void setCompany(String company) {
		Company = company;
	}

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}

	public double getSize() {
		return Size;
	}

	public void setSize(double size) {
		Size = size;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		Price = price;
	}

	@Override
	public String toString() {
		return "CanHo [Company=" + Company + ", Content=" + Content + ", Size=" + Size + ", Price=" + Price + "]";
	}
	
	
}