package Exercise03;

public class FoodItem {
   String itemName ;
   String storeName;
   double itemPrice;
 
   public FoodItem(String itemName,String storeName , double itemPrice) {
	   this.itemName = itemName;
	   this.storeName = storeName;
	   this.itemPrice = itemPrice;
   }
   
   public void setItemName(String itemName) {
	   this.itemName = itemName;
   }
   
   public String getItemName() {
	   return itemName;
   }
   
   public void setStoreName(String storeName) {
	   this.storeName = storeName;
   }
   
   public String getStoreName() {
	   return storeName;
   }
   
   public void setItemPrice(double itemPrice) {
	   this.itemPrice = itemPrice;
   }
   
   public double getItemPrice() {
	   return itemPrice;
   }
   
   public String createReport() {
	   return itemName + "," + storeName + "," + itemPrice;
   }
   
}