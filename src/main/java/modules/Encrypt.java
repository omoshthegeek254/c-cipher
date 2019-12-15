package modules;

public class Encrypt {

    private String rawText;
    private int shiftKey;


    public Encrypt(String rawText, int shiftKey) {
        this.rawText = rawText;
        this.shiftKey = shiftKey;
    }

    public static String cipherText(Encrypt encode) {
        StringBuilder messageCharStrem = new StringBuilder();
        int length = encode.getRawText().length();
        for (int i = 0; i < length; i++) {
            char character = encode.getRawText().charAt(i);
            if (Character.isLetter(character)) {
                if (Character.isLowerCase(character)) {
                    char encodedCharacter = (char) (character + encode.getShiftKey());
                    if (encodedCharacter > 'z') {
                        messageCharStrem.append((char) (character - (26 - encode.getShiftKey())));
                    } else {
                        messageCharStrem.append(encodedCharacter);
                    }
                } else if (Character.isUpperCase(character)) {
                    char encodedCharacter = (char) (character + encode.getShiftKey());
                    if (encodedCharacter > 'Z') {
                        messageCharStrem.append((char) (character - (26 - encode.getShiftKey())));
                    } else {
                        messageCharStrem.append(encodedCharacter);
                    }
                }
            } else {
                messageCharStrem.append(character);
            }
        }
        return messageCharStrem.toString();
    }

    public String getRawText() {
        return this.rawText;
    }

    public int getShiftKey() {
        return this.shiftKey;
    }

}
