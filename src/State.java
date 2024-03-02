public class State {
    List<State>[] listsOfFollowingStates;
    private final String name;
    private boolean isFinalState = false;
    public State(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setFinalStateTrue(){
        isFinalState = true;
    }
    public boolean isFinalState(){
        return isFinalState;
    }
}

