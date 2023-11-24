//package br.senai.sp.jandira;
//
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//
//public class TestarCalculadora extends JFrame implements ActionListener {
//
//	JButton btn1=new JButton("1");
//	
//	JLabel lblTeste=new JLabel("");
//	
//	public TestarCalculadora() {
//		
//		//Botões
//		btn1.addActionListener(this);
//		setLayout(null);
//		btn1.setBounds(50, 300, 120, 30);
//		add(btn1);
//		
//		//Label
//		lblTeste.setBounds(200,10,300,30);
//		add(lblTeste);
//		
//		
//		//JFrame
//		setTitle("Calculadora Gráfica");
//		setSize(500, 400);
//		setLocationRelativeTo(null);
//		setResizable(false);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setVisible(true);
//		
//	}
//	
//	public void actionPerformed(ActionEvent evento) {
//		
//		if(evento.getSource()==btn1) {
//			lblTeste.setText("1");
//		}
//		
//	}
//
//	public static void main(String[] args) {
//		new TestarCalculadora();
//	}
//	
//}
package br.senai.sp.jandira;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TestarCalculadora extends JFrame implements ActionListener {

    JButton btn1 = new JButton("1");
    JButton btn2 = new JButton("2");
    JButton btn3 = new JButton("3");
    JButton btn4 = new JButton("4");
    JButton btn5 = new JButton("5");
    JButton btn6 = new JButton("6");
    JButton btn7 = new JButton("7");
    JButton btn8 = new JButton("8");
    JButton btn9 = new JButton("9");
    JButton btn0 = new JButton("0");

    JButton btnAdd = new JButton("+");
    JButton btnSubtract = new JButton("-");
    JButton btnMultiply = new JButton("*");
    JButton btnDivide = new JButton("/");

    JButton btnEquals = new JButton("=");

    JLabel lblDisplay = new JLabel("");

    public TestarCalculadora() {

        // Botões numéricos
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);
        btn0.addActionListener(this);

        // Botões de operações
        btnAdd.addActionListener(this);
        btnSubtract.addActionListener(this);
        btnMultiply.addActionListener(this);
        btnDivide.addActionListener(this);

        // Botão de igual
        btnEquals.addActionListener(this);

        setLayout(null);

        // Posicionamento dos botões
        btn1.setBounds(50, 100, 50, 30);
        btn2.setBounds(110, 100, 50, 30);
        btn3.setBounds(170, 100, 50, 30);
        btn4.setBounds(50, 140, 50, 30);
        btn5.setBounds(110, 140, 50, 30);
        btn6.setBounds(170, 140, 50, 30);
        btn7.setBounds(50, 180, 50, 30);
        btn8.setBounds(110, 180, 50, 30);
        btn9.setBounds(170, 180, 50, 30);
        btn0.setBounds(110, 220, 50, 30);

        // Botões de operações
        btnAdd.setBounds(230, 60, 50, 30);
        btnSubtract.setBounds(230, 100, 50, 30);
        btnMultiply.setBounds(230, 140, 50, 30);
        btnDivide.setBounds(230, 180, 50, 30);

        // Botão de igual
        btnEquals.setBounds(230, 220, 50, 30);

        // Display
        lblDisplay.setBounds(50, 10, 200, 30);

        // Adicionando componentes ao JFrame
        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);
        add(btn5);
        add(btn6);
        add(btn7);
        add(btn8);
        add(btn9);
        add(btn0);

        add(btnAdd);
        add(btnSubtract);
        add(btnMultiply);
        add(btnDivide);

        add(btnEquals);

        add(lblDisplay);

        // Configurações do JFrame
        setTitle("Calculadora");
        setSize(344, 300); // Ajustando a altura para acomodar o botão "=" abaixo dos botões de operações
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent evento) {
        // Adicione aqui a lógica de ação se necessário
    }

    public static void main(String[] args) {
        new TestarCalculadora();
    }
}


