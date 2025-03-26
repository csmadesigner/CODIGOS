package maratona.java.introducao;

public class Aula6EstruturadeRepeticao02_for_break {
    public static void main(String[] args) {
/*
 * exercicio e simples quero que mostre os 25 numeros e depois pare o laço, 
 * precisamos tomar cuidado poquue quero que o laço pare e não so mostre os 25 numeros 
 * vamos lá 
 */
    int numeroMaximo = 50 ; 
        for (int i = 0; i <= numeroMaximo; i++) {
          if (i <= 25) {
                System.out.println(i); } else {
                    break;
                }
                     
        }
        
    }

}
