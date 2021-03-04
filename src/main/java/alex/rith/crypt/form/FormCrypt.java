package alex.rith.crypt.form;

public class FormCrypt {
    private String text = "";
    private String cryptedText = "";
    private int key;


    public FormCrypt() {
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public FormCrypt(String text, String cryptedText) {
        this.text = text;
        this.cryptedText = cryptedText;
    }

    public FormCrypt(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getCryptedText() {
        return cryptedText;
    }

    public void setCryptedText(String cryptedText) {
        this.cryptedText = cryptedText;
    }

    @Override
    public String toString() {
        return "FormCrypt{" +
                "text='" + text + '\'' +
                ", cryptedText='" + cryptedText + '\'' +
                '}';
    }
}
