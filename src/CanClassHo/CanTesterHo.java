package CanClassHo;

/**
 * @author Hien Ho
 * This is the main class to run all information from class CanHo
 * to follow formatting of output
 */
public class CanTesterHo {
	 public static void main(String[] args) {
		 	//Making new object
	        CanHo SWPeaches = new CanHo("S&W", "Peaches", 12.0, 2.39 );
	        CanHo GreenGiantGreenBeans = new CanHo ("Green Giant", "Green Beans");
	        CanHo DelMonteCreamedCorn = new CanHo ("Del Monte", "Creamed Corn",  13.4, 2.49);
	        CanHo Vegestable = new CanHo("Des Moines", "Mushroom", 6.0, 2.33);
	        CanHo Mexicanfood = new CanHo("Ankeny", "Tacco");
	        
	        //changing size and price of objects
	        GreenGiantGreenBeans.setSize(11.9);
	        GreenGiantGreenBeans.setPrice(1.79);
	        
	        //displaying the object
	        System.out.println("Can 1: " + SWPeaches.toString());
	        System.out.println("Can 2: " + GreenGiantGreenBeans.toString());
	        System.out.println("Can 3: " + DelMonteCreamedCorn);
	        System.out.println("Can 4: " + Vegestable.toString());
	        System.out.println("Can 5: " + Mexicanfood.toString());
	        
	 }
}

