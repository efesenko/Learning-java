package youtube;

public class Athlete {
    int snatchPR;
    String name;
    String country;
    public void getSnatchPR (){
        System.out.println(this.name +" snatch PR is " + this.snatchPR);
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void getCountry() {
        System.out.println("Country is " + this.country);
    }
}
