/**
 * Faça um progama para determinar o Imc do usuário e avaliar se ele está
 * saudável
 * 
 * Imc = peso(kg)/altura2(m)
 */
package calculoimc;
import java.util.Scanner;
/**
 *
 * @author 00355682
 */
public class CalculoImc {
    
    /**
    @param args command line arguments
    */        
    public static void main(String[] args) {
        // Declaração dos objetos de interesses
       Obeso obeso;

    // Interface com o Usúario
    Scanner scan = new Scanner(System.in);
    System.out.print("Qual seu Peso (kg)? ");
    int peso = scan.nextInt();
    System.out.print("Qual sua Altura (m)? ");
    float altura = scan.nextFloat();
    
    // Instanciação do objeto
    obeso = new Obeso(peso, altura);
    System.out.println(obeso);
    
    }
    
}