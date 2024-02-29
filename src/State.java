public class State {
    List<State>[] listsOfFollowingStates;
    private boolean isFinalState = false;
    public State(int lengthOfAlphabet) {
        listsOfFollowingStates = new List[lengthOfAlphabet];
    }

    public List<State> getFollowingStatesOf(int i) {
        return listsOfFollowingStates[i];
    }

    public void setFollowingStateOf(int i, List<State> followingStates) {
        listsOfFollowingStates[i].concat(followingStates);
    }
    public void setFinalStateTrue(){
        isFinalState = true;
    }
    public boolean isFinalState(){
        return isFinalState;
    }
}

