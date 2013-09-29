import java.awt.EventQueue;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;


public class Image {
	

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Image window = new Image();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Image() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnParcourir = new JButton("Parcourir");
		btnParcourir.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnParcourir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 filtreE filtre = new filtreE("image pgm");
			       filtre.addExtension(".pgm");
			      
			JFileChooser chooser = new JFileChooser(".");
			chooser.addChoosableFileFilter(filtre);
			chooser.showOpenDialog(null);
			String a=new String(chooser.getSelectedFile().toString());
			//a.replace('/', '\\');
			for(int i=0;i<a.length();i++)
			{char x=a.charAt(i);
			if(x=='\\')
			//a.setCharAt(i, "a");
			a= a.substring(0,i) +'/' + a.substring(i+1);
			
			//jLabel3.setText(a);
			//jLabel3.setVisible(true);
			textField.setText(a);
			
			
			
			}	
			}
		});
		btnParcourir.setBounds(210, 40, 89, 21);
		frame.getContentPane().add(btnParcourir);
		
		JLabel lblNewLabel = new JLabel("Parcourir une image:");
		lblNewLabel.setFont(new Font("Stencil", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 113, 179, 18);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("Parcourir une image:");
		label.setFont(new Font("Stencil", Font.PLAIN, 14));
		label.setBounds(10, 42, 179, 18);
		frame.getContentPane().add(label);
		
		JLabel label_2 = new JLabel("");
		label_2.setBounds(210, 115, 46, 14);
		frame.getContentPane().add(label_2);
		
		textField = new JTextField();
		textField.setBounds(183, 112, 241, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnHis = new JButton("Histogramme");
		btnHis.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnHis.setBounds(10, 170, 122, 23);
		frame.getContentPane().add(btnHis);
		
	}
	}


