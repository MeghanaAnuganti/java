class mobile
{
	public static void main(String args[])
	{
	String name="APPLE iphone";
	double original_price=79900;
	double offer_price=14/100.0*79900;
	double main_price=original_price-offer_price;
	System.out.println("mainprice"  + main_price);
	double pakaging_fee=99;
	double price=main_price+pakaging_fee;
	System.out.println("main_price"  + price);
	double bank_offer=5/100.0*price;
	System.out.println("final price = "+bank_offer);
	double max_price=price-bank_offer;
	System.out.println("price =  " +max_price);
	double exchange=7000;
	double total_price=price-1164;
	System.out.println("totalprice ="+total_price);
	double final_total=total_price-exchange;
	System.out.println("final total price = "+final_total);
	

	}
}