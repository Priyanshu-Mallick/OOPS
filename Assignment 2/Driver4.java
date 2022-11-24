// Complex Number addition with constructor
import java.util.*;
class Complex{
	public int real;
	public int img;
	
	/*void input(){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the real part");
		real = in.nextInt();
		System.out.println("Enter the imaginary part");
		img = in.nextInt();
	}*/
	Complex(){
		real = 1;
		img = 1;
	}
	Complex(int r, int i){
		real = r;
		img = i;
	}
	
	void add(Complex ob1, Complex ob2){
		real = ob1.real + ob2.real;
		img = ob1.img + ob2.img;
	}
}

class Driver4{
	public static void main(String args[]){
		/*Complex ob1 = new Complex();
		Complex ob2 = new Complex();
		Complex ob3 = new Complex();
		ob1.input();
		ob2.input();
		ob3.add(ob1, ob2);*/
		int real1, real2, img1, img2;
		Complex ob1 = new Complex();
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the real part of num1");
		real1 = in.nextInt();
		System.out.println("Enter the imaginary of num1");
		img1 = in.nextInt();
		System.out.println("Enter the real part of num2");
		real2 = in.nextInt();
		System.out.println("Enter the imaginary of num2");
		img2 = in.nextInt();
		
		Complex ob2 = new Complex(real1, img1);
		Complex ob3 = new Complex(real2, img2);
		
		Complex ob4 = new Complex();
		ob4.add(ob2, ob3);
		
		System.out.println("Addition Result: "+ob4.real+" + "+ob4.img+"i");
	}
}