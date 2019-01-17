package com.kerb.test.Scenarios;

import org.testng.annotations.Test;

import com.kerb.core.base.SupportTest;
import com.kerb.core.pages.BookingsPage;
import com.kerb.core.pages.FindSpacePage;
import com.kerb.core.pages.LeaseSpacePage;

public class RouteToFindSpace_LeaseSpace_Bookings extends SupportTest {
	FindSpacePage fsp;
	LeaseSpacePage lsp;
	BookingsPage bp;
	
	@Test()
	public void routeToFindSpace_LeaseSpace_Bookings() throws InterruptedException{
		fsp = new FindSpacePage(driver);
		fsp.clickOnFindASpaceTab();
		fsp.verifyFindSpaceHeadingisAppearOrNot();
		lsp=new LeaseSpacePage(driver);
		lsp.clickOnLeaseASpaceTab();
		lsp.verifyLeaseHeadingisAppearOrNot();
		bp=new BookingsPage(driver);
		bp.clickOnBookingsTab();
		bp.verifyBookingsHeadingisAppearOrNot();
	}
	
	

}
