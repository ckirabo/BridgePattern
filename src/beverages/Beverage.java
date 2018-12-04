package beverages;

public abstract class Beverage {

	 //////Attributes/////////////
	 protected MakeHotBev HotBeverage; /* only subclasses can access this
	                                      can use interface names as a dataType
	                                      any object assigned to this must be an instance
	                                      of a class that implements it*/
	
	
	 //////Constructors///////////
     public Beverage(MakeHotBev VHotBeverage) {
    	 this.HotBeverage = VHotBeverage;
     }
	
	
	 //////Methods////////////////
     
	 public abstract void HotBevInfo(); 
	 
	 /* using abstract word instead of static as not a static method
	  * subclass must have this method do to abstract keyword*/
     
	 public MakeHotBev getHotBeverage() {
		 return this.HotBeverage;
	 }
	 
}
