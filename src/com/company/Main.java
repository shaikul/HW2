package com.company;


public class Main {

    public static void main(String[] args) {
        System.out.println(goWalk(22,-1));
        System.out.println(goWalk(65,+20));
        System.out.println(goWalk(18,-25));
        System.out.println(goWalk(35,-10));
        System.out.println(goWalk(80,+5));

    }

        public static String goWalk( int age, int temperature) {

            if (age > 20 && age < 45 && temperature > -20 || temperature < 30) {
                return "Можно идти гулять";
            }
             else if (age < 25 && temperature > 0 && temperature < 28) {
                return "Можно идти гулять";
            }
            if ( age > 45 && temperature > -0 && temperature < 25) {
                return "Можно идти гулять";
            }

            else{
                return "Оставайтесь дома";
            }

        }

    }


