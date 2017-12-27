/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package efeira;

/**
 *
 * @author Tinho
 */
public class FinalCompra {
    float valortotal;
    boolean confirma;
    int qtde;
    int unitario;
    int subtotal;

public class finalizar {
    int qtde;
    float unitario, subtotal;
    
    private void quantidadeprodutos (int qtde){
        this.qtde = qtde;
    }
    
    private void valorunitario (float unitario){
        this.unitario = unitario;
    }
    
    private void valorsubtotal (float subtotal){
        this.subtotal = subtotal;
    }    
}

         

public class valortotaldacompra{
    float valortotal;
}

    private void valortotalcompra (float valortotal){
        this.valortotal = valortotal;
    }

    
public class confirmacaodacompra{
    boolean confirma;
}

    private void confirmacaocompra (boolean confirma){
        this.confirma = confirma;  
    }
 

}
