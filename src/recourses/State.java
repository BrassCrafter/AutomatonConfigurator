package recourses;

public class State {
    List<State>[] listsOfFollowingStates;
    private final String name;
    private final int index;
    private boolean isFinalState = false;
    public State(String name, int index) {
        this.name = name;
        this.index = index;
    }
    public String getName(){
        return this.name;
    }
    public int getIndex(){
        return this.index;
    }
    public void setFinalStateTrue(){
        this.isFinalState = true;
    }
    public boolean isFinalState(){
        return this.isFinalState;
    }
}

