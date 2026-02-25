import java.util.Scanner;

public class CaesarCipher {
    public static String encrypt(String text, int shift) {
        StringBuilder result = new StringBuilder();

        // for-each loop
        for (char character : text.toCharArray()) {
            //if character is letter than encrypt
            if(Character.isLetter(character))
            {
                //setting base character
                char base = Character.isLowerCase(character) ? 'a' : 'A';
                //finding index of the letter and then shifting it n places. %26 to make sure after z it starts again from a
                char shifted = (char) ((character-base+shift)%26+base);
                result.append(shifted); //appending the shift to our string result
            }
            //if not letter than append the character
            else
            {
                result.append(character);
            }
        }
        return result.toString(); // returning result to String
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        //input for text
        System.out.print("Enter a sentence to encrypt: ");
        String text = scan.nextLine();
        //input for shifts
        System.out.print("How many spaces to shift? (0-25): ");
        int shift = scan.nextInt();

        //displaying message
        String encryptedMessage = encrypt(text, shift);
        System.out.println("Encrypted message is: "+encryptedMessage);

    }
}
