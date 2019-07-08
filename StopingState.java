package State;

/**
 *
 * @author user
 */
public class StopingState implements State{

    @Override
    public void doAction(Myclass e) {
        System.out.println("Action on stoping State");
        e.setState(this);
    }
    
    @Override
      public String returnState(){
        return "Stoping State";
    }
}
