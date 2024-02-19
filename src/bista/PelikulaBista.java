package bista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import kontrolatzaile.funtzioak.Funtzioak;
import modeloa.Aldagaiak;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;

public class PelikulaBista extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public PelikulaBista() {

		setIconImage(Toolkit.getDefaultToolkit().getImage(PelikulaBista.class.getResource(Aldagaiak.ikonoLogo)));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setResizable(false);

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JPanel Titulua = new JPanel();
		contentPane.add(Titulua, BorderLayout.NORTH);
		Titulua.setLayout(new BorderLayout(0, 0));

		JLabel lblTitulua = new JLabel("Pelikula");
		lblTitulua.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulua.setFont(new Font("Tahoma", Font.PLAIN, 30));
		Titulua.add(lblTitulua, BorderLayout.NORTH);

		JButton btnAtzeraPelikula = new JButton("ATZERA");
		btnAtzeraPelikula.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Titulua.add(btnAtzeraPelikula, BorderLayout.EAST);

		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);

		Funtzioak.filmPanelak();

		for (int i = 0; i < Funtzioak.saioakList.size(); i++) {

			JPanel panel = new JPanel();
			panel.setBorder(UIManager.getBorder("ToolTip.border"));
			scrollPane.setViewportView(panel);

			JButton btnNewButton = new JButton("");
			btnNewButton.setBounds(60, 0, 400, 630);
			btnNewButton.setIcon(new ImageIcon(
					PelikulaBista.class.getResource("/modeloa/img/karteldegia/2001, Odisea en el espacio.jpg")));
			// JButton btnNewButton = new JButton("New button");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			panel.setLayout(null);
			panel.add(btnNewButton);

			JPanel panel_1 = new JPanel();
			panel_1.setBounds(654, 108, 487, 363);
			panel.add(panel_1);
			panel_1.setLayout(null);

			JLabel lblTtituloa = new JLabel();
			lblTtituloa.setFont(new Font("Tahoma", Font.PLAIN, 23));
			lblTtituloa.setBounds(32, 11, 95, 77);
			lblTtituloa.setText("Tituloa");
			panel_1.add(lblTtituloa);

			JLabel lblIraupena = new JLabel("Iraupena");
			lblIraupena.setFont(new Font("Tahoma", Font.PLAIN, 23));
			lblIraupena.setBounds(32, 136, 95, 57);
			panel_1.add(lblIraupena);

			JLabel lblGeneroa = new JLabel("Generoa");
			lblGeneroa.setFont(new Font("Tahoma", Font.PLAIN, 23));
			lblGeneroa.setBounds(32, 250, 95, 57);
			panel_1.add(lblGeneroa);

			JLabel lblTituloaejemplo = new JLabel();
			lblTituloaejemplo.setText("TituloaEjemplo");
			lblTituloaejemplo.setFont(new Font("Tahoma", Font.PLAIN, 23));
			lblTituloaejemplo.setBounds(158, 11, 319, 77);
			panel_1.add(lblTituloaejemplo);

			JLabel lblIraupenaejemplo = new JLabel("IraupenaEjemplo");
			lblIraupenaejemplo.setFont(new Font("Tahoma", Font.PLAIN, 23));
			lblIraupenaejemplo.setBounds(158, 136, 319, 57);
			panel_1.add(lblIraupenaejemplo);

			JLabel lblGeneroaejemplo = new JLabel("GeneroaEjemplo");
			lblGeneroaejemplo.setFont(new Font("Tahoma", Font.PLAIN, 23));
			lblGeneroaejemplo.setBounds(158, 250, 319, 57);
			panel_1.add(lblGeneroaejemplo);

		}
		;

	}

}