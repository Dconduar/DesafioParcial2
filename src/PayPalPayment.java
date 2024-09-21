// Estrategia para pagos con PayPal
public class PayPalPayment implements PaymentStrategy {
    private String email;
    private String password;

    public PayPalPayment(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void procesarPago(double monto) {
        // Mostrar mensaje de autenticación de PayPal
        System.out.println("Autenticando la cuenta de PayPal " + email + "...");

        // Lógica para autenticarse con PayPal y procesar el pago
        System.out.println("Procesando pago de " + monto + " con PayPal.");
    }
}

