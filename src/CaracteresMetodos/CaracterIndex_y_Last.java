package CaracteresMetodos;

public class CaracterIndex_y_Last {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// caracteres indices
		String s = "Esto Es Una Cadena de caracteres";

		int pos1, pos2, pos3;

		pos1 = s.indexOf('C');
		pos2 = s.lastIndexOf('C');
		pos3 = s.indexOf('x');

		System.out.println(pos1);
		System.out.println(pos2);
		System.out.println(pos3);

	}

}
