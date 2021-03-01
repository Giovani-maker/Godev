package com.proway.rest.InterfaceGrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.proway.rest.datasource.model.Pessoa;
import com.proway.rest.datasource.model.EspacoCafe;
import com.proway.rest.datasource.model.SalaEvento;
import com.proway.rest.methods.GeraPost;
import com.proway.rest.methods.MethodGet;
import com.proway.rest.resource.model.PessoaResource;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TelaPrincipal extends JFrame {

	private JPanel contentPane;
	private String function;
	private int mouseX;
	private int mouseY;
	private String URL = "http://localhost:8080/api";
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
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
	public TelaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 784, 570);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 248, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panel.setBackground(new Color(255,153,102));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel.setBackground(new Color(51,153,204));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				panel.setBackground(new Color(51,153,204));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				panel.setBackground(new Color(255,153,102));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				MethodGet mget = new MethodGet();
				//MethodGet mget2 = new MethodGet();
				function = "/salaevento";
				Pessoa pessoa = new Pessoa();
				String json, json2;
				URL = URL+function;
				try {
					
					json = mget.sendGet(URL,"GET");
					//URL = "http://localhost:8080/api/espacocafe/save";
					//json2 = mget2.sendGet(URL,"GET");
					if(!json.equals("[]") /*&& !json2.equals("[]")*/) {
						String val = null;
						val = JOptionPane.showInputDialog(null, "Entre com o nome da Pessoa");
						if(val!=null) {
							pessoa.setNome(val);
							val = JOptionPane.showInputDialog(null, "Entre com o sobrenome da Pessoa");
							pessoa.setSobrenome(val);
							String a1 = "12";
							pessoa.setIdSala_Evento1(a1);
							pessoa.setIdSala_Evento2(a1);
							pessoa.setIdEspacoCafe1(a1);
							pessoa.setIdEspacoCafe2(a1);

							java.lang.reflect.Type pessoaType = new TypeToken<Pessoa>() {
							}.getType();

							Gson g = new Gson();
							json = g.toJson(pessoa, pessoaType);

							GeraPost geraPost = new GeraPost();
							function = "/pessoa/save";
							URL = "http://localhost:8080/api"+function;
							geraPost.sendPost(URL, json, "POST");
						}
					}else {
						JOptionPane.showMessageDialog(null,"Para cadastrar uma pessoa necessita existir pelo menos duas Salas e Espacos para Café cadastrados");
					}
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null,"Para cadastrar uma pessoa necessita existir pelo menos duas Salas e Espacos para Café cadastrados");
					e1.printStackTrace();
				}
			}
		});


		panel.setBorder(null);
		panel.setBackground(new Color(51, 153, 204));
		panel.setBounds(16, 105, 240, 300);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("CADASTRO PESSOA");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Bahnschrift", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 240, 300);
		panel.add(lblNewLabel);

		JPanel panel_1 = new JPanel();
		panel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panel_1.setBackground(new Color(255,153,102));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_1.setBackground(new Color(51,153,204));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				panel_1.setBackground(new Color(51,153,204));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				panel_1.setBackground(new Color(255,153,102));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				SalaEvento salaEvento = new SalaEvento();
				String val = null;
				String json;
				val = JOptionPane.showInputDialog(null, "Entre com o nome da Sala do Evento");
				salaEvento.setNome(val);
				if(val!=null) {
					try {
						val = JOptionPane.showInputDialog(null, "Entre com a lotação da Sala do Evento");
						salaEvento.setLotacao(val);
						int valida = Integer.parseInt(val);
						System.out.println("Este: "+salaEvento.getLotacao());
					}catch(Exception e2) {
						JOptionPane.showMessageDialog(null,"Entre com um número válido");
					}
					java.lang.reflect.Type salaEventoType = new TypeToken<SalaEvento>() {
					}.getType();

					Gson g = new Gson();
					json = g.toJson(salaEvento, salaEventoType);
					GeraPost geraPost = new GeraPost();
					function = "/salaevento/save";
					URL = "http://localhost:8080/api/salaevento/save";
					try {
						geraPost.sendPost(URL, json,"POST");
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

				}
			}
		});
		panel_1.setBorder(null);
		panel_1.setBackground(new Color(51, 153, 204));
		panel_1.setBounds(264, 105, 240, 300);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblCadastroSalaEvento = new JLabel("CADASTRO SALA");
		lblCadastroSalaEvento.setForeground(new Color(255, 255, 255));
		lblCadastroSalaEvento.setFont(new Font("Bahnschrift", Font.BOLD, 18));
		lblCadastroSalaEvento.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastroSalaEvento.setBounds(0, 0, 240, 300);
		panel_1.add(lblCadastroSalaEvento);

		JPanel panel_2 = new JPanel();
		panel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panel_2.setBackground(new Color(255,153,102));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_2.setBackground(new Color(51,153,204));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				panel_2.setBackground(new Color(51,153,204));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				panel_2.setBackground(new Color(255,153,102));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				EspacoCafe espacoCafe = new EspacoCafe();
				String val = null;
				String json;
				val = JOptionPane.showInputDialog(null, "Entre com o nome da Espaco do café");
				espacoCafe.setNome(val);
				java.lang.reflect.Type espacoCafeType = new TypeToken<EspacoCafe>() {
				}.getType();

				Gson g = new Gson();
				json = g.toJson(espacoCafe, espacoCafeType);
				GeraPost geraPost = new GeraPost();
				URL = "http://localhost:8080/api/espacocafe/save";
				try {
					geraPost.sendPost(URL, json,"POST");
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				
				}
			});
		panel_2.setBorder(null);
		panel_2.setBackground(new Color(51, 153, 204));
		panel_2.setBounds(512, 105, 240, 300);
		contentPane.add(panel_2);
		panel_2.setLayout(null);

		JLabel lblNewLabel_2 = new JLabel("CAFÉ");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Bahnschrift", Font.BOLD, 18));
		lblNewLabel_2.setBounds(92, 163, 85, 28);
		panel_2.add(lblNewLabel_2);

		JLabel lblCadastroEspacoCafe = new JLabel("CADASTRO ESPACO ");
		lblCadastroEspacoCafe.setForeground(new Color(255, 255, 255));
		lblCadastroEspacoCafe.setFont(new Font("Bahnschrift", Font.BOLD, 18));
		lblCadastroEspacoCafe.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastroEspacoCafe.setBounds(0, 0, 240, 300);
		panel_2.add(lblCadastroEspacoCafe);

		JLabel lblTitulo = new JLabel("Evento da Proway");
		lblTitulo.setBackground(new Color(51, 153, 204));
		lblTitulo.setForeground(new Color(51, 153, 204));
		lblTitulo.setFont(new Font("Georgia", Font.PLAIN, 50));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(163, 11, 443, 81);
		contentPane.add(lblTitulo);

		JPanel panel_3 = new JPanel();
		panel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panel_3.setBackground(new Color(255,153,102));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_3.setBackground(new Color(51,153,204));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				panel_3.setBackground(new Color(51,153,204));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				panel_3.setBackground(new Color(255,153,102));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				TelaVisualização tela = new TelaVisualização();
				tela.setVisible(true);
				TelaPrincipal.this.dispose();
			}
		});
		panel_3.setBackground(new Color(51, 153, 204));
		panel_3.setBounds(16, 414, 736, 110);
		contentPane.add(panel_3);
		panel_3.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("VIZUALIZAR EVENTO");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Bahnschrift", Font.BOLD, 18));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(0, 0, 736, 110);
		panel_3.add(lblNewLabel_1);
		setLocationRelativeTo(null);
		}
	}
