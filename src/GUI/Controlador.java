/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class Controlador implements ActionListener{
   
    double porcentaje;
    int cura;
    int eleccion;

    public Controlador(Campo batalla) {
        this.batalla = batalla;
        escuchasBotones();
    }
     Campo batalla;
    private void escuchasBotones() {
        batalla.Ataque.addActionListener(this);
        batalla.Cura.addActionListener(this);
    }
    public void logicEnemigo(){
        eleccion=(int) (((Math.random() * 2) + 1));
        if (eleccion==1){
            porcentaje = ((Math.random() * 100) + 1)/100;
            System.out.println(porcentaje);
            batalla.pokemon.Hurt(batalla.enemigo.getDamage()*porcentaje);
            
            if (batalla.pokemon.getHealth()<0){
                batalla.pokemon.setHealth(0);
            }
            
            batalla.Vida1.setText("vida: "+Integer.toString(batalla.pokemon.getHealth()));
            batalla.narrador.append("\n"+batalla.enemigo.getName()+" hizo "
               + (int)(batalla.enemigo.getDamage()*porcentaje)+" de daño a " +
                batalla.pokemon.getName());
            
            if (batalla.pokemon.getHealth()<=0){
                JOptionPane.showMessageDialog(null,"Gana "+ batalla.enemigo.getName());
                batalla.miVentana.dispose();
            }
        }
        else{
            porcentaje = ((Math.random() * 100) + 1)/100;
            this.cura=(int)(50*porcentaje);
            batalla.enemigo.setHealth(batalla.enemigo.getHealth()+this.cura);
            batalla.Vida2.setText("vida: "+Integer.toString(batalla.enemigo.getHealth()));
            batalla.narrador.append("\n"+batalla.enemigo.getName()+" se curo "
                +this.cura+" de salud ");
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(batalla.Ataque)){
            porcentaje = ((Math.random() * 100) + 1)/100;
            System.out.println(porcentaje);
            batalla.enemigo.Hurt(batalla.pokemon.getDamage()*porcentaje);
            
            if (batalla.enemigo.getHealth()<0){
                batalla.enemigo.setHealth(0);
            }
            
            batalla.Vida2.setText("vida: "+Integer.toString(batalla.enemigo.getHealth()));
            batalla.narrador.append("\n"+ batalla.pokemon.getName()+" hizo "
                +(int)(batalla.pokemon.getDamage()*porcentaje)+" de daño a " +
                batalla.enemigo.getName());
            
            if (batalla.enemigo.getHealth()<=0){
                JOptionPane.showMessageDialog(null,"Gana "+ batalla.pokemon.getName());
                batalla.miVentana.dispose();
            }
                
            logicEnemigo();
            batalla.narrador.append("\n");
            
        }
        if (e.getSource().equals(batalla.Cura)){    
            porcentaje = ((Math.random() * 100) + 1)/100;
            this.cura=(int)(50*porcentaje);
            batalla.pokemon.setHealth(batalla.pokemon.getHealth()+this.cura);
            batalla.Vida1.setText("vida: "+Integer.toString(batalla.pokemon.getHealth()));
            batalla.narrador.append("\n"+batalla.pokemon.getName()+" se curo "
                +this.cura+"de salud ");
            logicEnemigo();
            batalla.narrador.append("\n");
        }
    }

}
