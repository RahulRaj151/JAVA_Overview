
public class Math_class {

	public static void main(String[] args) {
		
		double a = 5.67;
		double b = -10;
		
		double c = Math.max(a, b);
		double d = Math.min(a, b);
		double e = Math.abs(a);
		double f = Math.abs(b);
		double g = Math.sqrt(a);
		double h = Math.round(a);
		double i = Math.ceil(a);
		double j = Math.floor(a);

		System.out.println("Maximum: " + c);
		System.out.println("minimum: "+ d);
		System.out.println("Absolute: "+ e);
		System.out.println("Absolute: "+ f);
		System.out.println("Squre_root: "+ g);
		System.out.println("Roundoff :"+h);
		System.out.println("Ceil: "+i);
		System.out.println("floor: "+j);
		
	}

}
