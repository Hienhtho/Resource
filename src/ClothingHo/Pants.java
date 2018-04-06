package ClothingHo;

/**
 * @author Hien Ho
 * This is my Pants class which is subclass (child-class) of Clothing
 * This just shows 'size' and 'color' of Pants class
 */
public class Pants extends Clothing{
	private String type;

	public Pants() {
		super();
	}
	public Pants(String size, String color) {
		super(size, color);
	}

	public Pants(String type) {
	super();
	this.type = type;
}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "Clothing [size = "+ getSize() + ", color = "+ getColor() + ", type = "+ getType()+"]";
	}
	
	
}
