package telas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Procurar extends JFrame {
	
	
	private static final long serialVersionUID = 1L;
	
	private JLabel aviso;
	private JButton procurar_nome;
	private JButton procurar_cpf;
	private JButton procurar_email;
	
	Procurar_Digitacao p = new Procurar_Digitacao();
	
	public Procurar() {
		
		setTitle("Procurar");
		setSize(400,300);
		setLayout(null);
		
		aviso = new JLabel("Selecione a forma que deseja procurar" );
		aviso.setBounds(75,50,250,20);
		
		procurar_nome = new JButton("Nome");
		procurar_nome.setBounds(87, 85, 200, 30);
		procurar_nome.addActionListener(new ActionListener(){
			@Override
				public void actionPerformed(ActionEvent arg0) {
					p.TipoDeProcura(0);
					p.setVisible(true);
			}
		});
		
		
		procurar_cpf = new JButton("CPF");
		procurar_cpf.setBounds(87, 130, 200, 30);
		procurar_cpf.addActionListener(new ActionListener(){
			@Override
				public void actionPerformed(ActionEvent arg0) {
					p.TipoDeProcura(1);
					p.setVisible(true);
			}
		});
		
		procurar_email = new JButton("Email");
		procurar_email.setBounds(87, 175, 200, 30);
		procurar_email.addActionListener(new ActionListener(){
			@Override
				public void actionPerformed(ActionEvent arg0) {
					p.TipoDeProcura(2);
					p.setVisible(true);
			}
		});
			
		add(aviso);
		add(procurar_nome);
		add(procurar_cpf);
		add(procurar_email);
			
	}
	
}
