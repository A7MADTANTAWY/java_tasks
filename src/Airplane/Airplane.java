package Airplane;

public class Airplane {
	  private String flightNumber;
	    private String destination;
	    private String departureTime;

	    // Constructor to initialize flight details
	    public Airplane(String flightNumber, String destination, String departureTime) {
	        this.flightNumber = flightNumber;
	        this.destination = destination;
	        this.departureTime = departureTime;
	    }

	    // Method to check flight status
	    public void checkFlightStatus() {
            System.out.println("Flight " + flightNumber + " to " + destination + " is on time. Departure time: " + departureTime);
	    }
	    
	    // Getters for flight details
	    public String getFlightNumber() {
	        return flightNumber;
	    }

	    public String getDestination() {
	        return destination;
	    }

	    public String getDepartureTime() {
	        return departureTime;
	    }

	    public String printAriplaneInfo() {
	        return "Flight Number: " + flightNumber + ", Destination: " + destination + ", Departure Time: " + departureTime;
	    }
}
