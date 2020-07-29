package telas;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Procurar extends JFrame {
	
	
	private static final long serialVersionUID = 1L;
	
	private JLabel aviso;
	private JButton procurar_nome;
	private JButton procurar_cpf;
	private JButton procurar_email;
	
	
	public Procurar() {
		
		setTitle("Procurar");
		setSize(400,300);
		setLayout(null);
		
		aviso = new JLabel("Selecione a forma que deseja procurar" );
		aviso.setBounds(75,50,250,20);
		
		procurar_nome = new JButton("Nome");
		procurar_nome.setBounds(87, 85, 200, 30);
		
		procurar_cpf = new JButton("CPF");
		procurar_cpf.setBounds(87, 130, 200, 30);
		
		procurar_email = new JButton("Email");
		procurar_email.setBounds(87, 175, 200, 30);
		
		
		add(aviso);
		add(procurar_nome);
		add(procurar_cpf);
		add(procurar_email);
			
	}

}
