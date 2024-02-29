public class Alphabet {
    char[] alphabet;
    public Alphabet(char[] alphabet){
        this.alphabet = alphabet;
    }
    public char[] getAlphabet(){
        return alphabet;
    }
    public boolean isInAlphabet(char character){
        for(int i = 0; i < alphabet.length; i++)
            if(alphabet[i] == character)
                return true;
        return false;
    }

    public static void main(String[] args) {
        char[] alphabetArr = new char[]{'a', 'b', 'c'};
        Alphabet alphabet = new Alphabet(alphabetArr);
        for(int i = 0; i < alphabet.getAlphabet().length; i++)
            System.out.println(alphabet.getAlphabet()[i]);
    }
}
