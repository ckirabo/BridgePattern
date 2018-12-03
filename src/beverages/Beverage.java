package beverages;

public abstract class Beverage {

	 //////Attributes/////////////
	 protected MakeHotBev makeHotBev; /* only subclasses can access this*/
	
	
	 //////Constructors///////////
     public Beverage(MakeHotBev VmakeHotBev) {
    	 this.makeHotBev = VmakeHotBev;
     }
	
	
	 //////Methods////////////////
     
	 public abstract void drinkInfo(); 
	 
	 /* using abstract word instead of static as not a static method*/
     
	
}
