package epam.com.calculator;

public class Addition {
	float a;
	float b;
	public Addition(float a,float b){
		this.a=a;
		this.b=b;
	}
	public String add(){
		return Float.toString(this.a+this.b);
	} 
}
