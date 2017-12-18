package youtube;

//this is the actual program
public class InheritanceProgram {
    public static void main (String [] args){
        GymDrops Red = new GymDrops();
        GymDrops Green =  new GymDrops();

        Red.givemeGym1();
        Red.SugarAmount = 10;
        Red.getSugarAmount();

        Green.givemeGym2();
        Green.SugarAmount = 45;
        Green.getSugarAmount();


    }
}
