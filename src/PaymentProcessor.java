public class PaymentProcessor {
    private PaymentStrategy strategy;

    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void procesarPago(double monto) {
        if (strategy != null) {
            strategy.procesarPago(monto);
        } else {
            System.out.println("No se ha seleccionado un método de pago.");
        }
    }
}
