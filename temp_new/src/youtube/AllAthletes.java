package youtube;

public class AllAthletes {
    public static void main(String[] args) {
        Athlete Sara = new Athlete();
        Sara.name = "Sarah";
        Sara.snatchPR = 120;

        Sara.setCountry("Iceland");

        Sara.getSnatchPR();
        Sara.getCountry();



    }
}


