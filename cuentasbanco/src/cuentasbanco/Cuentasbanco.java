package cuentasbanco;

public class Cuentasbanco {
    public static void main(String[] args) {
            Cuenta c = new Cuenta(30000);
                  //c.saldo = -25000; //Acceso desde otra clase del mismo paquete
         System.out.println("saldo = " + c.consultar());
                  //Acceso a protected saldo, por que Cuentasbanco,
          //está en el mismo directorio
                   c.depositar(10000);
                   c.retirar(5000);
                   System.out.println("saldo = " + c.consultar());
                   CuentaDeAhorros ca = new CuentaDeAhorros(30000, 1);
                   System.out.println("saldo = " + ca.consultar());
    }
                
                    
   
    
}
