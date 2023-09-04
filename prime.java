class main
{
	public static void main(String args[])
	{
		int start=1,num=17,count=0;
		while(start<=num)
		{
		   if(num%start==0)
		   {
		    count++;
		 }
		start++;
		}
		if(count==2)
		System.out.println("prime no.");
		else
		System.out.println("there is no prime no.");
	}
}