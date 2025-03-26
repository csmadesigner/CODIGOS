package maratona.java.introducao;
// escreva todos os numeros pares  
public class Aula6EstruturadeRepeticao02_for {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0){ //com essa validação eu asseguro que só valida os pares pois o resto de 2 sempre e par 
                System.out.println(i);   
            }else {
                    System.err.println(" Numero " + i + " não é par");
                }                     
        }
    }

}
