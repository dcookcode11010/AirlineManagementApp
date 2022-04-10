package AirlineSystem;

import java.util.Scanner;

public class getTix implements setPrices
{
	public int ticketNumber;
	private double ticketPrice;
	private double amount;
	int number;
	
	public getTix()
	{
		this.ticketNumber = getTicket();
		this.ticketPrice = getPrice();
		this.amount = calculatePrice();

	}
	private int getTicket()
	{
		System.out.println("Hello, how many tickets would you like?");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		return num;
	}
	private double calculatePrice()
	{
		double total = ticketNumber * ticketPrice;
		return total;
	}
	void printTotal()
	{
		System.out.println("Your balance: ");
		System.out.println(String.format("%.2f", amount));
		System.out.println("Your Ticket #: " + ticketNumber);
	}

}
