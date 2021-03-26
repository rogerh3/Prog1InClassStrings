
public class WorkingWithStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//letter methods - checking if it is a letter
		System.out.println(Character.isLetter('a')); 
		System.out.println(Character.isLetter('2')); 
		
		//digit method- checking if it is a digit
		System.out.println(Character.isDigit('a')); 
		System.out.println(Character.isDigit('2')); 

		//upper case 
		System.out.println(Character.isUpperCase('a'));
		System.out.println(Character.isUpperCase('A'));
		
		//creating a Character object
		char letter = 'A'; 
		Character ch = 'A'; 
		System.out.println(ch.charValue()); 
		
		Integer myInt = 5000;
		String myString = myInt.toString(); 
		System.out.println(myString.length()); 
		
		String str = "The Haunting of Bly Manor"; 
		if (str.startsWith("The")) {
			System.out.println("It does.");
		}else {
			System.out.println("It doesn't"); 
		}

		int first = str.indexOf("H"); 
		System.out.println("Your letter appears at index " + first); 
		
		//replace 
		String name = "Zachary"; 
		System.out.println(name.replace('a', 'u')); 
		
		
	}

}
