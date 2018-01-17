import junit.framework.TestCase;

public class FlightTest extends TestCase
{
	Flight testFlight = new Flight("323",20,100,"DFW","LAX");

	public void testGetFlightNumber() throws Exception
	{
		assertEquals("323",testFlight.getFlightNumber());

	}

	public void testGetNumSeats() throws Exception
	{
		assertEquals(20,testFlight.getNumSeats());
	}

	public void testGetPricePerSeat() throws Exception
	{
		assertEquals(100,testFlight.getPricePerSeat());
	}

	public void testGetOrigin() throws Exception
	{
		assertEquals("DFW",testFlight.getOrigin());
	}

	public void testGetDestination() throws Exception
	{
		assertEquals("LAX", testFlight.getDestination());
	}

	public void testChangeSeatPrice() throws Exception
	{
		testFlight.changeSeatPrice(500);
		assertEquals(500,testFlight.getPricePerSeat());
	}

	public void testBookPassenger() throws Exception
	{
	}

	public void testSeatAvailable() throws Exception
	{
	}

	public void testGetRandomSeat() throws Exception
	{

	}

}