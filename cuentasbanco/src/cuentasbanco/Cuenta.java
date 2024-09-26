
package cuentasbanco;

public class Cuenta {
    protected double saldo;
    //acceso directo a saldo, en las clases hijas y
    //acceso indirecto  (usando objetos cuenta), 
    //desde clases en el mismo paquete
     public          Cuenta(double saldoInicial){
                saldo = saldoInicial;}
    public double consultar(){
            return saldo;
    }
    public void depositar(double monto){
        if (monto>0){
        saldo += monto;
        }
    }
    public void retirar(double monto){
        if (monto<=saldo){
        saldo -= monto;
        }
        else{
        System.out.println("Fondos insuficientes");}
    }
    
}
