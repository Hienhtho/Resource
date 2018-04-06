package ClothingHo;

/**
 * @author Hien Ho
 * This is my Clothing class is known superclass or parent-class
 */
public class Clothing {
	private String Size;
	private String Color;
	
	public Clothing() {
		super();
	}
	public Clothing(String size, String color) {
		super();
		Size = size;
		Color = color;
	}

	public String getSize() {
		return Size;
	}

	public void setSize(String size) {
		Size = size;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	@Override
	public String toString() {
		return "Clothing [size=" + Size + ", color=" + Color + "]";
	}
	
	
	
}