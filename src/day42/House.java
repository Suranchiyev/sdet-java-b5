package day42;

public class House {
	public String type;
	public double price;
	public String address;
	public int numberOfRooms;
	public int numberOfFloors;
	public String kitchenStyle;
	public boolean isPoolThere;
	public double heightOfCililng;
	public int numberOfRestrooms;
	public boolean isGarageThere;
	
	@Override
	public String toString() {
		return "House [type=" + type + ", price=" + price + ", address=" + address + ", numberOfRooms=" + numberOfRooms
				+ ", numberOfFloors=" + numberOfFloors + ", kitchenStyle=" + kitchenStyle + ", isPoolThere="
				+ isPoolThere + ", heightOfCililng=" + heightOfCililng + ", numberOfRestrooms=" + numberOfRestrooms
				+ ", isGarageThere=" + isGarageThere + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (isGarageThere ? 1231 : 1237);
		result = prime * result + (isPoolThere ? 1231 : 1237);
		result = prime * result + numberOfFloors;
		result = prime * result + numberOfRestrooms;
		result = prime * result + numberOfRooms;
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		House other = (House) obj;
		if (isGarageThere != other.isGarageThere)
			return false;
		if (isPoolThere != other.isPoolThere)
			return false;
		if (numberOfFloors != other.numberOfFloors)
			return false;
		if (numberOfRestrooms != other.numberOfRestrooms)
			return false;
		if (numberOfRooms != other.numberOfRooms)
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	public House(String type, double price, String address, int numberOfRooms, int numberOfFloors, String kitchenStyle,
			boolean isPoolThere, double heightOfCililng, int numberOfRestrooms, boolean isGarageThere) {
		this.type = type;
		this.price = price;
		this.address = address;
		this.numberOfRooms = numberOfRooms;
		this.numberOfFloors = numberOfFloors;
		this.kitchenStyle = kitchenStyle;
		this.isPoolThere = isPoolThere;
		this.heightOfCililng = heightOfCililng;
		this.numberOfRestrooms = numberOfRestrooms;
		this.isGarageThere = isGarageThere;
	}

	public House(String type, double price, String address) {
		this.type = type;
		this.price = price;
		this.address = address;
	}
	
	public House() {}
}
