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

	public String[] Lista;
	
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

		System.out.println("File " + nameFile + " has been created!");

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
