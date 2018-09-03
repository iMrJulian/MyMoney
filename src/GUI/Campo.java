/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.GridLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import pokemon.tipo;

/**
 *
 * @author david
 */
public class Campo {
    protected JFrame miVentana;
    protected JPanel Jugador1;
    protected JPanel Jugador2;
    protected JPanel narrar;
    protected JButton Ataque;
    protected JButton Cura;
    protected JLabel Vida1;
    protected JLabel Vida2;
    protected JLabel ijugador;
    protected JLabel ienemigo;
    protected JTextArea narrador;
    protected JLabel contrincantes;
    protected JLabel vacio1;
    protected JLabel vacio2;
    tipo pokemon;
    tipo enemigo;

    public Campo(tipo Pokemon, tipo enemigo) {
        this.pokemon = Pokemon;
        this.enemigo = enemigo;
        panelJugador();
        panelNarrador();
        panelEnemigo();
        VentanaPrincipal();
    }
    private void VentanaPrincipal() {
        this.miVentana = new JFrame("Campo de batalla");
        this.miVentana.setLayout(new GridLayout(1, 1));
        this.miVentana.add(Jugador1);
        this.miVentana.add(narrar);
        this.miVentana.add(Jugador2);
        this.miVentana.pack();
        this.miVentana.setVisible(true);
        this.miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    private void panelJugador(){
        this.Jugador1 = new JPanel();
        this.Jugador1.setLayout(new GridLayout(4,1));
        this.Vida1 = new JLabel();
        this.Vida1.setAlignmentY(32);
        this.Vida1.setText("vida: "+Integer.toString(pokemon.getHealth()));
        this.ijugador = new JLabel();
        this.ijugador.setIcon(new ImageIcon(pokemon.getImagen()));
        this.Ataque = new JButton();
        this.Ataque.setText("Ataque");
        this.Cura = new JButton ();
        this.Cura.setText("Cura");
        this.Jugador1.add(Vida1);
        this.Jugador1.add(ijugador);
        this.Jugador1.add(Ataque);
        this.Jugador1.add(Cura);  
    }
    
    private void panelEnemigo(){
        this.Jugador2 = new JPanel();
        this.Jugador2.setLayout(new GridLayout(4,1));
        this.Vida2 = new JLabel();
        this.Vida2.setText("vida: "+Integer.toString(enemigo.getHealth()));
        this.ienemigo = new JLabel();
        this.ienemigo.setIcon(new ImageIcon(enemigo.getImagen()));
        this.vacio1= new JLabel();
        this.vacio2 = new JLabel();

        this.Jugador2.add(Vida2);
        this.Jugador2.add(ienemigo);
        this.Jugador2.add(vacio1);
        this.Jugador2.add(vacio2);
 
    }
    private void panelNarrador(){
        this.narrar = new JPanel();
        this.narrar.setLayout(new GridLayout(4,1));
        this.narrador= new JTextArea();
        this.contrincantes = new JLabel();
        this.contrincantes.setHorizontalAlignment(SwingConstants.CENTER);
        this.contrincantes.setText(this.pokemon.getName() +" VS " +
                this.enemigo.getName());
        this.narrar.add(narrador);
        this.narrar.add(contrincantes);
    }
    

    
    
    
}
