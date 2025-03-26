package maratona.java.introducao;

public class Aula21EscruturasCondicionais06 {
/**
 * utilizando switch e dados os valores de 1 a 7 imprima se é dia ultil ou final de semana 
 * considerando 1 como domingo 
 * @param args
 */
    public static void main(String[] args) {
        int dia =2; 
        switch (dia) {
            default: dia = 1 ;
                break;
            case 1: System.out.println("Domingo");
                break;
            case 2: System.out.println("Segunda");
                   break;
            case 3: System.out.println("Terça");
                   break;
            case 4: System.out.println("Quarta");
                   break;
            case 5: System.out.println("Quinta");
                   break;
            case 6: System.out.println("Sexta");
                   break;
            case 7: System.out.println("Sabado");
                   break;
            
        }
    }
}
