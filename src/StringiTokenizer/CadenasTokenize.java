package StringiTokenizer;

import java.util.StringTokenizer;

public class CadenasTokenize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Juan|Marcos|Raquel|David";
		
		StringTokenizer st = new StringTokenizer(s,"|");
		String tok ;
		while (st.hasMoreTokens()) {
			tok= st.nextToken();
//			System.out.println(tok);
			
		}
		String [] tokens = s.split("[|]");
		for (int i = 0; i < tokens.length; i++) {
			System.out.println(tokens[i]+" " +i );
		}
		
		

	}

}
