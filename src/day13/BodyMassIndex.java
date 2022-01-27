package day13;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String args[]) {
    	Scanner scanner = new Scanner(System.in);
    	
    	System.out.println("Enter name:");
        String name = scanner.next() + scanner.nextLine();
        
        System.out.println("Enter punds:");
        int pounds = scanner.nextInt();
        
        System.out.println("Enter feet:");
        int feet = scanner.nextInt();
        
        System.out.println("Enter inches:");
        int inches = scanner.nextInt();
        // before submit into grademe, you need to remove above code replace with original one

        double mass = getMassInKilograms(pounds);
        double heightMeters = getHeightInMeters(feet, inches);
        double bmi = calculateBMI(mass, heightMeters);
        String healthRisk = getHealthRiskBasedOnBMI(bmi);

        System.out.println("Name: " + name);
        System.out.println("BMI: " + bmi);
        System.out.println("Health risk: " + healthRisk);
    }

    private static double getMassInKilograms(int pounds) {
    	return pounds * 0.45;
    }

    private static double getHeightInMeters(int feet, int inches) {
        return 0.0;
    }

    private static double calculateBMI(double massInKilo, double heightInMeters) {
    	return 0.0;
    }

    private static String getHealthRiskBasedOnBMI(double bmi) {
    	return "Normal weight.";
    }
}
