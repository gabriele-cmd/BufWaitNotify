/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bufwaitnotifu;

/**
 *
 * @author Gabriele
 */
public class ProdConsBufWaitNotify {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BufWaitNot buffer = new BufWaitNot();
        Produttore p = new Produttore(buffer);
        Consumatore c = new Consumatore(buffer);
        
        p.start();
        c.start();
    }
    
}
