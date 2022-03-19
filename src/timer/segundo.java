/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package timer;

import view.ModeloQuarto;

/**
 *
 * @author estev
 */
public class segundo implements Runnable {
    private int tempo;
    @Override
    public void run() {
        int i = 0;
        
        for(;;){
            i++;
            if(i > 59){
                i=0;
                this.setTempo(i);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                
            }
        }
    }

    /**
     * @return the tempo
     */
    public int getTempo() {
        return tempo;
    }

    /**
     * @param tempo the tempo to set
     */
    public void setTempo(int tempo) {
        this.tempo = tempo;
    }
    
}
