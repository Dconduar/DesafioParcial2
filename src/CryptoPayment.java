public class CryptoPayment implements PaymentStrategy {
    private String walletAddress;

    public CryptoPayment(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    @Override
    public void procesarPago(double monto) {
        // Lógica para verificar transacción en la red blockchain
        System.out.println("Procesando pago de " + monto + " con Cripto-monedas.");
    }
}
