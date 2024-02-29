public class Automaton {
    Alphabet alphabet;
    State[] states;
    public Automaton(int numberOfStates){
        states = new State[numberOfStates];
        for(int i = 0; i < states.length; i++){
            states[i] = new State(alphabet.getAlphabet().length);
        }

    }

    public void setAlphabet (Alphabet alphabet){
        this.alphabet = alphabet;
    }
}