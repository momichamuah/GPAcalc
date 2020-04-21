
public class TaxApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double income = 41049;
		FilingStatusSingle taxSingle = new FilingStatusSingle();
		FilingStatusMarried taxMarried = new FilingStatusMarried();
		FilingStatusHeadOfHousehold taxHoH = new FilingStatusHeadOfHousehold();
		
		System.out.println("Total tax payable if Single:" + taxSingle.calculateTax(income));
		System.out.println("Total tax payable if Married:" + taxMarried.calculateTax(income));
		System.out.println("Total tax payable if Head of household:" + taxHoH.calculateTax(income));
		
	}

}
