public class Main {
    public static void main(String[] args) {
        int meteorite = 0;
        for ( int year = 0; year <=2050; year++) {
            meteorite = 79 + meteorite;
            year = meteorite;
            if (meteorite > 1850 && meteorite < 2100)
        System.out.println(meteorite);
        }
    }
}