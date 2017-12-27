/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package efeira;

import static java.lang.System.in;
import java.util.*;

/**
 *
 * @author Tinho
 */
public class Administrador {
    public void autentica (int senha){
        boolean ok;   
    }
 
public class Opcoes{
    private void main(String[] args) {
        Set<String> opcoes = new TreeSet<>();
        opcoes.add("Adicionar produtos ");
        opcoes.add("Remover produtos ");
        opcoes.add("Editar produtos ");
        opcoes.add("Retornar a tela inicial ");
        opcoes.forEach(System.out::println);           
    }    
}




public class rendimento{
     private void main(String[] args) {
     float valorGasto = 0, valorRecebido = 0, lucroReal = 0;
     int lucroPercentual = 0;
     List lista = new ArrayList();
         boolean add = lista.add(valorGasto);
         boolean add1 = lista.add(valorRecebido);
         boolean add2 = lista.add(lucroReal);
         lista.add(lucroPercentual, in);
     }
}


public class registrovenda{
     private void main(String[] args) {
         char ProdutoVendido = 0;
         int QuantidadeVendida = 0;
         float ValorCompra = 0, ValorVenda = 0;
         List lista = new ArrayList();
         lista.add(ProdutoVendido);
         lista.add(QuantidadeVendida, in);
         lista.add(ValorCompra);
         boolean add = lista.add(ValorVenda);
     }    
}


}