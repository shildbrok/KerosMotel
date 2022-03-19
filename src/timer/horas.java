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
public class horas implements Runnable{

    @Override
    public void run() {
        int i = 0;
        
        for(;;){
            ModeloQuarto.txtSegundos.setText(i+"");
            i++;
            if(i > 24){
                i=0;
            }
            try {
                Thread.sleep(3600000);
            } catch (Exception e) {
            }
        }
    }
    
}
