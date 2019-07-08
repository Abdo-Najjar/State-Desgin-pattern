package State;

/**
 *
 * @author user
 */
public class runningState implements State{

    @Override
    public void doAction(Myclass e) {
        System.out.println("Action is running ... ");
        e.setState(this);
    }
    
    @Override
    public String returnState(){
        return "running State";
    }
    
}
