
package static_keyword;

public class Static_keyword {
    public static void main(String[] args) {
            String frase = "Escom IPN";
            
        System.out.println("frase length = " + frase.length());
        System.out.println("frase 0-4 = " + frase.substring(0,5));
        System.out.println("frase E x % " + frase.replace('E', '%'));
        
        System.out.println("123.567 =" + String.valueOf(123.567).substring(0,2));
        System.out.println("C_I_O= " + String.CASE_INSENSITIVE_ORDER);
        double x = 12.23;
        System.out.println(" = " + String.format("cad = %s x = %f", "Poli",x));
        
        System.out.println("Pi = " + Math.PI);
        System.out.println("e = " + Math.E);
        System.out.println("1K = " + Math.pow(2,10));
        System.out.println("Raiz cubo de 27 = " + Math.pow(2,10));
        System.out.println("hyp = " + Math.hypot(4, 8));
        System.out.println("Redondeo = " + Math.floor(1.9));
        
        System.out.println("Euler elevado a la 2 =" + Math.exp(2));
        System.out.println("Euler = " + Math.log(Math.exp(2)));
   /*     Métodos de objeto, porque requieren informacón
                del objeto, (frase). */
    }
}
