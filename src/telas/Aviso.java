package telas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Aviso extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JLabel aviso;
	private JButton confirmar;
	
	
	public Aviso() {
				
		setTitle("Aviso");
		setSize(320,270);
		setLayout(null);
		
		aviso = new JLabel();
		aviso.setBounds(78,50,200,20);
		
		confirmar = new JButton("OK!");
		confirmar.setBounds(60, 150, 200, 30);
		confirmar.addActionListener(new ActionListener(){
			@Override
				public void actionPerformed(ActionEvent arg0) {
					setVisible(false);
			}
		});
		
		add(aviso);
		add(confirmar);
	
	}
	
	public void TipoAviso(int tipo) {
		
		if(tipo == 0) {
			aviso.setText("Cadastrado com Sucesso !");
		}
		
		if(tipo == 1) {
			aviso.setText("Deletado com Sucesso !");
			
		}
		if(tipo == 2) {
			aviso.setText("Alterado com Sucesso !");
		}
	}
	
}
