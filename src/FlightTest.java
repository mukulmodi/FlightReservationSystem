import junit.framework.TestCase;

public class FlightTest extends TestCase
{
	Flight testFlight = new Flight("323",20,"DFW","LAX");

	public void testGetFlightNumber() throws Exception
	{
		String fNum = testFlight.getFlightNumber();
		assertEquals("323",fNum);

	}

	public void testGetNumSeats() throws Exception
	{
		
	}

	public void testGetPricePerSeat() throws Exception
	{
	}

	public void testGetOrigin() throws Exception
	{
	}

	public void testGetDestination() throws Exception
	{
	}

	public void testChangeSeatPrice() throws Exception
	{
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