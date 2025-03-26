package maratona.java.introducao;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
public class Aula6EstruturadeRepeticao04Carro {

    
        public static void main(String[] args) {
            DecimalFormatSymbols symbols = new DecimalFormatSymbols();
            symbols.setDecimalSeparator(',');
            DecimalFormat df = new DecimalFormat("#.00", symbols);
           
        double valorCarro = 30000 ; 
        double prestaçãoValor = 1000; 
        for (int parcela = 1; parcela < prestaçãoValor; parcela++) {
          double  valortotal = valorCarro / parcela ; 
            if (valortotal >= prestaçãoValor) {
               
                System.out.println("Sua Parcela é "+ parcela + " X " + df.format(valortotal) + " = " + df.format(valorCarro));
            }if (parcela == 30) {
                break;
            }
            System.out.println("sera");
        }
    }

}
