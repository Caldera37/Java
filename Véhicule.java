public abstract class Véhicule {
  
    // attributes
    private String brand;  
    private int kilometer;  
  
    // constructors
    public Véhicule(String brand, int kilometer) {  
        this.brand = brand;  
        this.kilometer = kilometer;  
    }  
  
    // getters and setters
    public String getBrand() {  
        return this.brand;  
    }  
  
    public void setBrand(String brand) {  
        this.brand = brand;  
    }  
  
    public int getKilometer() {  
        return this.kilometer;  
    }  
  
    public void setKilometer(int kilometer) {
        this.kilometer = kilometer;
    }

    // methods
    public abstract String doStuff();
}