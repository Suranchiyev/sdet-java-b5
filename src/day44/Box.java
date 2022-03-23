package day44;

public interface Box {
	long MAX_SIZE = 100;
	
	void putInside(String item);
	
	String getItem(int index);
	
	int getNumberOfItems();
	
	String getItems();
}
