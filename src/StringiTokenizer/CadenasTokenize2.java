package StringiTokenizer;

import java.util.Scanner;

public class CadenasTokenize2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("Ingrese una cadena");
		String s = in.next();
		System.out.println("Ingresa otra cadena");		
		String s1 = in.next();
		System.out.println("s1 = " + s + "");
		System.out.println("s2 = " + s1 + "");
		
		if (s.equals(s1)) {
			System.out.println("Son iguales");
		} else {
			System.out.println("No son iguales");
		}

	}

}
