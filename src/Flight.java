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
	private final String origin; // origin code for flight
	private final String destination; // destination code for flight
	private int pricePerSeat; // cost per 1 seat on the flight
	private List<Integer> seatsAvailable; // seats that have been selected on the flight
	//hold reservation list
	private Map<Passenger,Reservation> reservationMap;

	public Flight(String flightNum, int numSeats, String origin, String dest)
	{
		this.flightNumber = flightNum;
		this.numSeats = numSeats;
		this.origin = origin;
		this.destination = dest;
		seatsAvailable = new LinkedList<>(); // LinkedList connecting seats to each other
		for(int x = 0; x < numSeats; x++)
		{
			seatsAvailable.add(x); // counting through the number of seats, list gets that large, keeping count
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

	/**
	 * Allows price of seat to be changed
	 * @param newPrice int new price of each seat
	 */
	public void changeSeatPrice(int newPrice)
	{
		this.pricePerSeat = newPrice;
	}
	/**
	 * Adds the passenger to the list of reservations on the flight
	 * @param reservation Reservation object containing passenger and essential information to be added to the flight
	 */
	public void bookPassenger(Reservation reservation) //reservation holds a passenger,price, and seat
	{
		if(!reservationMap.containsKey(reservation.getPassenger())) // no duplicate passengers allowed
		{
			reservationMap.put(reservation.getPassenger(),reservation);
		}
	}

	/**
	 * Ensures that flight is not booked
	 * @return true if there are seats available
	 */
	public boolean seatAvailable()
	{
		return reservationMap.size() < numSeats; // Reservationmap fills as seats are added, ensures less than possible seats on flight
	}

	/**
	 * Pulls a random seat number from the list of available seat numbers
	 * Removed from the list of available and then returned
	 * @return int of randomly generated seat number on the flight
	 */
	public int getRandomSeat()
	{
		int randomVal = (int) (Math.random() * (seatsAvailable.size() + 1));
		return seatsAvailable.get(randomVal);
	}

	/**
	 * If a passenger cancels their reservation, then their seat gets readded to the pool of available seats
	 * @param seatNumber int of Seat Number to be readded
	 */
	public void seatCancelled(int seatNumber)
	{
		seatsAvailable.add(seatNumber);
	}

	/**
	 * Cancels a reservation. Adds seat back to the pool, removes from reservation map
	 * @param res Reservation to be cancelled
	 */
	public void cancelReservation(Reservation res)
	{
		//check if the reservation exists
		if(reservationMap.get(res.getPassenger()) != null)
		{
			reservationMap.remove(res.getPassenger());
			seatsAvailable.add(res.getSeatNumber()); // add back to seatList
		}
	}


}
