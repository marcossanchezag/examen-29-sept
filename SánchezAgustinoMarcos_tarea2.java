public class SánchezAgustinoMarcos_tarea2 {
    public static void main(String[] args) {
        int num1 = 9;
        int num2 = 2;

        int division = num1 / num2;
        float division2 = (float) num1 / num2;

        System.out.println("El resultado de la división en un int es: " + division);
        System.out.printf("el resultado de la división en float es: " + division2 + "\n");

        // Ejercicio 2.

        String entrada = System.console().readLine("Introduce lo que quieras converir de bits a bytes aqui: ");
        int numbit = Integer.parseInt(entrada);
        System.out.println("La converisón de bits a byte es: " + (numbit * 8));

        // Ejercicio 3.

        char numcarac = 64;
        System.out.println("" + numcarac);

        // Ejercicio 4.

        int DNI = 78160912;
        int divison3 = DNI % 23;
        System.out.println("El resto de mi dni / 23 es : " + divison3);

        /*
         * El resto me da un resultado de 12, y el 12 en la tabla ASCII es 'N' por lo
         * que mi DNI completo es 78160912N
         */

    }
}
