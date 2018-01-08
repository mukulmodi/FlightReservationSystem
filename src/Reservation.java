public class Reservation
{
	private final Passenger passenger;
	private final int price;
	private final int seatNumber;

	public Reservation(Passenger passenger, int price, int seatNumber)
	{
		this.passenger = passenger;
		this.price = price;
		this.seatNumber = seatNumber;
	}

	public Passenger getPassenger()
	{
		return passenger;
	}

	public int getSeatNumber()
	{
		return seatNumber;
	}
	public int getPrice()
	{
		return price;
	}

}
