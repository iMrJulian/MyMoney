/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.GraphicsEnvironment;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

/**
 *
 * @author DARKKOH
 */
public class View {
    //  private double valor1,valor2;
/*
     public double getValor1() {
     return valor1;
     }

     public void setValor1(double valor1) {
     this.valor1 = valor1;
     }

     public double getValor2() {
     return valor2;
     }

     public void setValor2(double valor2) {
     this.valor2 = valor2;
     }
     public void imprimir(String Salida){
     System.out.println(Salida);
     }*/

    protected JFrame miVentana;
    protected JPanel p1panelLateral;
    protected JPanel p2PanelPrincipal;
    protected JPanel p3panelAgregacion;
    protected JPanel p4panelTipoGasto;
    protected JPanel p5PanelTipoIngreso;
    protected JPanel p6panelUp;
    protected JButton jbtnGastos;
    protected JButton jbtnSaldo;
    protected JButton jbtnIngresos;
    protected JButton jbtnAgregar;
    protected JButton jbtnGifts;
    protected JButton jbtnFood;
    protected JButton jbtnEducation;
    protected JButton jbtnEntertaiment;
    protected JButton jbtnHealth;
    protected JButton jbtnRelation;
    protected JButton jbtnShopping;
    protected JButton jbtnTransportation;
    protected JButton jbtnTravel;
    protected JButton jbtnIngreso;
    protected JButton jbtnGasto;
    protected JButton jbtnBack;
    protected JButton jbtnActivities;
    protected JButton jbtnBills;
    protected JButton jbtnBusinnes;
    protected JButton jbtnGuardar;
    protected JButton jbtnAward;
    protected JButton jbtnAhorro;
    protected JButton jbtnInterest;
    protected JButton jbtnMesada;
    protected JButton jbtnSelling;
    protected JButton jbtnWork;
    protected JLabel jlblFondo;
    protected JLabel jlblTipo;
    protected JLabel[] uMovimientos;
    protected JLabel[] jlblAgregar;
    protected JLabel jlblUp;
    protected JTextField jtfCantidad;
    protected JTextField jtfFecha;
    protected JTextField jtfNota;
    protected Image FondoNegro;
    protected Image iconGifts;
    protected Image iconFood;
    protected Image iconEducation;
    protected Image iconEntertaiment;
    protected Image iconShopping;
    protected Image iconTravel;
    protected Image iconRelation;
    protected Image iconHealth;
    protected Image iconTransportation;
    protected Image iconAgregar;
    protected Image iconBack;
    protected Image iconActivities;
    protected Image iconBills;
    protected Image iconBusinnes;
    protected Image iconAward;
    protected Image iconAhorro;
    protected Image iconInterest;
    protected Image iconMesada;
    protected Image iconSelling;
    protected Image iconWork;
    protected Image iconMoney;
    protected Image iconCalendario;
    protected Image iconPersona;
    protected Rectangle maxBounds = GraphicsEnvironment.getLocalGraphicsEnvironment().
        getMaximumWindowBounds();
    protected Rectangle maxBoton;
    protected Rectangle centerPanel;

    public View() {
        centerPanel=new Rectangle(400,30,maxBounds.width-400,maxBounds.height);
        
        p1panelLateral= new Lateral();
        panelUp();
        panelEntrada();
        panelAgregar();      
        panelDeTGastos();
        panelDeTIngresos();

        VentanaPrincipal();
    }

    

