import java.util.ArrayList;

public class Elgamal {

    public ArrayList<Character> chars;

    public Elgamal() {

        chars = new ArrayList<>();

        chars.add('А');
        chars.add('Б');
        chars.add('В');
        chars.add('Г');
        chars.add('Д');
        chars.add('Е');
        chars.add('Ё');
        chars.add('Ж');
        chars.add('З');
        chars.add('И');
        chars.add('Й');
        chars.add('К');
        chars.add('Л');
        chars.add('М');
        chars.add('Н');
        chars.add('О');
        chars.add('П');
        chars.add('Р');
        chars.add('С');
        chars.add('Т');
        chars.add('У');
        chars.add('Ф');
        chars.add('Х');
        chars.add('Ц');
        chars.add('Ч');
        chars.add('Ш');
        chars.add('Щ');
        chars.add('Ъ');
        chars.add('Ы');
        chars.add('Ь');
        chars.add('Э');
        chars.add('Ю');
        chars.add('Я');
        chars.add(' ');
        chars.add('.');
        chars.add(',');

    }

    public int[] chars(String message) {

        message = message.toUpperCase();

        int[] c = new int[message.length()];

        for (int i = 0; i < message.length(); i++) {

            c[i] = this.chars.indexOf(message.charAt(i));

        }

        return c;

    }

    public String charsTo(int... chars) {

        String result = "";

        for (int i: chars) {

            result += this.chars.get(i);

        }

        return result;

    }

}
