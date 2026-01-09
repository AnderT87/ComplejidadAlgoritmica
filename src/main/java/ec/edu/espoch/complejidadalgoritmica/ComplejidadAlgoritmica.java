/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ec.edu.espoch.complejidadalgoritmica;

/**
 *
 * @author Admin
 */
public class ComplejidadAlgoritmica {

    public static void main(String[] args) {
        int a = 2;
        int b = 3;

        // Ahora podemos llamar al método porque ambos son static
        System.out.println("Metodo 1: " + Metodo1(a, b));
        System.out.println("---------------------------");
        System.out.println("Metodo 2: " + Metodo2(a, b));
    }

    // Agregamos 'static' y parámetros (int n1, int n2)
    public static int Metodo1(int n1, int n2) {
        int resultado = 0;

        for (int i = 0; i < 40; i++) {
            long inicio = System.nanoTime();
            resultado = (n1 > n2) ? n1 : n2;
            long fin = System.nanoTime();
             System.out.println("Tiempo logico: " + (fin + inicio) + " ns");
        }

       
        return resultado;
    }

    // Agregamos 'static' y parámetros (int n1, int n2)
    public static int Metodo2(int n1, int n2) {
        int resultado = 0;

        for (int i = 0; i < 40; i++) {
            long inicio = System.nanoTime();
            if (n1 > n2) {
                resultado = n1;
            } else {
                resultado = n2;
            }
            long fin = System.nanoTime();
            System.out.println("Tiempo if-else: " + (fin + inicio) + " ns");
        }

        
        
        return resultado;
    }
}
