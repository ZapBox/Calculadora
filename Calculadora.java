import javax.swing.*;
import java.awt.event.*;
public class Calculadora extends JFrame implements ActionListener{
    private JLabel pantalla;
    private JButton boton1,boton2,boton3,b4,b5,b6,b7,b8,b9,b0,bX,bd,bs,br,bI,bDEL,bAC,bP;
    private String a, operacion="b";
    private float num1, num2;
    
    
    public Calculadora() {
        setLayout(null);
        
        pantalla=new JLabel();
        pantalla.setBounds(30,100,340,30);
        add(pantalla);
        
       
        boton1=new JButton("1");
        boton1.setBounds(10,200,70,30);
        add(boton1);
        boton1.addActionListener(this);
        
        boton2=new JButton("2");
        boton2.setBounds(82,200,70,30);
        add(boton2);
        boton2.addActionListener(this);
        
        boton3=new JButton("3");
        boton3.setBounds(154,200,70,30);
        add(boton3);
        boton3.addActionListener(this); 
        
        b4=new JButton ("4");
        b4.setBounds(10,168,70,30);
        add(b4);
        b4.addActionListener(this);
        
        b5=new JButton("5");
        b5.setBounds(82,168,70,30);
        add(b5);
        b5.addActionListener(this);
        
        b6=new JButton("6");
        b6.setBounds(154,168,70,30);
        add(b6);
        b6.addActionListener(this);
        
        b7=new JButton("7");
        b7.setBounds(10,136,70,30);
        add(b7);
        b7.addActionListener(this);
        
        b8=new JButton("8");
        b8.setBounds(82,136,70,30);
        add(b8);
        b8.addActionListener(this);
        
        b9=new JButton("9");
        b9.setBounds(154,136,70,30);
        add(b9);
        b9.addActionListener(this);
        
        b0=new JButton("0");
        b0.setBounds(10,232,142,30);
        add(b0);
        b0.addActionListener(this);
        
        bP=new JButton(".");
        bP.setBounds(154,232,70,30);
        add(bP);
        bP.addActionListener(this);
        
        bDEL=new JButton("DEL");
        bDEL.setBounds(226,136,70,30);
        add(bDEL);
        bDEL.addActionListener(this);
        
        bAC=new JButton("AC");
        bAC.setBounds(298,136,70,30);
        add(bAC);
        bAC.addActionListener(this);
        
        bs=new JButton("+");
        bs.setBounds(226,168,70,30);
        add(bs);
        bs.addActionListener(this);
        
        br=new JButton("-");
        br.setBounds(298,168,70,30);
        add(br);
        br.addActionListener(this);
        
        bX=new JButton("X");
        bX.setBounds(226,200,70,30);
        add(bX);
        bX.addActionListener(this);
       
        bd=new JButton("/");
        bd.setBounds(298,200,70,30);
        add(bd);
        bd.addActionListener(this);
        
        bI=new JButton("=");
        bI.setBounds(226,232,142,30);
        add(bI);
        bI.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
    	 
    	
    	if (e.getSource()==bDEL) {
            a=pantalla.getText();
             pantalla.setText(a.substring(0,a.length()-1));
             
            
    	}
    	
    	
    	
    	if (e.getSource()==boton1) {
            pantalla.setText(pantalla.getText() + "1");
            
    	}
        
          if (e.getSource()==boton2) {
               pantalla.setText(pantalla.getText() + "2");
    }
          if (e.getSource()==boton3) {
              pantalla.setText(pantalla.getText() + "3");  
          }
          if (e.getSource()==b4) {
              pantalla.setText(pantalla.getText() + "4");
          }
          if (e.getSource()==b5) {
              pantalla.setText(pantalla.getText() + "5");
          }
          if (e.getSource()==b6) {
              pantalla.setText(pantalla.getText() + "6");
          }
          if (e.getSource()==b7) {
              pantalla.setText(pantalla.getText() + "7");
          }
          if (e.getSource()==b8) {
              pantalla.setText(pantalla.getText() + "8");
          }
          if (e.getSource()==b9) {
              pantalla.setText(pantalla.getText() + "9");
          }  
          if (e.getSource()==b0) {
              pantalla.setText(pantalla.getText() + "0");
          }
          if (e.getSource()==bX) {
        	  num1=Float.parseFloat(pantalla.getText());
        	  pantalla.setText(pantalla.getText() + "X");
        	  operacion="X";
          } 
          if (e.getSource()==bd) {
        	  num1=Float.parseFloat(pantalla.getText());
        	  pantalla.setText(pantalla.getText() + "/");
        	  operacion="/";
          }    
          if (e.getSource()==bs) {
              num1=Float.parseFloat(pantalla.getText());
        	  pantalla.setText(pantalla.getText() + "+");
        	  operacion="+";
          }  
          if (e.getSource()==br) {
        	  num1=Float.parseFloat(pantalla.getText());
        	  pantalla.setText(pantalla.getText() + "-");
        	  operacion="-";
          } 
          if (e.getSource()==bI) {
        	  a=pantalla.getText();
        	  if (operacion=="+"){
        	  num2=Float.parseFloat((a.substring(a.indexOf("+")+1,a.length())));
        	  num1=num1+num2;
        	  }
          
        	  if(operacion=="-"){
        		  num2=Float.parseFloat((a.substring(a.indexOf("-")+1,a.length())));
        		  num1=num1-num2;
        		  
        	  }
        	  if(operacion=="X"){
        		  num2=Float.parseFloat((a.substring(a.indexOf("X")+1,a.length())));
        		  num1=num1*num2;
        	  }
        	  if(operacion=="/"){
        		  num2=Float.parseFloat((a.substring(a.indexOf("/")+1,a.length())));
        		  num1=num1/num2;
        	  }
        	  
        	  pantalla.setText(String.valueOf(num1));
        	  }
        	  
        	 
          
              

          if (e.getSource()==bP) {
              pantalla.setText(pantalla.getText() + ".");
              
          } 
          if (e.getSource()==bAC) {
              pantalla.setText(" ");
          }
          
    	}
          

public static void main(String[] ar){
   Calculadora c=new Calculadora();
    c.setBounds(0,0,700,600);
    c.setVisible(true);
}
}