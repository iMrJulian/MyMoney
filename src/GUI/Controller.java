/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Color;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
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
        
//        if(e.getSource().equals(miVista.jbtnBills)){
//            miVista.p4panelTipoGasto.setVisible(false);
//            miVista.p3panelAgregacion.setVisible(true);
//            miVista.jbtnGasto.setBackground(Color.yellow);
//            miVista.jlblAgregar[5].setIcon(new ImageIcon(miVista.iconBills));
//        }
        
        if(e.getSource().equals(miVista.jbtnActivities)){
            miVista.p4panelTipoGasto.setVisible(false);
            miVista.p3panelAgregacion.setVisible(true);
            
            miVista.jlblAgregar[1].setIcon(new ImageIcon(miVista.iconActivities));
            miVista.jlblTipo.setText("     Activities");
//            miVista.jlblAgregar[5].setBounds(new Rectangle(0,70,100,100));
//            miVista.p3panelAgregacion.add(miVista.jlblAgregar[5]);
            
        }
        
        if(e.getSource().equals(miVista.jbtnBills)){
            miVista.p4panelTipoGasto.setVisible(false);
            miVista.p3panelAgregacion.setVisible(true);
            
            miVista.jlblAgregar[1].setIcon(new ImageIcon(miVista.iconBills));
            miVista.jlblTipo.setText("    Bills");          
        }
        
        if(e.getSource().equals(miVista.jbtnBusinnes)){
            miVista.p4panelTipoGasto.setVisible(false);
            miVista.p3panelAgregacion.setVisible(true);
            
            miVista.jlblAgregar[1].setIcon(new ImageIcon(miVista.iconBusinnes));
            miVista.jlblTipo.setText("     Negocios");
        }
        
        if(e.getSource().equals(miVista.jbtnEducation)){
            miVista.p4panelTipoGasto.setVisible(false);
            miVista.p3panelAgregacion.setVisible(true);
            
            miVista.jlblAgregar[1].setIcon(new ImageIcon(miVista.iconEducation));
            miVista.jlblTipo.setText("     Educacion");
        }
        
        if(e.getSource().equals(miVista.jbtnEntertaiment)){
            miVista.p4panelTipoGasto.setVisible(false);
            miVista.p3panelAgregacion.setVisible(true);
            
            miVista.jlblAgregar[1].setIcon(new ImageIcon(miVista.iconEntertaiment));
            miVista.jlblTipo.setText("     Entretenimiento");
        }
        
        if(e.getSource().equals(miVista.jbtnFood)){
            miVista.p4panelTipoGasto.setVisible(false);
            miVista.p3panelAgregacion.setVisible(true);
            
            miVista.jlblAgregar[1].setIcon(new ImageIcon(miVista.iconFood));
            miVista.jlblTipo.setText("     Comida");
        }
        
        if(e.getSource().equals(miVista.jbtnGifts)){
            miVista.p4panelTipoGasto.setVisible(false);
            miVista.p3panelAgregacion.setVisible(true);
            
            miVista.jlblAgregar[1].setIcon(new ImageIcon(miVista.iconGifts));
            miVista.jlblTipo.setText("     Regalos");
        }
        
        if(e.getSource().equals(miVista.jbtnHealth)){
            miVista.p4panelTipoGasto.setVisible(false);
            miVista.p3panelAgregacion.setVisible(true);
            
            miVista.jlblAgregar[1].setIcon(new ImageIcon(miVista.iconHealth));
            miVista.jlblTipo.setText("     Salud");
        }
        
        if(e.getSource().equals(miVista.jbtnHealth)){
            miVista.p4panelTipoGasto.setVisible(false);
            miVista.p3panelAgregacion.setVisible(true);
            
            miVista.jlblAgregar[1].setIcon(new ImageIcon(miVista.iconHealth));
            miVista.jlblTipo.setText("     Salud");
        }
        
        if(e.getSource().equals(miVista.jbtnRelation)){
            miVista.p4panelTipoGasto.setVisible(false);
            miVista.p3panelAgregacion.setVisible(true);
            
            miVista.jlblAgregar[1].setIcon(new ImageIcon(miVista.iconRelation));
            miVista.jlblTipo.setText("     Amor y amistad");
        }
        
        if(e.getSource().equals(miVista.jbtnShopping)){
            miVista.p4panelTipoGasto.setVisible(false);
            miVista.p3panelAgregacion.setVisible(true);
            
            miVista.jlblAgregar[1].setIcon(new ImageIcon(miVista.iconShopping));
            miVista.jlblTipo.setText("     Shopping");
        }
        
        if(e.getSource().equals(miVista.jbtnTransportation)){
            miVista.p4panelTipoGasto.setVisible(false);
            miVista.p3panelAgregacion.setVisible(true);
            
            miVista.jlblAgregar[1].setIcon(new ImageIcon(miVista.iconTransportation));
            miVista.jlblTipo.setText("    Transporte");
        }
        
        if(e.getSource().equals(miVista.jbtnTravel)){
            miVista.p4panelTipoGasto.setVisible(false);
            miVista.p3panelAgregacion.setVisible(true);
            
            miVista.jlblAgregar[1].setIcon(new ImageIcon(miVista.iconTravel));
            miVista.jlblTipo.setText("     Viajes");
        }
        
        if(e.getSource().equals(miVista.jbtnAhorro)){
            miVista.p5PanelTipoIngreso.setVisible(false);
            miVista.p3panelAgregacion.setVisible(true);
            
            miVista.jlblAgregar[1].setIcon(new ImageIcon(miVista.iconAhorro));
            miVista.jlblTipo.setText("     Ahorro");
        }
        
        if(e.getSource().equals(miVista.jbtnAward)){
            miVista.p5PanelTipoIngreso.setVisible(false);
            miVista.p3panelAgregacion.setVisible(true);
            
            miVista.jlblAgregar[1].setIcon(new ImageIcon(miVista.iconAward));
            miVista.jlblTipo.setText("     Recompensa");
        }
        
        if(e.getSource().equals(miVista.jbtnInterest)){
            miVista.p5PanelTipoIngreso.setVisible(false);
            miVista.p3panelAgregacion.setVisible(true);
            
            miVista.jlblAgregar[1].setIcon(new ImageIcon(miVista.iconInterest));
            miVista.jlblTipo.setText("     Intereses");
        }
        
        if(e.getSource().equals(miVista.jbtnMesada)){
            miVista.p5PanelTipoIngreso.setVisible(false);
            miVista.p3panelAgregacion.setVisible(true);
            
            miVista.jlblAgregar[1].setIcon(new ImageIcon(miVista.iconMesada));
            miVista.jlblTipo.setText("     Mesada");
        }
        
        if(e.getSource().equals(miVista.jbtnSelling)){
            miVista.p5PanelTipoIngreso.setVisible(false);
            miVista.p3panelAgregacion.setVisible(true);
            
            miVista.jlblAgregar[1].setIcon(new ImageIcon(miVista.iconSelling));
            miVista.jlblTipo.setText("     Venta");
        }
        
        if(e.getSource().equals(miVista.jbtnWork)){
            miVista.p5PanelTipoIngreso.setVisible(false);
            miVista.p3panelAgregacion.setVisible(true);
            
            miVista.jlblAgregar[1].setIcon(new ImageIcon(miVista.iconWork));
            miVista.jlblTipo.setText("     Sueldo");
        }
        
        
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
        
        miVista.jbtnAhorro.addActionListener(this);
        miVista.jbtnAward.addActionListener(this);
        miVista.jbtnInterest.addActionListener(this);
        miVista.jbtnMesada.addActionListener(this);
        miVista.jbtnSelling.addActionListener(this);
        miVista.jbtnWork.addActionListener(this);
    }
}
