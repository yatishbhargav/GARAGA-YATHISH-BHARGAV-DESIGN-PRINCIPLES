package epam.com.calculator;

public class Multiplication {
	float a;
	float b;
	public Multiplication(float a,float b){
		this.a=a;
		this.b=b;
	}
	public String mul(){
		return Float.toString(this.a*this.b);
	}
}
