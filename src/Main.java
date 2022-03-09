//Ein gutes Passwort sollte zum Beispiel mindestens
//
//acht Zeichen,
//zwei Buchstaben,
//zwei Ziffern,
//ein Gross- und ein Kleinbuchstabe,
//ein Sonderzeichen enthalten und

import Prog1Tools.IOTools; 

public class Main {

	public static void main(String[] args) {
		
		int i, i_letter, i_character, i_number, check_letterBig, check_letterSmall, check_character, check_number;
		String password, result;
		char [] password_array;
		char [] lettersBig = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'V', 'X', 'Y', 'Z'};
		char [] lettersSmall = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		char [] character = {'!', '"', '#', '$', '%', '&', '(', ')', '*', '+', ',', '-', '.', '/', ':', ';', '<', '=', '>', '?', '@', '[', '\'', ']', '^', '_', '`', '{', '|', '}', '~'};
		int [] number = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		
		password = IOTools.readString("Geben Sie ein Passwort ein: ");
		
		password_array = password.toCharArray();
		result = "";
		check_letterBig = 0;
		check_letterSmall = 0;
		check_character = 0;
		check_number = 0;
		
		if (password_array.length < 8) {
			result = "Passwort ist nicht sicher.";
		} else {
			for (i = 0; i < password_array.length; i++) {
				for (i_letter = 0; i_letter < lettersBig.length; i_letter++) {
					if (password_array[i] == lettersBig[i_letter]) {
						check_letterBig++;
					}
					
					if (password_array[i] == lettersSmall[i_letter]) {
						check_letterSmall++;
					}
				}
			}
			
			for (i = 0; i < password_array.length; i++) {
				for (i_character = 0; i_character < character.length; i_character++) {
					if (password_array[i] == character[i_character]) {
						check_character++;
					}
				}
			}
			
			for (i = 0; i < password_array.length; i++) {
				for (i_number = 0; i_number < number.length; i_number++) {
					if (password_array[i] == number[i_number]) {
						check_number++;
					}
				}
			}
			
		}
		
		if (check_letterBig >= 1 && check_letterSmall >= 1 && check_character >= 1 && check_number >= 2) {
			result = "Das Passwort ist sicher!";
		} else {
			result = "Das Passwort ist nicht sicher!";
		}
		
		System.out.println();
		System.out.println(result);
		System.out.println();
		System.out.println("Eigenschaften des sicheren Passworts: ");
		System.out.printf("%-35s %-3s", "- Mindestens 8 Zeichen ", password_array.length);
		System.out.println();
		System.out.printf("%-35s %-3s", "- Mindestens 1 groﬂe Buchstabe ", check_letterBig);
		System.out.println();
		System.out.printf("%-35s %-3s", "- Mindestens 1 kleine Buchstabe ", check_letterSmall);
		System.out.println();
		System.out.printf("%-35s %-3s","- Mindestens 1 Sonderzeichen ", check_character);
		System.out.println();
		System.out.printf("%-35s %-3s", "- Mindestens 2 Zahlen ", check_number);

	}

}
