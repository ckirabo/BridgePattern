package beverages;

public class Tea extends Beverage {

	    //////Attributes/////////////
	    private String size;
	    private String milkType;
	    private int sugarAmount;
	
		//////Constructors///////////
	
 	public Tea (MakeHotBev VHotBeverage, String Vsize, String VmilkType, int VsugarAmount ) {
		super(VHotBeverage);
		this.size = Vsize;
		this.milkType = VmilkType;
		this.sugarAmount = VsugarAmount;
		
	}

		
		//////Methods////////////////
		@Override
	public void HotBevInfo() {
		System.out.print("A Hot drink has beeen made: ");
		HotBeverage.makeBeverage(size, milkType, sugarAmount); //uses interface method
	}
	
}
