public class Car extends Véhicule {

    public Car(String brand, int kilometer ) {  
	    super(brand,kilometer );

    }    

    @Override
    public String doStuff() {
        return "I am" + this.getBrand() + "and I go zoom zoom zoom!";
    }
    
}
