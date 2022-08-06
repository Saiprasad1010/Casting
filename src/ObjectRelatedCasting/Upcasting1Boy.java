package ObjectRelatedCasting;

public class Upcasting1Boy extends Upcasting1Human {
	int a=10;
	String b="Sai";
	
	void talk() {
		System.out.println("Boy talk");
	}
	
	void walk() {
		System.out.println("Boy walk");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Upcasting1Boy v=new Upcasting1Boy();
		System.out.println(v.a);
		v.talk();
		v.walk();
	
		Upcasting1Human vv=new Upcasting1Human();
		System.out.println(v.b);
		v.talk();
		v.walk();
		  
		Upcasting1Human n=new 	Upcasting1Boy();
		System.out.println(v.a);
		v.talk();
		v.walk();
		
		
		
		
		
	}

}
