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
public class BufWaitNot {
    private static int val;
    private boolean pieno = false;
    
    public synchronized int preleva(){
        while (pieno == false){
            try{
                wait();
            }catch(InterruptedException e){ }
        }
            pieno = false;
            notify();
            System.out.println("Consuma il numero: " + val);
            return val;
    }
    
    public synchronized void deposita(int value){
        while(pieno == true){
            try{
                wait();
            }catch(InterruptedException e){}
        }
        pieno = true;
        val = value;
        notify();
        System.out.println("Produce il numero: " + val);
    }
}
