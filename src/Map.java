public class Map {
    List<State>[][] map;
    public Map(int lengthOfStates, int lengthOfAlphabet){
        map = new List[lengthOfStates][lengthOfAlphabet];
    }
    public void addAssoziation(int indexOfState, int indexOfAlphabet, State assoziatedState){
        map[indexOfState][indexOfAlphabet].append(assoziatedState);
    }
    public List<State> getAssoziation(int indexOfState, int indexOfAlphabet)

}
