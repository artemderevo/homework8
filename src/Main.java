public class Main {
    public static void main(String[] args) {
        int populationY = 12_000_000;
        int yearFertility = 17 * (populationY / 1000);
        int yearMortality = 8 * (populationY / 1000);
        int year = 0;
        while (year < 10) {
            year = year + 1;
            populationY = populationY + yearFertility - yearMortality;
            System.out.println("Год " + year + " численность населения составляет " + populationY);
        }

    }
    }