import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PaymentProcessor paymentProcessor = new PaymentProcessor();

        System.out.println("Bienvenido al sistema de pagos.");
        System.out.println("Por favor, elija un método de pago:");
        System.out.println("1. Tarjeta de crédito");
        System.out.println("2. PayPal");
        System.out.println("3. Cripto-monedas");
        System.out.println("4. Transferencia bancaria");

        int opcion = scanner.nextInt();  // Leer la opción ingresada por el usuario
        scanner.nextLine();  // Consumir la nueva línea

        switch (opcion) {
            case 1:
                System.out.println("Ingrese el número de tarjeta:");
                String numeroTarjeta = scanner.nextLine();
                System.out.println("Ingrese el nombre del titular:");
                String nombreTitular = scanner.nextLine();
                System.out.println("Ingrese el CVV:");
                String cvv = scanner.nextLine();
                System.out.println("Ingrese la fecha de expiración (MM/AA):");
                String fechaExpiracion = scanner.nextLine();

                paymentProcessor.setPaymentStrategy(new CreditCardPayment(numeroTarjeta, nombreTitular, cvv, fechaExpiracion));
                break;

            case 2:
                // Solicitar detalles de PayPal
                System.out.println("Ingrese el correo de PayPal:");
                String email = scanner.nextLine();
                System.out.println("Ingrese la contraseña:");
                String password = scanner.nextLine();

                paymentProcessor.setPaymentStrategy(new PayPalPayment(email, password));
                break;

            case 3:
                System.out.println("Ingrese la dirección de la cartera:");
                String walletAddress = scanner.nextLine();

                paymentProcessor.setPaymentStrategy(new CryptoPayment(walletAddress));
                break;

            case 4:
                System.out.println("Ingrese el número de cuenta bancaria:");
                String accountNumber = scanner.nextLine();
                System.out.println("Ingrese el nombre del banco:");
                String bankName = scanner.nextLine();

                paymentProcessor.setPaymentStrategy(new BankTransferPayment(accountNumber, bankName));
                break;

            default:
                System.out.println("Opción inválida. Intente de nuevo.");
                return;  // Salir del programa si la opción es inválida
        }

        System.out.println("Ingrese el monto a pagar:");
        double monto = scanner.nextDouble();

        paymentProcessor.procesarPago(monto);
    }
}

