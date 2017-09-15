package salesnote;

public class Driver {
     public static void main(String[] args){
    	SalesNote sn1 = new SalesNote("2017-02-06", "apple", 5);
 		SalesNote sn2 = new SalesNote("2017-02-06", "pen", 10);
 		System.out.println(sn1.toString());
 		System.out.println(sn2.toString());
 		SalesPerson gu = new SalesPerson();
 		gu.add(sn1);
 		gu.add(sn2);
 		gu.poorestSale();
 		System.out.println(gu.totalSales());
     }
}
