class main
{
	public static void main(String args[])
   	{
	String  name="chinnu";
	int age=25;
	String gender="male",gender1="female";
	String address="hyd";
	int premium=200000/1000*4;
	int premium1=100000/1000*3;
	int premium2=10000/1000*6;
	int policy=1000/100*4,policy1=1000/100*3,policy2=1000/100*6;
	if (age>=25 && age<=35)
	{
	System.out.println(premium);
	}
	else if(gender1=="female"&&premium1<=100000)
	{
	System.out.println(premium1);
	}
	else if(premium2<=10000)
	{
	System.out.println(premium2);
	}
}
}









