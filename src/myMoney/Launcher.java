/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myMoney;

import GUI.Controller;
import GUI.View;

/**
 *
 * @author david
 */
public class Launcher {

    /**
     * @param args the command line arguments
     */
    private static Controller c;
    public static void main(String[] args) {
        c = new Controller(new View());
    }
    
}
