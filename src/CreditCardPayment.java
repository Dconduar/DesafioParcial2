public class CreditCardPayment implements PaymentStrategy {
    private String numeroTarjeta;
    private String nombreTitular;
    private String cvv;
    private String fechaExpiracion;

    public CreditCardPayment(String numeroTarjeta, String nombreTitular, String cvv, String fechaExpiracion) {
        this.numeroTarjeta = numeroTarjeta;
        this.nombreTitular = nombreTitular;
        this.cvv = cvv;
        this.fechaExpiracion = fechaExpiracion;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago de " + monto + " con tarjeta de crédito.");
    }
}
