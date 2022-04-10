package AirlineSystem;

public interface setPrices 
{
	double tax = 0.06;
	double price = 24.99;
	default double getPrice()
	{
		 double total = price * tax;
		 return price + total;
	}
}
