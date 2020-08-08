package telas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainScreen extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JButton deletar;
	private JButton criar;
	private JButton atualizar;
	private JLabel title;
	
	
	public MainScreen() {
		
		setTitle("CRUD");
		setSize(400,400);
		setLayout(null);
		
		title = new JLabel ("CRUD");
		title.setBounds(175, 50, 200, 20);

		
		criar = new JButton("Criar novo cliente");
		criar.setBounds(100,250, 200, 20);
		criar.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Criar c = new Criar();
				c.setVisible(true);
			}
		});
		
		atualizar = new JButton("Atualizar um cliente");
		atualizar.setBounds(100, 280, 200, 20);
		atualizar.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				Procurar a = new Procurar();
				a.setVisible(true);
				
			}
		});
		
		deletar = new JButton("Delete um cliente");
		deletar.setBounds(100, 310, 200, 20);
		deletar.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				Procurar a = new Procurar();
				a.setVisible(true);
			}
		});
		
		add(title);
		add(criar);
		add(atualizar);
		add(deletar);
	}
	
}
