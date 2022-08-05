package DataTypeCasting;

public class wideningandnarrowing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//widening casting
		byte h=12;
		short k=h;
		System.out.println(k);
		
		short m=6598;
		int v=m;
		System.out.println(v);
		
		int a=15;
		long b=a;		
		System.out.println(b);
		
		long q=3564;
		float r=q;
		System.out.println(r);
		
		float l=365.12f;
		double w=l;
		System.out.println(w);
		

		//Narrowing Casting
		short z=45;
		byte n=(byte)z;
		System.out.println(n);
		
		int y=87;
		short o=(short)y;
		System.out.println(o);
		
		long c=65;
		int s=(int)c;		
		System.out.println(s);
		
		float x=98;
		long u=(long)x;
		System.out.println(u);
		
		double d=65.13;
		float j=(float)d;
		System.out.println(j);
			
	}

}
