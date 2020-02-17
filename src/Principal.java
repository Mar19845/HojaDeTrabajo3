
import java.util.Scanner;
/**
 *
 * @author Juan Marroquin
 */
public class Principal {
    public static void main(String[] args) {
        //creacion de sorts y del archivo
        Sorts sorts = new Sorts();
        Generador gen = new Generador();
        // pedir al usuario cuantos numeros al azar va a crear
	Scanner teclado = new Scanner(System.in);	
	System.out.println("Cuantos numeros quiere: ");
        int cantidad = teclado.nextInt();
        teclado.nextLine();
        //creacion del archivo txt
        gen.Generador(cantidad);
        //sorts.Selectionsort(gen.Lista);
        gen.NewTXT(sorts.Selectionsort(gen.Lista));
        sorts.Selectionsort(gen.txt);
        //merge sort
        gen.NewTXT(sorts.mergeSort(gen.Lista));
        sorts.mergeSort(gen.txt);
        //quicksort
        gen.NewTXT(sorts.quickSort(gen.Lista));
        sorts.quickSort(gen.txt);
        //bubble sort
        gen.NewTXT(sorts.Bubblesort(gen.Lista));
        sorts.Bubblesort(gen.txt); 
    }
}
