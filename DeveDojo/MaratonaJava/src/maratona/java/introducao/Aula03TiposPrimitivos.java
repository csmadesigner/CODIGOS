package maratona.java.introducao;

import java.time.ZoneId;
import java.time.ZonedDateTime;

/*
 * Prática 
 * crie variáveis para os campos descritos abaixo entre <> e imprima a senguinte 
 * mensagem: 
 * Eu <nome>, morando no endereço <>, confirmo que recebi o salário de <salário>, 
 * na data <>
 */
public class Aula03TiposPrimitivos {
public static void main(String[] args) {
    String nome ="Carlos"; 
    String endereço ="R > XXXX" ; 
    double  salario = 120.01 ; 
    ZonedDateTime  data =  ZonedDateTime.now(ZoneId.of("America/Sao_Paulo"));
    System.out.println("Eu " + nome + ", morando no endereço " + endereço + 
    " confirmo que recebi o salário de " + salario + " ,da data " + data);

}
}
