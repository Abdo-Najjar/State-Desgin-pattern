package State;

/**
 *
 * @author user
 */
public class Main {

    public static void main(String[] args) {
        State s = new runningState();
        Myclass mc = new Myclass(s);
        System.out.println(mc.getState().returnState());
        s = new StopingState();
        mc.setState(s);
        System.out.println(mc.getState().returnState());

    }
}
