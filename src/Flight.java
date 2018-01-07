import java.util.*; //List and Map

/**
 * Flight contains:
 * Flight number
 * Number of seats on the flight
 * Price per seat
 * Origin Location using Airport Code
 * Destination Location using Airport Code
 * List of Reservations
 */
public class Flight
{
	private final String flightNumber; // flight number
	private final int numSeats; // number of available seats
	private int pricePerSeat; // cost per 1 seat on the flight
	private final String origin; // origin code for flight
	private final String destination; // destination code for flight
	List<Integer> seatsPicked; // seats that have been selected on the flight
	//hold reservation list
	private Map<Passenger,Reservation> reservationMap;

	public Flight(String flightNum, int numSeats, String origin, String dest)
	{
		this.flightNumber = flightNum;
		this.numSeats = numSeats;
		this.origin = origin;
		this.destination = dest;
		seatsPicked = new LinkedList<>(); // LinkedList connecting seats to each other
		for(int x = 0; x < numSeats; x++)
		{
			seatsPicked.add(x); // counting through the number of seats, list gets that large, keeping count
		}
	}

	public String getFlightNumber()
	{
		return flightNumber;
	}

	public int getNumSeats()
	{
		return numSeats;
	}

	public int getPricePerSeat()
	{
		return pricePerSeat;
	}

	public String getOrigin()
	{
		return origin;
	}

	public String getDestination()
	{
		return destination;
	}
	


}
