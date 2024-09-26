
package cuentasbanco;

public class CuentaDeAhorros extends Cuenta {
    private double tasaDeInteres;
    // a este elemento se tiene acceso de manera directa
    //UNICAMENTE 
    //pero de manera INDIRECTA 
  public CuentaDeAhorros(double saldoInicial, double tasaInteres){
      
        //recordar que la primera linea de código de un constructpr es: 
        // super(); , un llamado al constructor padre
        super(saldoInicial); // Cuenta(double saldoInicial
        tasaDeInteres = tasaInteres;
      }
  
  @Override //opcional sobreecribir un metodo de capa superior
          //programar un metodo que existe en el padre o abuelo o más arriba 
  public double consultar(){
      return saldo + (0.001*tasaDeInteres*saldo);
       }
}

