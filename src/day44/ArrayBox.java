package day44;

public class ArrayBox implements Box {
	private String[] data = new String[(int)Box.MAX_SIZE];
	private int i = 0;
	
	@Override
	public void putInside(String item) {
		data[i] = item;
		i++;
	}

	@Override
	public String getItem(int index) {
		return data[index];
	}

	@Override
	public int getNumberOfItems() {
		return i;
	}

	@Override
	public String getItems() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i = 0; i < this.i; i++) {
			sb.append(data[i]);
			
			if (i != this.i - 1) {
				sb.append(", ");
			}
		}
		sb.append("]");
		
		return sb.toString();
	}
}
