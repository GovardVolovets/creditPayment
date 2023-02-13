public class CreditPaymentService {
    public double calculate(int sum, int term, double percent) {

        double i = percent / 12 / 100;
        byte n = (byte) (term * 12);
        double k = (i * Math.pow((1 + i), n)) / (Math.pow((1 + i), n) - 1);

        int payment = (int) Math.round(sum * k);
        return payment;
    }
}
