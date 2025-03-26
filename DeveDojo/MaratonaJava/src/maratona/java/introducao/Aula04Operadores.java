package maratona.java.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - * / 

        int numero1 = 10  ; 
        int numero2 = 10  ; 
        int resultadosoma = numero1 + numero2 ; 
        int resultadosubitracao  = numero1 - numero2 ;
        int resultadomult  = numero1 * numero2 ;
        int resultadodiv = numero1 / numero2 ;
        System.out.println(resultadosoma);
        System.out.println(resultadosubitracao);
        System.out.println(resultadomult);
        System.out.println(resultadodiv);
 /// operadores lógicos 
 ///  < >  <= >= != ==  
 /// todos os operadores lógicos retorna true ou false  
 /// logo a variavel deve ser um boolean 
 boolean resultadoMaior = numero1 < numero2 ; 
 boolean resultadoMenor   = numero1 > numero2 ;
 boolean resultDiferente  = numero1 == numero2 ;
 boolean resultaIgual = numero1 != numero2 ;

 System.out.println(resultadoMaior);
 System.out.println(resultadoMenor);
 System.out.println(resultDiferente);
 System.out.println(resultaIgual);

 // faltou somente o operador de resto % 

 int restadoResto = numero1 % numero2; 
System.out.println(restadoResto);

int idade = 15; 
boolean isMaiorIdade = idade > 18; 
System.out.println(isMaiorIdade);
 

    }

}
