package telas;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Criar extends JFrame {

	
	private static final long serialVersionUID = 1L;
	
	private JLabel nome;
	private JLabel nascimento;
	private JLabel cpf;
	private JLabel email;
	
	private JButton confirmar;
	
	private JTextField txt_nome;
	private JTextField txt_nascimento;
	private JTextField txt_cpf;
	private JTextField txt_email;
	
	
	public Criar() {
		
		setTitle("Cadastro");
		setSize(400,400);
		setLayout(null);
		
		nome = new JLabel("Nome");
		nome.setBounds(50,50,200,20);
		
		txt_nome = new JTextField();
		txt_nome.setEditable(true);
		txt_nome.setBounds(87,50,200,20);
		
		cpf = new JLabel("CPF");
		cpf.setBounds(61, 78, 200, 20);
		
		txt_cpf = new JTextField();
		txt_cpf.setEditable(true);
		txt_cpf.setBounds(87,78,200,20);
		
		nascimento = new JLabel("Data de nascimeto");
		nascimento.setBounds(50, 138, 200, 20);
		
		
		txt_nascimento = new JTextField();
		txt_nascimento.setEditable(true);
		txt_nascimento.setBounds(160,138,100,20);
	
		
		email = new JLabel("Email");
		email.setBounds(50,108,200,20);
		
		
		txt_email = new JTextField();
		txt_email.setEditable(true);
		txt_email.setBounds(87,108,200,20);
		
		
		
		
		confirmar = new JButton("Confirmar");
		confirmar.setBounds(100, 310, 200, 35);
			
		
		
		add(nome);
		add(nascimento);
		add(cpf);
		add(confirmar);
		add(email);
		
		add(txt_nome);
		add(txt_cpf);
		add(txt_nascimento);
		add(txt_email);
	}
	
}
