package week9.exercise3;

public class Caesar {

    protected String cipher(String message, int shift) {
        String cipheredWord = "";
        for (int position = 0; position < message.length(); position++) {
            char character = (char) (message.charAt(position) + shift);
            if (character > 'z')
                cipheredWord += (char) (message.charAt(position) - (26 - shift));
            else
                cipheredWord += (char) (message.charAt(position) + shift);
        }
        return cipheredWord.toUpperCase();
    }
}

