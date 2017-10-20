/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Uri1042.Uri1042;
import Uri1114.Uri1114;
import Uri1142.Uri1142;
import Uri1151.Uri1151;

/**
 *
 * @author felipe.reblin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        switch (args[0]) {
            case "1042":
                Uri1042.run();
                break;
            case "1142":
                Uri1142.run();
                break;
            case "1151":
                Uri1151.run();
                break;
            case "1114":
                Uri1114.run();
                break;
                
                   
        }
        
        
        
    }
    
}
