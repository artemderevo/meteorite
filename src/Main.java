public class Main {
    public static void main(String[] args) {
        int meteorite = 0;
        int year200 = 2022 - 200;
        int year100 = 2022 + 100;
        for (int year = 0; year <= 2022; year++) {
            meteorite = 79 + meteorite;
            year = meteorite;
             if (meteorite >= year200 && meteorite <= year100) {
                 System.out.println(meteorite);
             }




        }
    }
}