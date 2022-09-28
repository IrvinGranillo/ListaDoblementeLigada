
import java.util.Scanner;
import lista_doblemente_ligada.LDobleLig;

public class Principal {

    public static void main(String[] args) {

        LDobleLig<Integer> numeros = new LDobleLig<>();
        Scanner lector = new Scanner(System.in);

        int Desicion = 1;
        int dato;
        int posicion;

        while (Desicion != 0) {
            System.out.println("que deecea hacer");
               Desicion= lector.nextInt();
            switch (Desicion) {
                case 0:
                    System.out.println("Gracias  por venir ");
                    break;
                case 1:
                    System.out.println("agregar al inicio");
                    System.out.println("elige un numerro");
                    dato = lector.nextInt();
                    numeros.agregarAlInicio(dato);
                    break;
                case 2:
                    System.out.println("Agregar al final");
                    System.out.println("elige un numerro");
                    dato = lector.nextInt();
                    numeros.agregarAlFinal(dato);
                    break;
                case 3:
                    System.out.println("Agregar despues de ");
                    System.out.println("elige un numerro");
                    dato = lector.nextInt();
                    System.out.println("Selecciona la posicion");
                    posicion = lector.nextInt();
                    numeros.agregarDespuesDe(posicion, dato);
                    break;
                case 4:
                    System.out.println("Eliminar ");
                    System.out.println("Selecciona la posicion");
                    posicion = lector.nextInt();
                    numeros.eliminar(posicion);
                    break;
                case 5:
                    System.out.println("Eliminar el primero");
                    numeros.eliminarElPrimero();
                    break;
                case 6:
                    System.out.println("Eliminar el final");
                    numeros.eliminarElFinal();

                    break;
                case 7:
                    System.out.println("Buscar ");
                    System.out.println("Selecciona un numero a buscar ");
                     dato = lector.nextInt();
                    System.out.println("Tu numero esta en la pocision"+numeros.buscar(dato));
                    break;
                case 8:
                    System.out.println("Actualizar ");
                    System.out.println("Elige al numero a buscar ");
                     dato = lector.nextInt();
                     System.out.println("Elige el numero que lo sustituira ");
                      posicion = lector.nextInt();
                     numeros.actualizar(dato,posicion);
                    break;
                case 9:
                    System.out.println("Transversal");
                    numeros.transversal();
                    break;

                default:
                    throw new AssertionError();
                   
            }
        }

    }
}
