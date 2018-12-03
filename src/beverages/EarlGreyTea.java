package beverages;

public class EarlGreyTea implements MakeHotBev {
	    //////Attributes/////////////
	
	
	
		//////Constructors///////////

		
		
		//////Methods////////////////
		@Override
		public void makeBeverage(String size, String milkType, int sugarAmount) {
			System.out.println("A " + size + "Earl Grey Tea with : " + milkType + 
					           " and " + sugarAmount + "of sugars");
		}
		
}