    public void VentanaPrincipal() {
        this.miVentana = new JFrame("MyMoney");
//        this.miVentana.setSize(this.maxBounds.width,this.maxBounds.height);
        this.miVentana.setExtendedState(MAXIMIZED_BOTH);
        this.miVentana.setMinimumSize(new Dimension(maxBounds.width-100,maxBounds.height-100));
        this.miVentana.setLayout(null);
        p1panelLateral.setBounds(new Rectangle(0,0,400,maxBounds.height));
        
        this.miVentana.add(p6panelUp);
         this.miVentana.add(p4panelTipoGasto);
        this.miVentana.add(p1panelLateral);
        this.miVentana.add(p2PanelPrincipal);
        this.miVentana.add(p3panelAgregacion);
       
        this.miVentana.add(p5PanelTipoIngreso);      
        
        this.miVentana.setVisible(true);
        this.miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void volver(){

        if(p2PanelPrincipal.isVisible()){
            
        }
        
        if(p3panelAgregacion.isVisible()){
            p3panelAgregacion.setVisible(false);
            p2PanelPrincipal.setVisible(true);
        }
        
        if(p4panelTipoGasto.isVisible()){
            p4panelTipoGasto.setVisible(false);
            p3panelAgregacion.setVisible(true);
        }
        
        if(p5PanelTipoIngreso.isVisible()){
            p5PanelTipoIngreso.setVisible(false);
            p3panelAgregacion.setVisible(true);
        }          
    }
    

    
    private void panelUp(){
        this.p6panelUp = new JPanel();
        this.p6panelUp.setLayout(null);
        this.p6panelUp.setBounds(new Rectangle(0,0,maxBounds.width,30));
        
        this.FondoNegro = new ImageIcon(getClass().getResource("../Imagenes/Up.png")).getImage();
        this.jlblUp = new JLabel(new ImageIcon(FondoNegro));
        this.jlblUp.setBounds(new Rectangle(100,0,maxBounds.width-100,30));
       
        this.iconBack = new ImageIcon(getClass().getResource("../Imagenes/back.png")).getImage();
        this.jbtnBack  = new JButton(new ImageIcon(iconBack));
        this.jbtnBack.setBounds(new Rectangle(0,0,100,30));
        
        this.p6panelUp.add(jlblUp);
        this.p6panelUp.add(jbtnBack);
    }
    
    private void panelEntrada() {
        int[] x= new int[4];
        int y=160;
        int width = (maxBounds.width-400)/3;
        
        x[0]=0;
        x[1]=100;
        x[2]=300;
        x[3]=600;
        this.uMovimientos = new JLabel[15];
              
        this.p2PanelPrincipal = new JPanel();
        this.p2PanelPrincipal.setLayout(null);
        this.p2PanelPrincipal.setBounds(centerPanel);
        this.p2PanelPrincipal.setVisible(true);  
        
        this.jbtnGastos = new JButton();
        this.jbtnGastos.setBounds(new Rectangle(0,0,width,160));
        this.jbtnGastos.setText("<html>Gastos<br>0$</html>");
        this.jbtnGastos.setFont(new Font("Verdana",0,18));
        
        this.jbtnSaldo = new JButton();
        this.jbtnSaldo.setBounds(new Rectangle(width,0,width,160));
        this.jbtnSaldo.setText("<html>Saldo<br>0$</html>");
        this.jbtnSaldo.setFont(new Font("Verdana",0,18));
        
        this.jbtnIngresos = new JButton();
        this.jbtnIngresos.setText("<html>Ingresos<br>0$</html>");
        this.jbtnIngresos.setBounds(new Rectangle(width*2,0,width,160));
        this.jbtnIngresos.setFont(new Font("Verdana",0,18));
       
        this.iconAgregar = new ImageIcon(getClass().getResource("../Imagenes/agregacion.png")).getImage();
        this.jbtnAgregar = new JButton(new ImageIcon(iconAgregar));
        this.jbtnAgregar.setBackground(Color.white);
        this.jbtnAgregar.setBounds(new Rectangle(maxBounds.width-550,maxBounds.height-180,150,150));

        this.p2PanelPrincipal.add(jbtnGastos);
        this.p2PanelPrincipal.add(jbtnSaldo);
        this.p2PanelPrincipal.add(jbtnIngresos);
        
        for (int i=0;i<5;i++){                      
            for (int j=0;j<3;j++){
                this.uMovimientos[i+j] = new JLabel();
                this.uMovimientos[i+j].setText("HOLA");  
                this.uMovimientos[i+j].setFont(new Font("Verdana",0,18));
                this.uMovimientos[i+j].setBounds(new Rectangle(x[j],y,x[j+1],100));
                this.uMovimientos[i+j].setBorder(BorderFactory.createLineBorder(Color.black));
                this.p2PanelPrincipal.add(this.uMovimientos[i+j]);               
            }           
            y+=100; 
        }

        this.p2PanelPrincipal.add(jbtnAgregar);        
    }
       
    private void panelAgregar(){       
        int width = 200;
        int x1=(((maxBounds.width)-400)/2)-width-20;
        int x2=(((maxBounds.width)-400)/2)+width+20;
        int[] x=new int[3];        
        x[0]=0;
        x[1]=100;
        x[2]=400;
        int y = 70;
        
        this.jlblAgregar = new JLabel[4];
        
        this.p3panelAgregacion = new JPanel();
        this.p3panelAgregacion.setLayout(null);
        this.p3panelAgregacion.setBounds(centerPanel);
        this.p3panelAgregacion.setVisible(false);
        
        this.jbtnGasto = new JButton();
        this.jbtnGasto.setBounds(x1,10,width,y);
        this.jbtnGasto.setBackground(Color.GRAY);
        this.jbtnGasto.setFont(new Font("Verdana",0,18));
        this.jbtnGasto.setText("Gasto");
        
        this.jbtnIngreso = new JButton();
        this.jbtnIngreso.setBackground(Color.GRAY);
        this.jbtnIngreso.setBounds(x2,10,width,y);
        this.jbtnIngreso.setFont(new Font("Verdana",0,18));
        this.jbtnIngreso.setText("Ingreso");
        
//        for (int i=0;i<4;i++){
//            for (int j=0;j<2;j++){
//                this.jlblAgregar[i+j] = new JLabel();
////                this.jlblAgregar[i+j].setBounds(new Rectangle(x[j],y,x[j+1],100));
//                this.p3panelAgregacion.add(this.jlblAgregar[(i+j)]);               
//            }           
//            y+=100;
//        }
        this.iconMoney = new ImageIcon(getClass().getResource("../Imagenes/ahorro.png")).getImage();
        this.jlblAgregar[0] = new JLabel(new ImageIcon(iconMoney));
        this.jlblAgregar[0].setBounds(new Rectangle(0,170,100,100));
        
        this.jtfCantidad = new JTextField();
        this.jtfCantidad.setBounds(new Rectangle(100,170,600,100));
        this.jtfCantidad.setFont(new Font("Verdana",0,18));
       
        this.jlblAgregar[1] = new JLabel();
        this.jlblAgregar[1].setBounds(new Rectangle(0,275,100,100));
           
        this.jlblTipo = new JLabel();
        this.jlblTipo.setBounds(new Rectangle(100,275,600,100));
        this.jlblTipo.setFont(new Font("Verdana",0,18));
        
        this.iconCalendario = new ImageIcon(getClass().getResource("../Imagenes/interest.png")).getImage();
        this.jlblAgregar[2] = new JLabel(new ImageIcon(iconCalendario));
        this.jlblAgregar[2].setBounds(new Rectangle(0,380,100,100));
        
        this.jtfFecha = new JTextField();
        this.jtfFecha.setBounds(new Rectangle(100,380,600,100));
        this.jtfFecha.setFont(new Font("Verdana",0,18));
        
        this.iconPersona = new ImageIcon(getClass().getResource("../Imagenes/mesada.png")).getImage();
        this.jlblAgregar[3] = new JLabel(new ImageIcon(iconPersona));
        this.jlblAgregar[3].setBounds(new Rectangle(0,485,100,100));
        
        this.jtfNota = new JTextField();
        this.jtfNota.setBounds(new Rectangle(100,485,600,100));
        this.jtfNota.setFont(new Font("Verdana",0,18));
        
        this.jbtnGuardar = new JButton("Guardar");
        this.jbtnGuardar.setEnabled(false);
        this.jbtnGuardar.setBounds(new Rectangle(maxBounds.width-550,maxBounds.height-130,150,100));
        
        this.p3panelAgregacion.add(jbtnIngreso);
        this.p3panelAgregacion.add(jbtnGasto);
        this.p3panelAgregacion.add(jbtnGuardar);
        this.p3panelAgregacion.add(jlblAgregar[0]);
        this.p3panelAgregacion.add(jlblAgregar[1]);
        this.p3panelAgregacion.add(jlblAgregar[2]);
        this.p3panelAgregacion.add(jlblAgregar[3]);
        this.p3panelAgregacion.add(jtfCantidad);
        this.p3panelAgregacion.add(jtfNota);
        this.p3panelAgregacion.add(jtfFecha);
        this.p3panelAgregacion.add(jlblTipo);
    }

    private void panelDeTGastos() {
        this.p4panelTipoGasto = new JPanel();
        this.p4panelTipoGasto.setLayout(new GridLayout(3, 4));
        this.p4panelTipoGasto.setBounds(centerPanel);
        this.p4panelTipoGasto.setVisible(false);
        
        this.iconActivities = new ImageIcon(getClass().getResource("../Imagenes/activities.png")).getImage();
        this.jbtnActivities = new JButton(new ImageIcon(iconActivities));
        
        this.iconBills = new ImageIcon(getClass().getResource("../Imagenes/bills.png")).getImage();
        this.jbtnBills = new JButton(new ImageIcon(iconBills));
        
        this.iconBusinnes = new ImageIcon(getClass().getResource("../Imagenes/business.png")).getImage();
        this.jbtnBusinnes = new JButton(new ImageIcon(iconBusinnes));
        
        this.iconEducation= new ImageIcon(getClass().getResource("../Imagenes/education.png")).getImage();
        this.jbtnEducation = new JButton(new ImageIcon(iconEducation));
        
        this.iconEntertaiment = new ImageIcon(getClass().getResource("../Imagenes/entertaiment.png")).getImage();
        this.jbtnEntertaiment = new JButton(new ImageIcon(iconEntertaiment));
        
        this.iconFood= new ImageIcon(getClass().getResource("../Imagenes/food.png")).getImage();
        this.jbtnFood = new JButton(new ImageIcon(iconFood));
        
        this.iconGifts= new ImageIcon(getClass().getResource("../Imagenes/gifts.png")).getImage();
        this.jbtnGifts = new JButton(new ImageIcon(iconGifts));        
        
        this.iconHealth= new ImageIcon(getClass().getResource("../Imagenes/health.png")).getImage();
        this.jbtnHealth = new JButton(new ImageIcon(iconHealth)); 
        
        this.iconRelation = new ImageIcon (getClass().getResource("../Imagenes/relation.png")).getImage();
        this.jbtnRelation = new JButton(new ImageIcon(iconRelation));
        
        this.iconShopping = new ImageIcon (getClass().getResource("../Imagenes/shopping.png")).getImage();
        this.jbtnShopping = new JButton(new ImageIcon(iconShopping));
        
        this.iconTransportation = new ImageIcon (getClass().getResource("../Imagenes/transportation.png")).getImage();
        this.jbtnTransportation = new JButton (new ImageIcon(iconTransportation));
        
        this.iconTravel = new ImageIcon (getClass().getResource("../Imagenes/travel.png")).getImage();
        this.jbtnTravel = new JButton (new ImageIcon(iconTravel));
        
        this.p4panelTipoGasto.add(jbtnActivities);
        this.p4panelTipoGasto.add(jbtnBills);
        this.p4panelTipoGasto.add(jbtnBusinnes);
        this.p4panelTipoGasto.add(jbtnEducation);
        this.p4panelTipoGasto.add(jbtnEntertaiment);
        this.p4panelTipoGasto.add(jbtnFood);
        this.p4panelTipoGasto.add(jbtnGifts);
        this.p4panelTipoGasto.add(jbtnHealth);
        this.p4panelTipoGasto.add(jbtnRelation);
        this.p4panelTipoGasto.add(jbtnShopping);
        this.p4panelTipoGasto.add(jbtnTransportation);
        this.p4panelTipoGasto.add(jbtnTravel);       

    }
    
    private void panelDeTIngresos() {
        this.p5PanelTipoIngreso = new JPanel();
        this.p5PanelTipoIngreso.setLayout(new GridLayout(2,3));
        this.p5PanelTipoIngreso.setBounds(centerPanel);
        this.p5PanelTipoIngreso.setVisible(false);
        
        this.iconAhorro = new ImageIcon(getClass().getResource("../Imagenes/ahorro.png")).getImage();
        this.jbtnAhorro = new JButton(new ImageIcon(iconAhorro));
        
        this.iconAward = new ImageIcon(getClass().getResource("../Imagenes/award.png")).getImage();
        this.jbtnAward = new JButton(new ImageIcon(iconAward));
        
        this.iconInterest = new ImageIcon(getClass().getResource("../Imagenes/interest.png")).getImage();
        this.jbtnInterest = new JButton(new ImageIcon(iconInterest));
        
        this.iconMesada= new ImageIcon(getClass().getResource("../Imagenes/mesada.png")).getImage();
        this.jbtnMesada = new JButton(new ImageIcon(iconMesada));
        
        this.iconSelling = new ImageIcon(getClass().getResource("../Imagenes/selling.png")).getImage();
        this.jbtnSelling = new JButton(new ImageIcon(iconSelling));
        
        this.iconWork= new ImageIcon(getClass().getResource("../Imagenes/work.png")).getImage();
        this.jbtnWork = new JButton(new ImageIcon(iconWork));
        
        this.p5PanelTipoIngreso.add(jbtnAhorro);
        this.p5PanelTipoIngreso.add(jbtnAward);
        this.p5PanelTipoIngreso.add(jbtnInterest);
        this.p5PanelTipoIngreso.add(jbtnMesada);
        this.p5PanelTipoIngreso.add(jbtnSelling);
        this.p5PanelTipoIngreso.add(jbtnWork);  
    
    }
}
