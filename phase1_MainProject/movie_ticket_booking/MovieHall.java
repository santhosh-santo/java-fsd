package movie_ticket_booking;

public class MovieHall {
	
	private int totalShowSheat = 50;
	private int perTicketPrice = 30;
	private int totalIncome = 0;
	
	//getter and setter
	public int getTotalShowSheat() {
		return totalShowSheat;
	}
	
	public void setTotalShowSheat(int totalShowSheat) {
		this.totalShowSheat = this.totalShowSheat - totalShowSheat;
	}
	
	public int getTotalIncome() {
		return totalIncome;
	}
	
	public void setTotalIncome(int totalIncome) {
		this.totalIncome = this.totalIncome + totalIncome;
	}
	
	public int getPerTicketPrice() {
		return perTicketPrice;
	}

}
