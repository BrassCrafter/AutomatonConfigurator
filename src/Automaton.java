public class Automaton {
    Alphabet alphabet;
    Map map;
    String word;
    List<State> activeStates;
    public Automaton(Map map, Alphabet alphabet, State start){
        activeStates = new List<>();
        activeStates.append(start);
        this.map = map;
        this.alphabet = alphabet;
    }
    public void checkWord(String word){
        this.word = word;
        while(word != ""){

            char zeichen = getCurrentChar();
            for(activeStates.toFirst(); activeStates.hasAccess(); activeStates.next()){

            }

        }
    }
    private char getCurrentChar() {
        char first = word.charAt(0);
        word = word.substring(1);
        return first;
    }

    public static void main(String[] args) {

    }
}