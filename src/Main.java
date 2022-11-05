public class Main {
    public static void main(String[] args) {
        int salary = 15000;
        int total = 0;
        int i = 0;
        while (total < 2_459_000) {
        total = total + total/100;
        total = total + salary;
        i++;
        System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }
    }
}