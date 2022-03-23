package day44;

public class Grademe {
	public static void main(String[] args) {
		SafariAutomation automation = new SafariAutomation();
		//ChromeAutomation automation = new ChromeAutomation();
		automation.open();
		automation.navigate("http://grademe.us-east-1.elasticbeanstalk.com/");
		
		automation.clickOnElement("login");
		// more code
		
		automation.close();
		
		
	}
}
