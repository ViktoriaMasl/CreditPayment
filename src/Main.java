public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double totalOneYear = (int)service.calculate(1_000_000, 12, 9.99);
        System.out.println(totalOneYear);

        double totalTwoYear = (int)service.calculate(1_000_000, 24, 9.99);
        System.out.println(totalTwoYear);

        double totalThreeYear = (int)service.calculate(1_000_000, 36, 9.99);
        System.out.println(totalThreeYear);
    }
}
