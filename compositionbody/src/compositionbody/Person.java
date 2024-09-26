
package compositionbody;

public class Person {
    private Leg left_leg;
    private Leg right_leg;
    private Hand [] hands;
    
            Person(){
            left_leg = new Leg();
            right_leg = new Leg();
            hands = new Hand[2];
                hands[0] = new Hand();
                hands[1] = new Hand();      
                    }
            
    void estado(){
        System.out.println("left_leg =" + left_leg);
        System.out.println("right_leg =" + right_leg);
        System.out.println("left_leg =" + left_leg);
        System.out.println("left_leg =" + left_leg);
    }
    
}
