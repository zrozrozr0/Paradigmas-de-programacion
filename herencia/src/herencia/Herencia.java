package herencia;

import secundario.Padre;

public class Herencia {

    public static void main(String[] args) {
               Padre p = new Padre();
                    // p.  // tiene 9 metodos + 1 metodo (el local) = 10 metodos
               Hija  h = new Hija();
                    // h. // tiene 10 metodos por herencia
               Nieto n = new Nieto();
                     n.    // tiene 15 metodos, heredados de padre e hija
    }
    
}
