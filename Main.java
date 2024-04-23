/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TablaHash;

public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        TablaHash hashMap = new TablaHash();

        while (true) {
            System.out.println("\nOpciones:");
            System.out.println("1. Insertar en buckets");
            System.out.println("2. Mostrar la tabla hash");
            System.out.println("3. Finalizar");
            System.out.print("Ingrese su opción: ");
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese un clave: ");
                    int clave = sc.nextInt();
                    System.out.print("Ingrese un valor: ");
                    int valor = sc.nextInt();
                    hashMap.poner(clave, valor);
                    break;
                case 2:
                    hashMap.mostrarHashMap();
                    break;
                case 3:
                    System.out.println("Gracias por utilizar este programa :D");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Error, intente de nuevo.");
            }
        }
    }
}
