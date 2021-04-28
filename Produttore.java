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
public class Produttore extends Thread{
    private BufWaitNot b;
    private int numero = 0;
    
    public Produttore(BufWaitNot buf){
        b = buf;
    }
    
    public void run(){
        for (int i = 0; i < 5; i++) {
            numero = (int) (Math.random() * 50);
            b.deposita(numero);
            
            try{
                sleep((int) (Math.random() * 1000));
            }catch(InterruptedException e){}
        }
    }
    
}
