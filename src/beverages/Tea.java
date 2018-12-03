package beverages;

public class Tea extends Beverage {

	    //////Attributes/////////////
	    private String size;
	    private String milkType;
	    private int sugarAmount;
	
		//////Constructors///////////
	
 	public Tea (MakeHotBev VmakeHotBev, String Vsize, String VmilkType, int VsugarAmount ) {
		super(VmakeHotBev);
		this.size = Vsize;
		this.milkType = VmilkType;
		this.sugarAmount = VsugarAmount;
		
	}

		
		//////Methods////////////////
		
	@Override
	public void drinkInfo() {
		// TODO Auto-generated method stub
		
		
	}
	
}
