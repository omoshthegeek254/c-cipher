package modules;

public class Encrypt {

    private String userMessage;
    private int shiftKey;


    public Encrypt(String userMessage, int shiftKey) {
        this.userMessage = userMessage;
        this.shiftKey = shiftKey;
    }

    public static String cipherText(Encrypt encode) {
        StringBuilder messageCharStream = new StringBuilder();
        int length = encode.getUserMessage().length();
        for (int i = 0; i < length; i++) {
            char character = encode.getUserMessage().charAt(i);
            if (Character.isLetter(character)) {
                if (Character.isLowerCase(character)) {
                    char encodedCharacter = (char) (character + encode.getShiftKey());
                    if (encodedCharacter > 'z') {
                        messageCharStream.append((char) (character - (26 - encode.getShiftKey())));
                    } else {
                        messageCharStream.append(encodedCharacter);
                    }
                } else if (Character.isUpperCase(character)) {
                    char encodedCharacter = (char) (character + encode.getShiftKey());
                    if (encodedCharacter > 'Z') {
                        messageCharStream.append((char) (character - (26 - encode.getShiftKey())));
                    } else {
                        messageCharStream.append(encodedCharacter);
                    }
                }
            } else {
                messageCharStream.append(character);
            }
        }
        return messageCharStream.toString();
    }

    public String getUserMessage() {
        return this.userMessage;
    }

    public int getShiftKey() {
        return this.shiftKey;
    }

}
