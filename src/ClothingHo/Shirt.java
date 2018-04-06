package ClothingHo;

/**
 * @author Hien Ho
 * This is my Shirt class which is subclass (child-class) of Clothing
 * This shows 'size' and 'color' of shirt and add 'style'
 */
public class Shirt extends Clothing {
	private String Style;
	
	public Shirt() {
		
	}
	public Shirt(String size, String color) {
		setColor( color);
		setSize(size);
		
	}
	public Shirt(String style) {
		super();
		Style = style;
	}
		
	public String getStyle() {
		return Style;
	}
	public void setStyle(String style) {
		Style = style;
	}
	@Override
	public String toString() {
		return "Shirt [style=" + Style + ", size= " + getSize() + ", color= " + getColor() + "]";
	}
		
	@Override
	public void setSize(String size) {
		if ((size.equals("S")||size.equals("M")||size.equals("L")||size.equals("XL"))){
			super.setSize(size); 
		}
	}

}
