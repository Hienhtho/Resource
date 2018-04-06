package ClothingHo;

/**
 * @author Hien Ho
 * This is my Socks class which is subclass (child-class) of Clothing
 * I use 'boolean pair' to add more information in Socks class
 */
public class Socks extends Clothing{

	public Socks() {
		super();
	}
	public Socks(String size, String color) {
		super(size, color);
		setPair(true);
		
	}
	private boolean pair = true;
	public Socks(String size, String color, boolean pair) {
		super(size, color);
		this.pair = pair;
		setPair(pair);
	}
	public boolean isPair() {
		return pair;
	}
	public void setPair(boolean pair) {
		this.pair = pair;
	}
	
	@Override
	public String toString() {
		return "Socks [pair=" + pair + ", size = " + getSize() + ", color = " + getColor() + "]";
	}
	
	

	
	

}
