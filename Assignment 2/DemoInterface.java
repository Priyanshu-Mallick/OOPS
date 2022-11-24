//iNTERFACE
import java.util.*;
interface Shape{
	void input();
	public abstract void area();
	abstract void show();
}
class Square implements Shape{
	int side, result;
	public void input(){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the side of the square");
		side = in.nextInt();
	}
	public void area(){
		result = side * side;
	}
	public void show(){
		System.out.println("Area of square is "+result);
	}
}
class DemoInterface{
	public static void main(String args[]){
		Shape ob;
		ob = new Square();
		ob.input();
		ob.area();
		ob.show();
	}
}