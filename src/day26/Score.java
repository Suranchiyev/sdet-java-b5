package day26;

public class Score {
	public static void main(String[] args) {
		// Array is collection of data of the same type.
		//   0   1   2   3   4   5
		// {[80][70][50][90][60]}
		int[] score = new int[5];
		score[0] = 80;
		score[1] = 70;
		score[2] = 50;
		score[3] = 90;
		score[4] = 60;
		
		System.out.println(score[0]); // 80
		System.out.println(score[1]); // 70
		System.out.println(score[2]); // 50
		System.out.println(score[3]); // 90
		System.out.println(score[4]); // 60
		
		// score[5] = 100; // ArrayIndexOutOfBoundException
		// System.out.println(score[5]); // ArrayIndexOutOfBoundException
		
		// TODO assign first element of array score to the sum of last and second.
		score[0] = score[1] + score[4];
		System.out.println(score[0]); // 130
	}
}
