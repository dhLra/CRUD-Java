package telas;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Procurar_Digitacao extends JFrame {

	
	private static final long serialVersionUID = 1L;
	
	private JLabel label;
	private JTextField txt_field;
	private JButton btn;
	
	
	public Procurar_Digitacao() {
		
		setTitle("Procurar");
		setSize(400,200);
		setLayout(null);
		
		
		label = new JLabel ("ERROR");
		label.setBounds(125, 15, 250, 20);
		
		txt_field = new JTextField();
		txt_field.setEditable(true);
		txt_field.setBounds(68,80,250,20);
		
		btn = new JButton("Confirmar");
		btn.setBounds(95, 115, 200, 35);
		
		
		add(label);
		add(txt_field);
		add(btn);
		
	}

	
	public void TipoDeProcura(int tipo) {
		
		if(tipo == 0) {
			label.setText("Digite o nome do cliente");
			System.out.println("nome");
		}
		
		if(tipo == 1) {
			label.setText("Digite o CPF do cliente");
			
		}
		if (tipo == 2) {
			label.setText("Digite o email do cliente");
		}
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	


