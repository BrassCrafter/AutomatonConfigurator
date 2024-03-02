package recourses;

public class Alphabet {
    char[] alphabet;
    public int length;
    public Alphabet(char[] alphabet){
        this.alphabet = alphabet;
        this.length = alphabet.length;
    }
    public char[] getAlphabet(){
        return alphabet;
    }
    public int whereIsIt(char character) {
        for (int i = 0; i < alphabet.length; i++)
            if (alphabet[i] == character)
                return i;
        return -1;
    }
    public char getCharAt(int i){
        return alphabet[i];
    }

    public static void main(String[] args) {
        char[] alphabetArr = new char[]{'a', 'b', 'c'};
        Alphabet alphabet = new Alphabet(alphabetArr);
        for(int i = 0; i < alphabet.getAlphabet().length; i++)
            System.out.println(alphabet.getAlphabet()[i]);
    }
}
