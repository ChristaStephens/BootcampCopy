
public class EnumApp {

	public static void main(String[] args) {
		// TrafficSignal variables can only be one of these three
		// options.
		TrafficSignal woodward = TrafficSignal.RED;
		woodward = TrafficSignal.GREEN;
		// enums can be set
		woodward = TrafficSignal.YELLOW;
		
		// enums can be compared for equality
		if (woodward == TrafficSignal.GREEN) {
			System.out.println("It's green.");
		} else if (woodward != TrafficSignal.RED) {
			System.out.println("It's not red.");
		}
		
		TicketType ticket = TicketType.ADULT;
		
		System.out.println(2 * ticket.getPrice());
		
	}

}
