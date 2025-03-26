package maratona.java.introducao;

public class Aula6EstrututuradeRepeticao05carroForcontiue {
    public static void main(String[] args) {
        int valorCarro = 30000; 
        for (int parcela = valorCarro; parcela >= 1; parcela --) {
           double valorParcela = valorCarro / parcela; 
           if (valorParcela < 1000) {
                continue;             
           }

            System.out.println(parcela + " X " + valorParcela + "= R$ " + valorCarro);
        }
    }

}
