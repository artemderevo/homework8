public class Main {
    public static void main(String[] args) {
        int meteorite = 0;
        for ( int year = 0; year <=2000; year++) {
            meteorite = 79 + meteorite;
            year = meteorite;
            System.out.println(meteorite);
        }
    }
}