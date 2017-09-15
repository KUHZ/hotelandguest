
public class Driver {
        public static void main(String[] args){
        	Hotel h1 = new Hotel();
        	Hotel h2 = new Hotel();
        	h1.setName("abc");
        	h1.setRating(3);
        	h1.setCapacity(20);
        	h2.setName("def");
        	h2.setRating(2);
        	h2.setCapacity(40);
        	System.out.println(h1.toString());
        	System.out.println(h2.toString());
        	Guest father = new Guest("Nike",30);
        	Guest mother = new Guest("Anna",30);
        	Guest son = new Guest("little nike",3);
        	h1.add(father);
        	h1.add(son);
        	h1.add(mother);
        	System.out.println(h1.freeRooms());
        	for(Guest g:h1.youngGuest(31 )){
        		System.out.println(g);
        	}
        	
        	h1.printGuest();
        	
        	
        }
        
}
