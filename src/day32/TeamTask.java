package day32;

public class TeamTask {
	public static void main(String[] args) {
		String[][] teams = {
				{"Yulduz", "Mark", "Akylbek", "Daniel"},
				{"Ariunna", "Frank", "Nurgazy", "Anna"},
				{"Selvin", "Meerim", "Gulzhanna", "Rocio"},
				{"Job", "Evelyn", "Edil", "Aizhamal"},
				{}};
		
		System.out.println(teams[1][1]);
		System.out.println(teams[3][2]);
		System.out.println("----------");
		
		// Find out total number of chars of all elements in the array
		int totalLength = 0;
		for (int i = 0; i < teams.length; i++) {
			for (int j = 0; j < teams[i].length; j++) {
				totalLength = totalLength + teams[i][j].length();
				// System.out.println(teams[i][j].length());
			}
		}
		System.out.println("Length: " + totalLength);
		
		// print only names with even length from teams array
		for (int i = 0; i < teams.length; i++) {
			for (int j = 0; j < teams[i].length; j++) {
				if (teams[i][j].length() % 2 == 0) {
					System.out.println(teams[i][j]);
				}
			}
		}
	}
}
