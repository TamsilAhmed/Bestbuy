package testcases;

import org.testng.annotations.Test;

import pages.BestBuyAuto;

public class TestCase1 extends BestBuyAuto {
	@Test

	public void test() throws Exception {

		BestBuyAuto sp = new BestBuyAuto();
		
		sp.buttonclick();
		
		sp.emailcheck();
		
		sp.signinType("tomhardyat0@gmail.com", "tomhardyat0");
		
		sp.hardrefresh();
		
		sp.signinType("tomhardyat0@gmail.com", "tomhardyat0");
		
		try {
		sp.alerthandling();
		
		sp.AccountHeader();

		sp.Welcomepage();
		}catch(Exception e) {
			e.getMessage();
		}
		
		sp.ShopByDepartment();

		sp.Continue();

		sp.ShopByBrands();

		sp.Continue();

		sp.cartclick();

		sp.cartdetails("4410311052186498", "776");

		sp.paymentdetails("Tamsil", "Ahmed", "3920 Star Trek Drive", "Panama City", "32405");
		
		
	}

}
