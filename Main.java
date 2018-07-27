public class Main {

    public static void main(String[] args) {

        CONSTRUCTOR cuenta_1 = new CONSTRUCTOR("Steven de Rasputia");
        CONSTRUCTOR cuenta_2 = new CONSTRUCTOR("Arlyn de Caballero", 0);

        //Ingresa dinero en las cuentas
        cuenta_1.ingresar(1250);
        cuenta_2.ingresar(1500);

        //Retiramos dinero en las cuentas
        cuenta_1.retirar(500);
        cuenta_2.retirar(1250);

        //Muestro la informacion de las cuentas
        System.out.println(cuenta_1); // 0 euros
        System.out.println(cuenta_2); // 600 euros

    }

}