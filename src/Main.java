public class Main {
    public static void main(String[] args) {
        int contribution = 15000;
        int total = 0;
        int month = 0;
        for (;total < 12_000_000;) {
            contribution = contribution + contribution/100 * 7;
            total = contribution;
            month = month + 1;
            System.out.println("Месяц " + month + ", сумма накоплений " + total + " рублей");
        }

    }
    }