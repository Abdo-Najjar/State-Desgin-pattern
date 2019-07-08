package State;

/**
 *
 * @author user
 */
class Myclass {
     private State state;

    public Myclass(State s) {
        this.state =s;
    }
    

    public State getState() {
        return state;
    }

    public void setState(State s) {
        this.state = s;
        
    }
    
    
     
}
