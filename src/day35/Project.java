package day35;

public class Project  {
  	public static void main(String[] args) {
    	// String strCard = args[0];
  		String strCard = "523523235235";
  		
    	// converts strCard to int array
        int[] cardArr = new int[strCard.length()];
        for (int i = 0; i < strCard.length(); i++) {
        	
        	// check if it is digit 
            if (Character.isDigit(strCard.charAt(i))) {
                cardArr[i] = Integer.parseInt(String.valueOf(strCard.charAt(i)));
            } else {
                System.out.println("INVALID");
                return; // exits from the main method
            }
        }
      
        String cardStr = "";
        // every other number from second to last digit * 2
        for (int i = cardArr.length - 2; i >= 0; i -= 2) {
        	cardStr += (cardArr[i] * 2);
        }
        
        int sum = 0;
        // get sum of each product
        for (char ch : cardStr.toCharArray()) {
            sum += Integer.parseInt(String.valueOf(ch));
        }
        
        // get rest of the card numbers that wasn't multiplied 2
        for (int i = cardArr.length - 1; i >= 0; i -= 2) {
            sum += cardArr[i];
        }
        
        // check if Lunhn's algo is correct in not print INVALID and exit from main method
        if (sum % 10 != 0) {
            System.out.println("INVALID");
            return;
        }
        
        // TODO
        System.out.println("Card is valid but need to figure out type");
    } 
	
}