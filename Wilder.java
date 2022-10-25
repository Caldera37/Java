public class Wilder {

    private String firstname;
    private boolean aware;

    public Wilder(String firstname, boolean aware) {
        this.firstname = firstname;
        this.aware = aware;
    
    }

    public String getFirstname() {
        return this.firstname;
    }

    public boolean isAware() {
        return this.aware;
    }


    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

     public void setAware(Boolean aware) {
        this.aware = aware;
    }

    public String whoAmI() {

        if (isAware() == true) {

            return "Je m'appelle " + this.getFirstname() + " and I'm aware ";

        } else {

            return "Je m'appelle " + this.getFirstname() + " and I'm not aware ";

        }
    }
}
