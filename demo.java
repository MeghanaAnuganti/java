class year
{
	public static void main(String args[])
	{
	int current_year=2023;
	int birth_year=2001;
	int age= current_year-birth_year;
	int year=365;
	int days=age*year;
	int month=12;
	int months=age*month;
	int hour=24;
	int week=7;
	int weeks=week*months;
	int hours=days*hour;
	int minute=60;
	int minutes=days*minute;
	System.out.println("your age = "+age);
	System.out.println("months = "+months);
	System.out.println("days = "+days);
	System.out.println("hours = "+hours);
	System.out.println("minutes = "+minutes);
	System.out.println("week =  "+weeks);
	
}
}