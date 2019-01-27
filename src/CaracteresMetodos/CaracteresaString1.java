package CaracteresMetodos;

public class CaracteresaString1 {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Esta es mi cadena";
		
//		System.out.println(s.charAt(0));
//		System.out.println(s.charAt(5));
//		System.out.println(s.charAt(s.length()-1));
		
		char c ;
		for (int i = 0; i < s.length(); i++) {
			c = s.charAt(i);
//			System.out.println(i + " --> "+ c);	
		}
			
			//caracteres indices
			String s2 = "Esto Es Una Cadena de caracteres";
			
			int pos1 , pos2 ,pos3;
			
			pos1 = s2.indexOf('C');
			pos2 = s2.lastIndexOf('C');
			pos3 = s2.indexOf('x');
			
			
//			System.out.println(pos1);
//			System.out.println(pos2);
//			System.out.println(pos3);
			
/**
 * la clase StringBuffer
 */
			String x = new StringBuffer().append("Hola ").append("Que tal?").toString();
			System.out.println(x);
			
			
						
			
			
			
		
			
		}

	}


