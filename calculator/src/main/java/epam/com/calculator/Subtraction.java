package epam.com.calculator;

public class Subtraction {
	float a;
	float b;
	public Subtraction(float a,float b){
		this.a=a;
		this.b=b;
	}
	public String sub(){
		return Float.toString(this.a-this.b);
	}
}
