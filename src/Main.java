import java.time.LocalDate;

public class Main {
    public static final int nowYear = LocalDate.now().getYear();
    public static void main(String[] args) {
        int meteorite = 0;
        int startYear = nowYear - 200;
        int finalYear = nowYear + 100;
        for (int year = 0; year <= 2022; year++) {
            meteorite = 79 + meteorite;
             if (meteorite >= startYear && meteorite <= finalYear) {
                 System.out.println(meteorite);
             }




        }
    }
}