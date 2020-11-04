

public class CreditPaymentService {
    public double calculate(int amount, int period, double rate) {
        rate /= 1200;
        double total = amount * (rate + ( rate / (Math.pow(1 + rate, period) - 1)));
        return total;
    }

}
