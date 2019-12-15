import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String [] args){
        BufferedReader userInputReader= new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("Welcome Caesar Encryption Service");
            System.out.println("Input the  message you would like to send: ");
            String userMessage = userInputReader.readLine();

            System.out.println("Enter a shift key between 1-26  : ");
            int userShiftKey = Integer.parseInt(userInputReader.readLine());




        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

}
