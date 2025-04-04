package calculoimc;
/**
 *
 * @author 00355682
 */
public class Obeso {
    //Atributos de entrada
    float altura;
    int peso;
    
    
    // Construtor(es)
    public Obeso(int peso, float altura){
    this.peso = peso;
    this.altura = altura;
    }
    
  //Métodos de saída
    public float imc(){
    return peso/(altura*altura);    
    }
    
    public String grauObesidade(){
    String saida = "\n Grau de Obesidade e Risco à Saúde: \n ";
    
    if (this.imc() < 18.5){
        saida += "Abaixo do Peso - Alto Risco à Saúde";
    }
    else if (this.imc() < 24.9f)
        saida += "Peso Normal - Baixo Risco à Saúde";
    else if (this.imc() < 29.9f)
        saida += "Acima do Peso - Risco Moderado à Saúde";
    else if (this.imc() < 34.9f)
        saida += "Obesidade Grau I - Alto Risco à Saúde";
    else
        saida += "Obesidade Extrema - Altíssimo Risco à Saúde";
    
        return saida;
    }
    
   //Método de exibição padrão
    @Override
    public String toString(){
        String saida = "Calculo do Índice de Massa Corporal\n";
        saida += "\nPeso (kg): " +this.peso;
        saida += "\nAltura (m): " + this.altura;
        saida += "\nIMC = " + this.imc();
        saida += "\n" + this.grauObesidade();
        return saida;
    }
}
