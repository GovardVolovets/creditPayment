public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        System.out.println();
        System.out.println("Сумма кредита: 1 000 000 ₽ / Срок: 1 год(а) / Процентная ставка: 9.99%");
        System.out.println("Ежемесячный платеж по кредиту: ");
        System.out.println(service.calculate(1_000_000, 1, 9.99) + " ₽");

        System.out.println();
        System.out.println("Сумма кредита: 1 000 000 ₽ / Срок: 2 год(а) / Процентная ставка: 9.99%");
        System.out.println("Ежемесячный платеж по кредиту: ");
        System.out.println(service.calculate(1_000_000, 2, 9.99) + " ₽");

        System.out.println();
        System.out.println("Сумма кредита: 1 000 000 ₽ / Срок: 3 год(а) / Процентная ставка: 9.99%");
        System.out.println("Ежемесячный платеж по кредиту: ");
        System.out.println(service.calculate(1_000_000, 3, 9.99) + " ₽");

    }
}
