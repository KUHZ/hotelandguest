package salesnote;

public class SalesNote implements Comparable<SalesNote>{
	private String date;
	private String description;
	private int amount;

	public SalesNote(String date, String description, int amount) {
		this.date = date;
		this.description = description;
		this.amount = amount;
	}

	// GU Override class object
	public String toString() {
		return date + ", " + description + ", " + amount + " EUR.";
	}

	public String getDate() {
		return date;
	}


	public String getDescription() {
		return description;
	}


	public int getAmount() {
		return amount;
	}

	@Override
	public int compareTo(SalesNote o) {
		// TODO Auto-generated method stub
		return 0;
	}

	


}
