package maratona.java.introducao;
/*
 * Vamlos começar lembrando que os arrays inicializados sem volores adotam valores 
 * padrão, os tipos byte, short, int, long float e doubles são iniciados com 
 * 0 , já o char '\u0000' 
 * boollean = false
 * String null  vou fazer um exemplo que como mostrar isso abaixo 
 * 
 * 
 */

public class Aula07Arrays03 {
    public static void main(String[] args) { 

// somente textando o valor padrão quando não inicializado 
     boolean[] texteValor = new boolean[1] ; 
     System.out.println(texteValor[0]);     

// coloconado um valor no array para fixação da linguagem 
texteValor[0] = true ; 
System.out.println(texteValor[0]);     

// textando outros: 

String[]  texteValorString = new String[2]; 
texteValorString[0] = "Carlos Mota Pro" ; 

/// verificando as duas posições onde uma tem valor e outra não 
/// colocando em pratica : 

        for (int i = 0; i < texteValorString.length; i++) {
        System.out.println(texteValorString[i]);
        /// preceba que teremos a posição 1 do array com valor nulo 
        }

    /// agora um forma mais simples de declarar os arrays são :: 
    float[] texteValorFloat = new float[]{10.20f, 22.30f, 44.50f}; 
    for(float indice: texteValorFloat)
    {System.out.println(indice);}
    
    }
}

