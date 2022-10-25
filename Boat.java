public class Boat extends Véhicule {

    public Boat(String brand, int kilometer ) {  
	    super(brand, kilometer);
    }    

    @Override
    public String doStuff() {
        return "I am" + this.getBrand() + "and I go glug glug!";
    }
    
}
