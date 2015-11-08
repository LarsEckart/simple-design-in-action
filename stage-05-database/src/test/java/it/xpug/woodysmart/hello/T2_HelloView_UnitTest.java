package it.xpug.woodysmart.hello;

import static org.junit.Assert.*;
import it.xpug.woodysmart.util.*;

import org.junit.*;

public class T2_HelloView_UnitTest {

	private FakeHttpServletResponse response = new FakeHttpServletResponse();
	private HelloView helloView = new HelloView(response);

	/*
	 * We are reimplementing the view with the Freemarker template language.
	 *
	 * The template is in file src/main/templates/hello.ftl
	 *
	 * The HelloView class is now implemented with the help of the TemplateView class
	 */

	@Test
    public void showHello() throws Exception {
		helloView.showHello("Foobar");

		assertEquals("<p>Hello, Foobar!</p>", response.getBody());
    }

	@Test@Ignore
    public void showMethodNotAllowed() throws Exception {
		helloView.showMethodNotAllowed();

		assertEquals("Method not allowed", response.getBody());
		assertEquals(405, response.getStatusCode());
    }

	/*
	 * Now is a good time to start the application and test it manually!
	 *
	 * And also remember to un-ignore the T0_HelloWorld_AcceptanceTest
	 * and check that they now work!
	 */
}
