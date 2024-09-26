
package compositionbody;
public class Compositionbody {
    public static void main(String[] args) {
        // si fuera agregación:
        /*
        Hand h1 = new Hand();
        Hand h2 = new Hand();
        Leg legs[] = new Leg[2]; //crea arreglo de tipo leg, de tamaño 2, y cada elemento a null
        legs[0] = new Leg();
        legs[1] = new Leg();
        Person p1 = new Person(h1,h2,legs);
               p1.agregarHand(h1);
        p1 = null;
        Person p2 = new Person(h1,h2); 
//objetos no independientes, los objetos componentes no tienen un nombre propio
        */
        Person p1 = new Person();
                    //opc1. en el constructor se crean manos y piernas
                    //opc2.         OBJETOS ANONIMOS
        Person p3 = new Person( new Hand(), new Hand(), new Leg(), new Leg());
        p3.estado();
        p3=null;    //muere obj p3 y con el sus componentes
        
        p1.estado();
        p1=null;    //muere obj p1 y con el sus componentes
    }
    
}
