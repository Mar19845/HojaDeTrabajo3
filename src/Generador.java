/**
 *
 * @author Juan Marroquin
 */
import java.io.*;
import java.util.*;
public class Generador {
    //creacion del variables que nos serviran mas tarde
    Random random = new Random();
    int n = 0;
    String nameFile = "numeros.txt";
    public ArrayList<String> Lista = new ArrayList<String>();
    //metedo que genera los numeros al azar y los escribe en el archivo de text.
    
    public ArrayList<String> GeneradorRandom(int cantidad) {
        try (PrintWriter file = new PrintWriter(
                new BufferedWriter(
                        new FileWriter(nameFile)));
                ){
            for(int i = 0; i<cantidad; i++){
                n = random.nextInt(cantidad);
                Lista.add(String.valueOf(n));
                file.println(n);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        // en consola se imprime que ya se ha creado el archivo y se regresa el dataArray
        System.out.println("El Archivo: " + nameFile + " ha sido creado");
        return Lista;
    }

    /**
     * @return Lista
     */
    public ArrayList<String> getLista(){
        return Lista;
    }
}
