package logic;
import recourses.*;

public class Automaton {
    Alphabet alphabet;
    Map map;
    String word;
    List<State> activeStates;

    public Automaton(Map map, Alphabet alphabet, State start) {
        activeStates = new List<>();
        activeStates.append(start);
        this.map = map;
        this.alphabet = alphabet;
    }
    public boolean checkWord(String word) {
        this.word = word;
        while (!this.word.isEmpty()) {
            List<State> tempList = new List<>();
            char character = getCurrentChar();

            if (alphabet.whereIsIt(character) == -1) return false;

            for (activeStates.toFirst(); activeStates.hasAccess(); activeStates.next()) {
                tempList.concat(map.getFollowingStatesOf(activeStates.getContent().getIndex(), alphabet.whereIsIt(character)));
            }
            activeStates = tempList;
        }
        for (activeStates.toFirst(); activeStates.hasAccess(); activeStates.next()) {
            if (activeStates.getContent().isFinalState()) {
                return true;
            }
        }
        return false;
    }
    private char getCurrentChar() {
        char first = word.charAt(0);
        word = word.substring(1);
        return first;
    }

    public static void main(String[] args) {
        Alphabet alphabet = new Alphabet(new char[]{'a','b'});
        State[] states = new State[]{new State("q0", 0), new State("q1", 1), new State("q2", 2)};
        states[0].setFinalStateTrue();
        states[1].setFinalStateTrue();
        Map map = new Map(states, alphabet);
        map.addAssociation("q0", 'a', "q1");
        map.addAssociation("q0", 'b', "q1");
        map.addAssociation("q0", 'b', "q2");
        map.addAssociation("q1", 'b', "q2");
        map.addAssociation("q2", 'a', "q1");
        Automaton nea2 = new Automaton(map, alphabet, states[0]);
        String word = "ab";
        System.out.println(word + " is valid = " + nea2.checkWord(word));
    }
}