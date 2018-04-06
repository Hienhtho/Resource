package ClothingHo;

/**
 * @author Hien Ho
 * This is my main class for testing Clothing
 */
public class ClothingTester {
	 public static void main(String[] args) { 

		 // Test super class only 
		 Clothing suit = new Clothing(); 
		 Clothing jersey = new Clothing("medium", "blue"); 
		 System.out.println("clothing 1:" + suit); 
		 System.out.println("clothing 2:" + jersey); 
		 System.out.println(); 

		 // Test shirt class 
		 Clothing blueShirt = new Shirt("medium", "blue"); // sets size to null since not S, M, L or XL 
		 Shirt pinkShirt = new Shirt("Short Sleeves"); // shirt class has one field called style  
		 pinkShirt.setColor("Pink"); 
		 pinkShirt.setSize("M"); 
		 System.out.println("blueShirt " + blueShirt);  
		 System.out.println("pinkShirt " + pinkShirt); 
		 System.out.println(); 

		 // Test pants class 
		 Pants blackPants = new Pants(); 
		 Pants blueJean = new Pants("Jean");
		 blackPants.setColor("Black"); 
		 blackPants.setSize("M"); 
		 System.out.println("blackPants " + blackPants); 
		 System.out.println("blueJean " + blueJean); 
		 System.out.println(); 

		 // Test sock class 
		 Clothing purpleSocks = new Socks("9-10", "Purple"); // socks has field pair, boolean default true in this constructor 
		 Socks greenSock = new Socks("7-8", "Green" ,false); 
		 Socks whiteSock = new Socks("6-7", "White", true);
		 System.out.println("whiteSocks" + whiteSock);
		 System.out.println("purpleSocks " + purpleSocks); 
		 System.out.println("greenSocks " + greenSock); 
		 

		 }
}
