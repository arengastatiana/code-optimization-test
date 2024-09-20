public class TaxCalculation {

    public static void main(String[] args) {
        
        // Constantes para las tasas de impuestos y el límite
        final double TAX_RATE_HIGH = 0.15; // Tasa alta
        final double TAX_RATE_LOW = 0.10;  // Tasa baja
        final double TAX_THRESHOLD = 50.0; // Límite para impuestos altos

        // Precios de los productos
        double[] productPrices = {100, 200};
        // Tasas de impuestos para cada producto
        double[] taxRates = {TAX_RATE_HIGH, TAX_RATE_LOW};

        // Calcular el impuesto total
        double totalTax = 0;
        for (int i = 0; i < productPrices.length; i++) {
            totalTax += productPrices[i] * taxRates[i]; // Calcular y sumar el impuesto de cada producto
        }

        // Mostrar si el impuesto total es alto o bajo
        if (totalTax > TAX_THRESHOLD) {
            System.out.println("Impuesto alto: " + totalTax);
        } else {
            System.out.println("Impuesto bajo: " + totalTax);
        }
    }
}
