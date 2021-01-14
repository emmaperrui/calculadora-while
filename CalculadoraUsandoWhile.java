
/**
 * Write a description of class CalculadoraUsandoWhile here.
 * 
 * @author (Emma) 
 * @version (1)
 */
public class CalculadoraUsandoWhile
{
    /**
     * Constructor for objects of class CalculadoraUsandoWhile
     */
    public void multiplosDeCinco(){
        int index = 15;
        while (index <= 90){
            System.out.println(index);
            index = index + 5;
        }
    }

    public void sumaDeValores (){
        int contador = 1;
        int suma = 0;
        while (contador <= 10){
            suma = suma + contador;
            contador++;
        }
        System.out.println("El total de la suma es " + suma); 
    }

    public int sumaDeValoresEnIntervalo(int a, int b){
        int resultado = 0;
        if (a >= 0 && b >= 0){
            if (b < a){
                int c = a;
                a = b;
                b = c;
            }
            while (a <= b){
                resultado = resultado + a;
                a++;
            }
        }else {
            System.out.println("Los números introducidos deben ser positivos");
            resultado = -1;
        }
        return resultado;

    }

    public boolean esPrimo(int n){
        boolean primo = true;
        if (n < 0){
            primo = false;
        }else if (n > 2){    
            int contador = 2;
            while (contador < n && primo){
                if (n % contador == 0){
                    primo = false;
                }
                contador++;
            }
        }
        return primo;
    }
}
