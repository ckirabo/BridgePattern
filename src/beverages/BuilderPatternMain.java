package beverages;

public class BuilderPatternMain {

	public static void main(String[] args) {
		Beverage GreenTea = new Tea(new GreenTea(), "Large" , "Soy Milk", 5 );
		Beverage EarlGrey = new Tea(new EarlGreyTea(), "Medium","No Milk",1 );
		
		GreenTea.HotBevInfo();
		EarlGrey.HotBevInfo();
		
		

	}

}
