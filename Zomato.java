class Zomato
{
	public static void main(String args[])
{
	String item1="ChickenBiryani";
	String item2="Chickenlollipos";
	String item3="Cooldrinks";
	String item4="Gulabjamun";
	double item1_rate=300;
	double item2_rate=360;
	double item3_rate=80;
	double item4_rate=150;
	double total=item1_rate+item2_rate+item3_rate+item4_rate;
System.out.println(item1+"  "+item1_rate);
System.out.println(item2+"  "+item2_rate);
System.out.println(item3+"  "+item3_rate);
System.out.println(item4+"  "+item4_rate);
System.out.println("items total = "+total);
	double first_order_offer=total*25.0/100;
System.out.println(total);
		total=total-first_order_offer;
System.out.println("first order offer 25%  = "+first_order_offer);
System.out.println("after offer price = "+total);
	double delivery_charges=90;	
		total=total+delivery_charges;
System.out.println("order total  = "+total);
}
}