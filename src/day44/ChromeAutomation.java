package day44;

public class ChromeAutomation extends BrowserAutomation {
	@Override
	public void open() {
		System.out.println("Open chrome browser");
	}
	
	@Override
	public void navigate(String url) {
		System.out.println("Navirage to url: " + url);
	}
	
	@Override
	public void clickOnElement(String elementName) {
		System.out.println("Clicked on " + elementName);
	}
	
	@Override
	public void close() {
		System.out.println("Chrome closed");
	}
	
	@Override
	public void typeText(String content) {
		System.out.println("Typed: " + content);
	}
}
