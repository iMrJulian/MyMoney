/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Color;
import pokemon.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author DARKKOH
 */
public class Controller implements ActionListener {

    public Controller( View v) {
        this.miVista = v;
        escuchasBotones(miVista);
    }

    tipo pokemon = new tipo();
    tipo enemigo = new tipo();
    View miVista;
    
    int porcentaje;
    double valor1, valor2;

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(miVista.jbtnBack)){
            miVista.volver();
        }
        
        if (e.getSource().equals(miVista.jbtnAgregar)) {
            miVista.p2PanelPrincipal.setVisible(false);         
            miVista.p3panelAgregacion.setVisible(true);        
        }
        
        if (e.getSource().equals(miVista.jbtnGasto)){
            miVista.p3panelAgregacion.setVisible(false);
            miVista.p4panelTipoGasto.setVisible(true); 
            
            miVista.jbtnGasto.setBackground(Color.WHITE);
            miVista.jbtnIngreso.setBackground(Color.GRAY);
        }
        
        if (e.getSource().equals(miVista.jbtnIngreso)){
            miVista.p3panelAgregacion.setVisible(false);
            miVista.p5PanelTipoIngreso.setVisible(true); 
            
            miVista.jbtnGasto.setBackground(Color.GRAY);
            miVista.jbtnIngreso.setBackground(Color.WHITE);
        }
        
        if(e.getSource().equals(miVista.jbtnBills)){
            miVista.p4panelTipoGasto.setVisible(false);
            miVista.p3panelAgregacion.setVisible(true);
            miVista.jbtnGasto.setBackground(Color.yellow);
            miVista.jlblAgregar[5].setIcon(new ImageIcon(miVista.iconBills));
//            miVista.jlblAgregar[5]= new JLabel(new ImageIcon(miVista.iconEducation));
        }
        
        if(e.getSource().equals(miVista.jbtnEducation)){
            miVista.p4panelTipoGasto.setVisible(false);
            miVista.p3panelAgregacion.setVisible(true);
            miVista.jbtnGasto.setBackground(Color.yellow);
            miVista.jlblAgregar[5].setIcon(new ImageIcon(miVista.iconEducation));
//            miVista.jlblAgregar[5]= new JLabel(new ImageIcon(miVista.iconEducation));
        }
        
        
        
//        if (e.getSource().equals(miVista.jbtnGastos)) {
//            pokemon.setDamage(40);
//            pokemon.setHealth(500);
//            pokemon.setImagen(miVista.iconGifts);
//            pokemon.setName("Bulbasur");
//            enemigo.setDamage(45);
//            enemigo.setHealth(400);
//            enemigo.setImagen(miVista.iconEducation);
//            enemigo.setName("Pikachu");
//            new Controlador(new Campo(pokemon, enemigo));
//            miVista.miVentana.dispose();
//        }
//    
//         
//        if (e.getSource().equals(miVista.jbtnSaldo)) {
//            pokemon.setDamage(50);
//            pokemon.setHealth(300);
//            pokemon.setImagen(miVista.iconFood);
//            pokemon.setName("Charmander");
//            enemigo.setDamage(40);
//            enemigo.setHealth(500);
//            enemigo.setImagen(miVista.iconGifts);
//            enemigo.setName("Bulbasur");
//            new Controlador(new Campo(pokemon, enemigo));
//            miVista.miVentana.dispose();
//        }
//        
        
        
    }

    private void escuchasBotones(View miVista) {
        miVista.jbtnAgregar.addActionListener(this);
        
        miVista.jbtnIngresos.addActionListener(this);
        miVista.jbtnGastos.addActionListener(this);
        
        miVista.jbtnBack.addActionListener(this);
        
        miVista.jbtnGasto.addActionListener(this);
        miVista.jbtnIngreso.addActionListener(this);
        
        miVista.jbtnActivities.addActionListener(this);
        miVista.jbtnBills.addActionListener(this);
        miVista.jbtnBusinnes.addActionListener(this);
        miVista.jbtnEducation.addActionListener(this);
        miVista.jbtnEntertaiment.addActionListener(this);
        miVista.jbtnFood.addActionListener(this);
        miVista.jbtnGifts.addActionListener(this);
        miVista.jbtnHealth.addActionListener(this);
        miVista.jbtnRelation.addActionListener(this);
        miVista.jbtnShopping.addActionListener(this);
        miVista.jbtnTransportation.addActionListener(this);
        miVista.jbtnTravel.addActionListener(this);
    }
}
