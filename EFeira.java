/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package efeira;

import efeira.Cliente.Compra;

/**
 *
 * @author Tinho
 */
public class EFeira {

    private static String produtoa;
    private static boolean ok;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Cliente c1 = new Cliente();
         c1.produto = produtoa;
         c1.preco = 15;
         
         System.out.println(c1.produto);
         System.out.println(c1.preco);
        
         FinalCompra f1 = new FinalCompra();
         f1.qtde = 1;
         f1.unitario = 15;
         f1.subtotal = 15;
         
         System.out.println(f1.qtde);
         System.out.println(f1.unitario);
         System.out.println(f1.subtotal);
         
     
        // TODO code application logic here
        }

    
}