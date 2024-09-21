public class BankTransferPayment implements PaymentStrategy {
    private String accountNumber;
    private String bankName;

    public BankTransferPayment(String accountNumber, String bankName) {
        this.accountNumber = accountNumber;
        this.bankName = bankName;
    }

    @Override
    public void procesarPago(double monto) {
        // Lógica para validar y procesar pago mediante transferencia bancaria
        System.out.println("Procesando pago de " + monto + " mediante transferencia bancaria.");

        // Mostrar mensaje especial cuando se paga con transferencia bancaria
        System.out.println("Por favor, recuerde que las transferencias bancarias pueden tardar hasta 48 horas en reflejarse.");
    }
}

