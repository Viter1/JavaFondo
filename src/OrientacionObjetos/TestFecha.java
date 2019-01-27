package OrientacionObjetos;

public class TestFecha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fecha f = new Fecha();
//		f.dia = 2; //nos da error porque es privada
		f.setDia(2);

		f.setMes(10);
		
		f.setAnio(1970);
		
		System.out.println("Dia= " +f.getDia());
		
		System.out.println("Mes= " + f.getMes());
		
		System.out.println("Año= "+ f.getAnio());
		
		System.out.println(f);
		
	}

}
