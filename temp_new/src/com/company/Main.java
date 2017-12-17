package com.company;

public class Main {
    public static void main(String[] args) {
        Chef boss = new Chef();
        Chef boss2 = new Chef();
        Teacher empl_1 = new Teacher();
        Teacher empl_2 = new Teacher();

        empl_1.setInfo(1,"1993");
        empl_1.setNames("Mariia", "Holubka");

        boss.setInfo(2, "1975");
        boss.setNames("Natalia", "Yurievna");

        empl_2.setNames("Tania", "Vasilieva");
        empl_2.setInfo( 3, "1980");

        empl_1.getInfo();
        empl_2.getInfo();

        boss.getInfo();
        boss.getInfoChef();
        boss.getInfo();

        boss2.firstName = boss.firstName;
        boss2.lastName = boss.lastName;
        boss2.setInfo(2, "2000");

        boss2.getInfo();
        boss2.getInfoChef();

    }
}