package day44;

public abstract class BrowserAutomation {
	
	public abstract void open();
	
	public abstract void navigate(String url);
	
	public abstract void clickOnElement(String elementName);
	
	public abstract void close();
	
	public abstract void typeText(String content);
}
