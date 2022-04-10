package AirlineSystem;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ReserveSeat extends getTix
{

	private String name;
	private List<String> rSeats;
	private String rFirstClass;

	public ReserveSeat()
	{
		this.rSeats = seats();
	}
	private List<String> seats()
	{
		List<String> planeSeats = new ArrayList<String>();
		
		if(ticketNumber <= 5)
		{
			for(int i = 0; i < ticketNumber; i++)
			{
				Scanner s = new Scanner(System.in);
				System.out.println("Enter your name:");
				
				planeSeats.add(s.nextLine());
			}
		}
		else
		{
			System.out.println("You can only purchase less than 6 tickets");
			System.exit(1);
		}
		return planeSeats;
	}
	public void printArr()
	{
		System.out.println("Your seat has been reserved for: " + rSeats);
	}
}
