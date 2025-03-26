package maratona.java.introducao;

public class Aula21EscruturasCondicionais04 {
    // $ 0     a 34712    9,70% 
    // 34713 a 68507 37,75 % 
    // acima 68508 a 49,50 %

    public static void main(String[] args) {
        double salario = 34712 ; 
        double faixaUm = 9.70 / 100  ;
        double faixaDois = 37.75 / 100  ;
        double faixatres = 49.50 / 100  ;  
        double valorImposto ; 
        if (salario <= 34712){
            valorImposto =  salario * faixaUm ;           
        }else if (salario >= 34713 && salario <=  68507){
            valorImposto = salario *= faixaDois;
          }
          else{
            valorImposto = salario *= faixatres;
        }
System.out.println("Valor do salario " + salario);
System.out.println("Valor do imposto "+ valorImposto);
    }
}
