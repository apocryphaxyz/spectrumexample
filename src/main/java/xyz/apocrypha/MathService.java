package xyz.apocrypha;

public class MathService {
	
	public static int add(String x, String y) {
		int a;
		int b;
		
		try {
			a = Integer.parseInt(x);
		}
		catch(Exception e) {
			a = 0;
		}
		
		try {
			b = Integer.parseInt(y);
		}
		catch(Exception e) {
			b = 0;
		}
		
		return a + b;
		
	}

}
