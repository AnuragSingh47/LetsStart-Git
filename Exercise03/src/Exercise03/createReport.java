package Exercise03;

public class createReport {
     

	public static void main(String[] args) {
		
           FoodItem item1 = new FoodItem("Milk","Walmart",7.86);
           FoodItem item2 = new FoodItem("Grapes","The Village Grocer",5.6);
           
           
           System.out.println("Product 1 Name : " + item1.getItemName());
           System.out.println("Product 1 Store Name : " + item1.getStoreName());
           System.out.println("Product 1 Price : $" + item1.getItemPrice());
            
           System.out.println("Item 1 Report : " + item1.createReport());
           System.out.println("Item 2 Report : " + item2.createReport());
           System.out.println( 5 + 5 / 3 * 2 >= 10 || !true && (33 < 45 - 33) );


	}

}
