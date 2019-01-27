package OrientacionObjetos;

import java.util.Scanner;

public class TestFecha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		Fecha f = new Fecha(0, 0, 0);
		// f.dia = 2; //nos da error porque es privada
//		f.setDia(2);
//
//		f.setMes(10);

//		f.setAnio(1970);
//
//		System.out.println("Dia= " + f.getDia());
//
//		System.out.println("Mes= " + f.getMes());
//
//		System.out.println("Año= " + f.getAnio());
//
//		System.out.println(f.toString());
//		
//		System.out.println(f.equals(f));
		
		System.out.println("Ingrese Fecha1 (dia/mes/año): ");
		int dia = in.nextInt();
		int mes = in.nextInt();
		int anio = in.nextInt();
		
		Fecha f1 = new Fecha(dia,mes,anio);
		
		System.out.println("Ingrese Fecha2 (dia/mes/año): ");
		 dia = in.nextInt();
		 mes = in.nextInt();
		 anio = in.nextInt();
		
		Fecha f2 = new Fecha(dia,mes,anio);
		
		if (f1.equals(f2)) {
			System.out.println("Son iguales");
		}else {
			System.out.println("No son iguales");
		}

	}

}
