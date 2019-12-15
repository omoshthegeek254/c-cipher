package modules;

public class Decrypt {

    private String userMessage;
    private int shiftKey;


    public Decrypt(String userMessage, int shiftKey) {
        this.userMessage = userMessage;
        this.shiftKey = shiftKey;
    }

    public static String decrypt(Decrypt decode)
    {

        StringBuilder encryptedText = new StringBuilder();
        int length = decode.getUserMessage().length();
        for(int i = 0; i < length; i++){
            char myCharacter = decode.getUserMessage().charAt(i);
            if(Character.isLetter(myCharacter)){
                if(Character.isLowerCase(myCharacter)){
                    char newCharacter = (char)(myCharacter - decode.getShiftKey());
                    if(newCharacter < 'a'){
                        encryptedText.append((char) (myCharacter + (26 - decode.getShiftKey())));
                    }
                    else {
                        encryptedText.append(newCharacter);
                    }
                }
                else if(Character.isUpperCase(myCharacter)){
                    char newCharacter = (char)(myCharacter - decode.getShiftKey());
                    if(newCharacter < 'A'){
                        encryptedText.append((char) (myCharacter + (26 - decode.getShiftKey())));
                    }
                    else {
                        encryptedText.append(newCharacter);
                    }
                }
            }
            else {
                encryptedText.append(myCharacter);
            }
        }
        return encryptedText.toString();
    }

    public String getUserMessage() {
        return this.userMessage;
    }

    public int getShiftKey() {
        return this.shiftKey;
    }
}
