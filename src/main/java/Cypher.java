public class Cypher {

    public  static String encrypt(String plaintext, int shift){
        if(shift>26){
            shift =shift%26;
        }
        else if (shift<0){
            shift = (shift%26)+26;

        }

        String cipherText ="";
        int length = plaintext.length();
        for (int i=0;i<length;i++){
            char ch =plaintext.charAt(i);
            if (Character.isLetter(ch)){
                if (Character.isLowerCase(ch)){
                    char c = (char)(ch+shift);
                    if (c>'z'){
                        cipherText +=(char)(ch-(26-shift));
                    }else {
                        cipherText +=c;
                    }

                }else if (Character.isUpperCase(ch)){

                    char c = (char)(ch+shift);
                    if (c>'Z'){
                        cipherText +=(char)(ch-(26-shift));
                    }

                }

            }else {
                cipherText +=ch;
            }
        }
        return cipherText;
    }



    //decrypt

    public  static String decrypt(String plaintext, int shift){

            if(shift>26){
                shift =shift%26;
            }
            else if (shift<0){
                shift = (shift%26)+26;

            }

            String cipherText ="";
            int length = plaintext.length();
            for (int i=0;i<length;i++){
                char ch =plaintext.charAt(i);
                if (Character.isLetter(ch)){
                    if (Character.isLowerCase(ch)){
                        char c = (char)(ch-shift);
                        if (c<'a'){
                            cipherText +=(char)(ch+(26-shift));
                        }else {
                            cipherText +=c;
                        }

                    }else if (Character.isUpperCase(ch)){

                        char c = (char)(ch-shift);
                        if (c>'A'){
                            cipherText +=(char)(ch+(26-shift));
                        }

                    }

                }else {
                    cipherText +=ch;
                }
            }
            return cipherText;
        }

    //main
    public static void main(String [] args){
        String text = "my name is omoshthegeek";
        String cipher =encrypt(text,2 );
        System.out.println("Your Encrypted message is : ===>" +cipher);
        String decrypted =decrypt(cipher,5);
        System.out.println("Your Decrypted message is : ===>" + decrypted);
    }

}
