package youtube;

import java.sql.SQLOutput;

public class Casting {
    public static void main (String [] args){
        double db = 150.112121;
        int result = (int) db;

        int i = 129;
        byte b = (byte) i;

        System.out.println("Result is " + b);
        System.out.println("Result is " +result);
        Integer integ = new Integer(500);

        int val = integ.intValue();

        System.out.println(val);
    }
}
