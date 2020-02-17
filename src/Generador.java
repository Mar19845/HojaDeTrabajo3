/**
 *
 * @author Juan Marroquin
 */
import java.io.*;
import java.util.*;
public class Generador implements Comparable {
    //creacion del variables que nos serviran mas tarde
    Random r = new Random();
	int n = 0;
	String nameFile = "random.txt";
        String nameFile2 = "ordenados.txt";
	public String[] Lista;
        public String[] txt;
        // 
        public String[] NewTXT(Comparable[] a){
            int cantidad = a.length;
            txt = new String[cantidad];
            try (PrintWriter file = new PrintWriter(
			new BufferedWriter(
				new FileWriter(nameFile2)));
		){
			for(int i = 0; i<cantidad; i++){
				
				//file.println(n);
                                String str1 = a[i].toString(); 
				txt[i]=str1;
				file.println(txt[i]);
			}
			//file.println(dataArray);
		}catch(IOException e){
			e.printStackTrace();
		}
            System.out.println("El archivo " + nameFile2 + " con los numeros ordenados ha sido creado");
            return txt;
        }
	//genera numeros y llena txt
	public String[] Generador(int cantidad) {
                Lista = new String[cantidad];
		try (PrintWriter file = new PrintWriter(
			new BufferedWriter(
				new FileWriter(nameFile)));
		){
			for(int i = 0; i<cantidad; i++){
				n = r.nextInt(cantidad);
				//file.println(n);
                                String str1 = Integer.toString(n); 
				Lista[i]=str1;
				file.println(n);
			}
			//file.println(dataArray);
		}catch(IOException e){
			e.printStackTrace();
		}

		System.out.println("El archivo " + nameFile + " ha sido creado");

		return Lista;
	}

	public String[] getLista(){
		return Lista;
	}
    @Override
    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
