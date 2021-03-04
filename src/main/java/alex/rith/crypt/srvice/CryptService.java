package alex.rith.crypt.srvice;

import org.springframework.stereotype.Service;

@Service
public class CryptService {
    public String cryptText(String text, int key) {
        return getCrypted(text, key);
    }

    private String getCrypted(String text, int key) {
        String out = "";
        for (int i = 0; i < text.length(); i++) {
            int index = (int) text.charAt(i);
            char cryptedChar = (char) (index + key);
            out += cryptedChar;
        }

        return out;
    }
}
