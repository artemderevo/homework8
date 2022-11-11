public class Main {
    public static void main(String[] args) {
        int meteorite = 0;
        for ( int year = 0; year <=2122; year++) {
            meteorite = 79 + meteorite;
            year = meteorite;
            if (meteorite > 1822 && meteorite < 2122)
                System.out.println(meteorite);
        }

    }
}
