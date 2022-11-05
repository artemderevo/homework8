public class Main {
    public static void main(String[] args) {
        int contribution = 15000;
        int total = 0;
        int month = 0;
        for (;month <=108;) {
            contribution = contribution + contribution/100 * 7;
            total = contribution;
            month = month + 1;
            if (month % 6 ==0) {
                System.out.println("Месяц " + month + ", сумма накоплений " + total + " рублей");
            }

        }

    }
    }