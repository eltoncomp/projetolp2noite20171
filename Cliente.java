/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package efeira;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Tinho
 */
public class Cliente {
    String produto;
    float preco;
    
    void informarproduto (String produto){
        this.produto = produto;     
    }
    
    void informarpreco (float preco){
        this.preco = preco;
    }
    

    
    
public class Compra{
    String selecionar;
    boolean confirmar;
    int quantidade;
    
    private void selecionarproduto (String selecionar){
        this.selecionar = selecionar;
    }
    
    private void informarquantidade (int quantidade){
        this.quantidade = quantidade;
    }
    
    private void confirmarcompra (boolean confirmar){
        this.confirmar = confirmar;
    }
}    

public class NovoProduto{

        private String produto;
    private void mudarproduto (String produto){
        this.produto = produto;
    }
}


}