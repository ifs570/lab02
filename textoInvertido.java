import java.util.*;
public class textoInvertido {
	public static void main(String args[]) {
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Ingrese la palabra:");
	String cadena=scan.next();
	String cadenaInvertida = "";
     for (int x = cadena.length() - 1; x >= 0; x--)
         cadenaInvertida = cadenaInvertida + cadena.charAt(x);
     System.out.println("La palabra invertida es: "+cadenaInvertida);
	}
}
