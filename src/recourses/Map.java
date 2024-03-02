package recourses;


public class Map {
    List<State>[][] map;
    State[] states;
    Alphabet alphabet;
    public Map(State[] states, Alphabet alphabet){
        this.states = states;
        this.alphabet = alphabet;
        map = new List[states.length][alphabet.length];
        for (int i = 0; i < states.length; i++) {
            for (int j = 0; j < alphabet.length; j++) {
                map[i][j] = new List<>();
            }
        }
    }
    public void addAssociation(String state, char character, String associatedState){
        int indexAlphabet = alphabet.whereIsIt(character), indexState = whereIsStateInArray(state), indexAssociatedState = whereIsStateInArray(associatedState);
        if( indexAlphabet != -1 && indexState != -1 && indexAssociatedState != -1){
            map[indexState][indexAlphabet].append(states[indexAssociatedState]);
        }else{
            System.out.println("indexAlphabet: " + indexAlphabet + " | " + "indexState: " + indexState + " | " + "indexAssociatedState: " + indexAssociatedState);
        }
    }
    public int whereIsStateInArray(String state){
        for(int i = 0; i < states.length; i++){
            if(states[i].getName().equals(state)) return i;
        }
        return -1;
    }
    public List<State> getFollowingStatesOf(int indexOfState, int indexOfAlphabet){
        return map[indexOfState][indexOfAlphabet];
    }

}
