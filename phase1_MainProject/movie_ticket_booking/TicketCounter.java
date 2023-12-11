package movie_ticket_booking;

public interface TicketCounter {
	
		//login for front desk
		public boolean frontDeskLogin();
		
		//old password change for front desk
		public void frontDeskPasswordChange();
		
		//ticket booking
		public void bookTicket();
		
		//movie hall internal details
		public void showTicketQuanuityProfit();

}
