/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bufwaitnotifu;
import java.util.LinkedList;
/**
 *
 * @author Gabriele
 */
public class Consumatore extends Thread{
    private BufWaitNot b;
    private int numero;
    
    public Consumatore(BufWaitNot buffer){
        b = buffer;
    }
    
    public void run(){
        for (int i = 0; i < 5; i++) {
            numero = b.preleva();
            try{
                sleep((int) (Math.random() * 1000));
            }catch(InterruptedException e) {}
        }
    }
}
