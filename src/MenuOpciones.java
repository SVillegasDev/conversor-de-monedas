public class MenuOpciones {
    private final ConsultaAPI consultaAPI = new ConsultaAPI();

    public void mostrarMenu() {
        System.out.println("\n=== Conversor de Monedas ===");
        System.out.println("1) Dólar a Peso Chileno");
        System.out.println("2) Peso Chileno a Dólar");
        System.out.println("3) Dólar a Peso Argentino");
        System.out.println("4) Peso Argentino a Dólar");
        System.out.println("5) Dólar a Real Brasileño");
        System.out.println("6) Real Brasileño a Dólar");
        System.out.println("7) Conversión personalizada");
        System.out.println("8) Salir");
        System.out.println("*****************************");
    }

    public void ejecutarOpcion(int opcion, float monto) {
        String moneda1 = "";
        String moneda2 = "";

        switch (opcion) {
            case 1 -> { moneda1 = "USD"; moneda2 = "CLP"; }
            case 2 -> { moneda1 = "CLP"; moneda2 = "USD"; }
            case 3 -> { moneda1 = "USD"; moneda2 = "ARS"; }
            case 4 -> { moneda1 = "ARS"; moneda2 = "USD"; }
            case 5 -> { moneda1 = "USD"; moneda2 = "BRL"; }
            case 6 -> { moneda1 = "BRL"; moneda2 = "USD"; }
        }

        if (!moneda1.isEmpty() && !moneda2.isEmpty()) {
            Moneda moneda = consultaAPI.consultaMoneda(moneda1, moneda2, monto);
            if (moneda != null) {
                System.out.printf("Resultado: %.2f %s = %.2f %s%n", monto, moneda1, moneda.conversion_result(), moneda2);
                System.out.println("*****************************");
            } else {
                System.out.println("Error: Una o ambas monedas no son válidas.");
            }
        }
    }

    public boolean conversionPersonalizada(String moneda1, String moneda2, float monto) {
        Moneda moneda = consultaAPI.consultaMoneda(moneda1, moneda2, monto);
        if (moneda != null) {
            System.out.printf("Resultado: %.2f %s = %.2f %s%n", monto, moneda1, moneda.conversion_result(), moneda2);
            System.out.println("*****************************");
            return true;
        }
        return false;
    }
}
