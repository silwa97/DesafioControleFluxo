import java.util.Scanner;

public class Contador { 
    public static void main(String[] args) throws Exception {
        int primeiroNumero = 0;
        int segundoNumero = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        primeiroNumero = scanner.nextInt();

        System.out.println("Digite outro numero: ");
        segundoNumero = scanner.nextInt();    

        try {
            
            if(primeiroNumero > segundoNumero){
                throw new ParametroInvalidosException("segundo numero deve ser maior que o primeiro");
            }
            else{
                conta(primeiroNumero, segundoNumero);
            }
                 
        } catch (ParametroInvalidosException e) {
            System.err.println(e.getMessage());
        }
        
    }
    static void conta(int numero1, int numero2) throws ParametroInvalidosException{
        
        for(int i = 1; i <= (numero2-numero1); i++){
            System.out.println("imprimindo numero " + i);
        }        
    }
    
}
class ParametroInvalidosException extends Exception{
        public ParametroInvalidosException(String message){
            super(message);
        }
}
