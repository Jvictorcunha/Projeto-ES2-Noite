import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class LoginView {

	private JFrame frame;
	private JTextField Username;
	private JPasswordField Senha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginView window = new LoginView();
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
	public LoginView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 0,0));
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 764, 411);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 284, 412);
		panel_1.setBackground(new Color(74, 31, 61));
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setVerticalTextPosition(SwingConstants.TOP);
		lblNewLabel_4.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_4.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\Debora\\Desktop\\java codes\\SistemaQuadras\\src\\kisspng-tennis-silhouette-clip-art-5b073c794a93f1.1779566415272008893055 (1).png"));
		lblNewLabel_4.setBounds(0, 0, 284, 412);
		panel_1.add(lblNewLabel_4);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(186,79,84 ));
		panel_2.setBounds(284, 0, 481, 412);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		Username = new JTextField();
		Username.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				Username.setText("");
			}
		});
		Username.setFont(new Font("Dialog", Font.PLAIN, 12));
		Username.setForeground(Color.WHITE);
		Username.setBorder(null);
		Username.setText("Login");
		Username.setName("");
		Username.setBackground(new Color(186,79,84 ));
		Username.setBounds(151, 88, 212, 26);
		panel_2.add(Username);
		Username.setColumns(10);
		
		Senha = new JPasswordField();
		Senha.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				Senha.setText("");
			}
		});
		Senha.setFont(new Font("Dialog", Font.PLAIN, 12));
		Senha.setForeground(Color.WHITE);
		Senha.setBorder(null);
		Senha.setText("Senha\r\n");
		Senha.setBackground(new Color(186,79,84 ));
		Senha.setBounds(151, 147, 212, 26);
		panel_2.add(Senha);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(151, 114, 212, 11);
		panel_2.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(151, 172, 212, 11);
		panel_2.add(separator_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Debora\\Desktop\\java codes\\SistemaQuadras\\src\\icons8-usu\u00E1rio-30.png"));
		lblNewLabel.setBounds(111, 92, 30, 26);
		panel_2.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Debora\\Desktop\\java codes\\SistemaQuadras\\src\\icons8-desbloquear-particular-30.png"));
		lblNewLabel_1.setBounds(111, 148, 30, 26);
		panel_2.add(lblNewLabel_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(204, 204, 204)));
		panel_3.setBackground(new Color(186,79,84 ));
		panel_3.setBounds(151, 194, 97, 26);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Entrar");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(0, 0, 97, 26);
		panel_3.add(lblNewLabel_2);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBorder(new LineBorder(new Color(204, 204, 204)));
		panel_3_1.setBackground(new Color(186,79,84 ));
		panel_3_1.setBounds(266, 194, 97, 26);
		panel_2.add(panel_3_1);
		panel_3_1.setLayout(null);
		
		JLabel lblNewLabel_2_1 = new JLabel("Cadastrar");
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_2_1.setBounds(0, 0, 97, 25);
		panel_3_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Esqueceu sua senha?");
		lblNewLabel_2_2.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_2_2.setForeground(Color.WHITE);
		lblNewLabel_2_2.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_2_2.setBounds(187, 255, 142, 11);
		panel_2.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_3 = new JLabel("X");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		lblNewLabel_3.setForeground(new Color(74,31,61));
		lblNewLabel_3.setFont(new Font("Segoe UI", Font.BOLD, 24));
		lblNewLabel_3.setBounds(457, 3, 16, 19);
		panel_2.add(lblNewLabel_3);
		frame.setBounds(100, 100, 780, 449);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
