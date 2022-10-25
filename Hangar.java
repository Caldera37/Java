public class Hangar {

    public static void main(String[] args) {
        
        Car clio = new Car(" clio ", 25000);

        Boat yacht = new Boat(" yacht ", 15000);

        System.out.println(clio.doStuff());
        System.out.println(yacht.doStuff());
       

    }
    
}
