package com.proway.rest.InterfaceGrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.SystemColor;

public class TelaVisualização extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaVisualização frame = new TelaVisualização();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaVisualização() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 784, 570);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 153, 153));
		panel.setBounds(39, 27, 190, 137);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Pessoa");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblNewLabel.setBounds(0, 0, 190, 137);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 153, 153));
		panel_1.setBounds(287, 27, 190, 137);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblPessoa = new JLabel("Sala do evento");
		lblPessoa.setForeground(Color.WHITE);
		lblPessoa.setHorizontalAlignment(SwingConstants.CENTER);
		lblPessoa.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblPessoa.setBounds(0, 0, 190, 137);
		panel_1.add(lblPessoa);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 153, 153));
		panel_2.setBounds(540, 27, 190, 137);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblPessoa_1 = new JLabel("Espaço de Café");
		lblPessoa_1.setForeground(Color.WHITE);
		lblPessoa_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPessoa_1.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblPessoa_1.setBounds(0, 0, 190, 137);
		panel_2.add(lblPessoa_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(39, 164, 190, 38);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(287, 164, 190, 38);
		contentPane.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(540, 164, 190, 38);
		contentPane.add(comboBox_2);
		
		JLabel lblNewLabel_1 = new JLabel("Nome");
		lblNewLabel_1.setBounds(39, 213, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(39, 227, 175, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(39, 271, 175, 20);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Sobrenome");
		lblNewLabel_1_1.setBounds(39, 258, 68, 14);
		contentPane.add(lblNewLabel_1_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(39, 315, 175, 20);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_1_2 = new JLabel("Sala Primeira Etapa");
		lblNewLabel_1_2.setBounds(39, 302, 106, 14);
		contentPane.add(lblNewLabel_1_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(39, 359, 175, 20);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel_1_3 = new JLabel("Sala Segunda Etapa");
		lblNewLabel_1_3.setBounds(39, 346, 96, 14);
		contentPane.add(lblNewLabel_1_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(39, 404, 175, 20);
		contentPane.add(textField_4);
		
		JLabel lblNewLabel_1_4 = new JLabel("1° Espaço Café  ");
		lblNewLabel_1_4.setBounds(39, 390, 87, 14);
		contentPane.add(lblNewLabel_1_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(39, 449, 175, 20);
		contentPane.add(textField_5);
		
		JLabel lblNewLabel_1_4_1 = new JLabel("2° Espaço Café  ");
		lblNewLabel_1_4_1.setBounds(39, 435, 87, 14);
		contentPane.add(lblNewLabel_1_4_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 204, 102));
		panel_3.setBounds(10, 11, 241, 509);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 204, 102));
		panel_4.setBounds(258, 11, 251, 509);
		contentPane.add(panel_4);
		panel_4.setLayout(null);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(27, 272, 192, 48);
		panel_4.add(comboBox_3);
		
		JLabel lblNewLabel_2 = new JLabel("Participantes Primeira Etapa");
		lblNewLabel_2.setBounds(27, 247, 148, 14);
		panel_4.add(lblNewLabel_2);
		
		JComboBox comboBox_3_1 = new JComboBox();
		comboBox_3_1.setBounds(27, 366, 192, 48);
		panel_4.add(comboBox_3_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Participantes Segunda Etapa");
		lblNewLabel_2_1.setBounds(27, 341, 148, 14);
		panel_4.add(lblNewLabel_2_1);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(255, 204, 102));
		panel_5.setBounds(517, 11, 241, 509);
		contentPane.add(panel_5);
		panel_5.setLayout(null);
		
		JComboBox comboBox_3_2 = new JComboBox();
		comboBox_3_2.setBounds(22, 273, 192, 48);
		panel_5.add(comboBox_3_2);
		
		JLabel lblNewLabel_2_2 = new JLabel("Participantes Primeira Etapa");
		lblNewLabel_2_2.setBounds(22, 248, 148, 14);
		panel_5.add(lblNewLabel_2_2);
		
		JComboBox comboBox_3_1_1 = new JComboBox();
		comboBox_3_1_1.setBounds(22, 367, 192, 48);
		panel_5.add(comboBox_3_1_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Participantes Segunda Etapa");
		lblNewLabel_2_1_1.setBounds(22, 342, 148, 14);
		panel_5.add(lblNewLabel_2_1_1);
	}
}
