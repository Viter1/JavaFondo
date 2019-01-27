package useless1_RepresentacionNumerica_En_Bases;

import java.util.Scanner;

public class RepresentacionNumerica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		System.out.println("Ingresa un valor");
		
		int v = in.nextInt();
		
		System.out.println("Valor integrado: " + v);
		System.out.println("Binario: " + Integer.toBinaryString(v));
		System.out.println("octal: " + Integer.toOctalString(v));
		System.out.println("hexadecimal: " + Integer.toHexString(v));
		
		
		
		
		

	}

}
