package com.company;

public class Main {
    public static void main(String[] args) {
        Chef boss = new Chef();
        Chef boss1 = new Chef();
        Teacher empl1 = new Teacher();
        Teacher empl2 = new Teacher();

        empl1.setInfo(1,"1993");
        empl1.setNames("Mariia", "Holubka");
        boss1.setInfo(2, "1975");
        boss1.setNames("Natalia", "Yurievna");
        empl2.setNames("Tania", "Vasilieva");
        empl2.setInfo( 3, "1980");

        empl1.getInfo();
        empl2.getInfo();

        boss.getInfo();
        boss.getInfoChef();
        boss1.getInfo();
        boss1.getInfoChef();

        }
    }