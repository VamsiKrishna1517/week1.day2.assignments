package week1.day2.assignments;

public class Calculator {
	
	//add the two integer numbers
	public int add(int num1,int num2,int num3)
	{
		return num1+num2+num3;
	}
	//subtract two integer numbers
	public int sub(int num1,int num2)
	{
		return num1-num2;
	}
	// multiply the two double numbers
	public double mul(double num1,double num2)
	{
		return num1*num2;
	}
	//divide two float numbers
	public float divide(float num1,float num2)
	{
		return num1/num2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cl=new Calculator();
		System.out.println(cl.add(10, 20, 30));
		System.out.println(cl.sub(70, 30));
		System.out.println(cl.mul(344.5555555, 433.666666));
		System.out.println(cl.divide(9.45f, 2.0f));
		
		
		

	}

}
