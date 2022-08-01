public class ROT13  {

    public Integer shift;

    ROT13(Character cs, Character cf) {
        if (cf - cs > 0) {
            this.shift = cf - cs;
        } else if (cf - cs < 0) {
            this.shift = cf - cs;
        }
    }

    ROT13() {
        this.shift = 13;
    }


    public String crypt(String text) throws UnsupportedOperationException {

        int shift = 13;
        StringBuilder s = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (c >= 'a' && c <= 'z') {
                c = (char) ((c - 'a' + shift) % 26 + 'a');
                s.append(c);

            } else if (c >= 'A'&& c <= 'Z') {
                c = (char) ((c - 'A' + shift) % 26 + 'A');
                s.append(c);

            } else {
                s.append(c);
            }

        } return s.toString();

    }

    public String encrypt(String text) {
        return crypt(text);
    }

    public String decrypt(String text) {
        return crypt(text);
    }

    public static String rotate(String s, Character c) {
        int shift = s.indexOf(c);
        return s.substring(shift) + s.substring(0, shift);
    }

}


