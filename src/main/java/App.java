import modules.Encrypt;
import modules.Decrypt;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {
        BufferedReader readerConsole = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("<====Welcome to Caesar Encryption Application====>");
            System.out.println("Enter the message you would like to encode : ");
            String userInput = readerConsole.readLine();

            System.out.println("Enter the Shift key between 1-26: ");
            int userShift = Integer.parseInt(readerConsole.readLine());

            //System.out.println("Input String: " + userInput);

            Encrypt userInputEncrypt = new Encrypt(userInput, userShift);
            String encryptedMessage = Encrypt.cipherText(userInputEncrypt);
            System.out.println("Your Encrypted Message is : \n =====>OUTPUT<=====\n" + encryptedMessage +"\n=====================");

            Decrypt caesar = new Decrypt(encryptedMessage, userShift);
            String decrypted = Decrypt.decrypt(caesar);
            System.out.println("Your Original / Decrypted Message is : \n=====>OUTPUT<====== \n" + decrypted +"\n=====================");

            System.out.println("\n");
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
}
