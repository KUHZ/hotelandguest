package salesnote;

import java.util.ArrayList;

public class SalesPerson {
	private String name;
	ArrayList<SalesNote> gulist = new ArrayList<SalesNote>();

	public void add(SalesNote sn) {
		gulist.add(sn);
	}

	public void remove(SalesNote sn) {
		gulist.remove(sn);
	}

	public SalesNote poorestSale() {
		SalesNote p;
		p = gulist.get(0);
		for(SalesNote s : gulist){
			if(s.getAmount()<p.getAmount()){
				p=s;
			}
		}
		p.toString();
		return p;
	}

	public int totalSales() {
		int sum = 0;
		for (SalesNote s : gulist) {
            sum = sum + s.getAmount();			
		}
		return sum;
	}

	public void printSales() {
	}

	public SalesNote bestSale() {
		SalesNote b;
		b = gulist.get(0);
		for (SalesNote s : gulist) {
			if (s.getAmount() > b.getAmount()) {
				b = s;
			}
		}
		return b;
	}

}
