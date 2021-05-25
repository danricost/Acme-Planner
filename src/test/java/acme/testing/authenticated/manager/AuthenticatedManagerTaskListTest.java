package acme.testing.authenticated.manager;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.springframework.core.annotation.Order;

import acme.testing.AcmePlannerTest;

public class AuthenticatedManagerTaskListTest extends AcmePlannerTest {
	

	@ParameterizedTest
	@CsvFileSource(resources= "/authenticated.manager/positive.csv", encoding= "utf-8", numLinesToSkip = 1)
	@Order(10)
	public void listAll(final int recordIndex, final String Title, final String Beginning, final String End, final String Workload, final String Description, final String isPublic) {
		
		super.signIn("manager2", "manager2");
		
		super.clickOnMenu("Manager", "List my tasks");
		
		super.checkColumnHasValue(recordIndex, 0, Title);
		super.checkColumnHasValue(recordIndex, 1, Beginning);
		super.checkColumnHasValue(recordIndex, 2, End);
		super.checkColumnHasValue(recordIndex, 3, Workload);
		
		super.clickOnListingRecord(recordIndex);
		
		
		super.checkInputBoxHasValue("title", Title);
		super.checkInputBoxHasValue("initialMoment", Beginning);
		super.checkInputBoxHasValue("finalMoment", End);
		super.checkInputBoxHasValue("workload", Workload);
		super.checkInputBoxHasValue("description", Description);
		super.checkInputBoxHasValue("isPublic", isPublic);
		
		super.signOut();
		
	}
	
	

}
