import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Hotel {
	private String name;
	private int rating;
	private int capacity;
	private List<Guest> allguest = new ArrayList<Guest>();
	private List<Guest> youngguest = new ArrayList<Guest>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "\"Hotel " + getName() + ", " + getRating() + ", " + getCapacity() + "\"";
	}

	public void add(Guest g) {
		allguest.add(g);
	}

	public void remove(Guest g) {
		allguest.remove(g);
	}

	public int freeRooms() {
		int capacity = getCapacity();
		int reserved = allguest.size();
		return capacity - reserved;
	}

	public List<Guest> youngGuest(int n) {
		for (int i = 0; i < allguest.size(); i++) {
			if (allguest.get(i).getAge() < n) {
				youngguest.add(allguest.get(i));
			}
		}
		return youngguest;
	}

	
	public void printGuest() {
		Comparator<Guest> comparator = new Comparator<Guest>() {
			public int compare(Guest g1, Guest g2) {
				if (g1.getAge() != g2.getAge()) {
					return g1.getAge() - g2.getAge();
				} else {
					return g1.getName().compareTo(g2.getName());
				}

			}
		};
		
		Collections.sort(youngguest, comparator);
		
		display(youngguest);
		

	}
	
	static void display(List<Guest> youngguest){
		  for(Guest g:youngguest)
		   System.out.println(g);
		 }

}
