package books;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class BooksTest {

	@Test
	public void displayBooksPage() {
		Reporter.log("Books page is displayed", true);
	}
}
