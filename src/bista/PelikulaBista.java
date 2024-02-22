package bista;
import java.text.DateFormat;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import org.jdatepicker.impl.DateComponentFormatter;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import kontrolatzaile.funtzioak.Funtzioak;
import modeloa.Aldagaiak;

import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;
import java.awt.event.ActionEvent;
import javax.swing.JList;

public class PelikulaBista extends JFrame {
	

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    public static JButton btnJarraituPelikula;

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
        lblTitulua.setFont(new Font("Tahoma", Font.PLAIN, 35));
        Titulua.add(lblTitulua, BorderLayout.NORTH);

        JButton btnAtzeraPelikula = new JButton("ATZERA");
        btnAtzeraPelikula.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Funtzioak.zinemaBistaVisible();
                dispose();
            }
        }); 
        
        btnJarraituPelikula = new JButton("JARRAITU");
        btnJarraituPelikula.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Funtzioak.saioaBistaVisible();
                dispose();
        	}
        });
        btnJarraituPelikula.setFont(new Font("Tahoma", Font.PLAIN, 28));
        Titulua.add(btnJarraituPelikula, BorderLayout.SOUTH);
    	btnJarraituPelikula.setEnabled(true); 
        Titulua.add(btnAtzeraPelikula, BorderLayout.EAST);
  

        JPanel Titulua_2 = new JPanel();
        contentPane.add(Titulua_2, BorderLayout.CENTER);
        Titulua_2.setLayout(new BorderLayout(0, 0));
        
        JPanel DatePickerPanel = new JPanel();
        Titulua_2.add(DatePickerPanel, BorderLayout.EAST);
        DatePickerPanel.setLayout(new BorderLayout(0, 0));

        UtilDateModel model = new UtilDateModel();
        Properties properties = new Properties();
        properties.put("text.today", "Hoy");
        properties.put("text.month", "Mes");
        properties.put("text.year", "Año");
        
        model.setDate(2024, Calendar.FEBRUARY, 1); 
        model.setSelected(true);
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        
        JDatePanelImpl datePanel = new JDatePanelImpl(model, properties);
        JDatePickerImpl datePicker = new JDatePickerImpl(datePanel, new DateComponentFormatter());
        
        DatePickerPanel.add(datePicker, BorderLayout.NORTH);

        datePicker.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Obtener la fecha seleccionada del DatePicker
                Date selectedDate = (Date) datePicker.getModel().getValue();

                if (selectedDate != null) {
                    LocalTime saioaOrdua = Funtzioak.Saio_filma();
                    String pattern = "MM/dd/yyyy";
                    DateFormat df = new SimpleDateFormat(pattern);


                 String todayAsString = df.format(selectedDate);
                 


                }
            }

            
        });

        datePicker.getJFormattedTextField().setEditable(true);
        datePicker.setBounds(569, 118, 202, 23);
        
        Date aukeratuta = model.getValue();
        Funtzioak.setEguna(aukeratuta);
        Date gaurkoData = new Date();
                
        if (aukeratuta != null && aukeratuta.before(gaurkoData)) {
            model.setValue(gaurkoData);
            model.setSelected(true);
        }
        
        JScrollPane scrollPane = new JScrollPane();
        Titulua_2.add(scrollPane, BorderLayout.CENTER);

        Funtzioak.filmaDatuak(scrollPane);
    }
    
    public static void BotoiaEnabled() {
    	if (Funtzioak.getIdFilma() == 0) {
        	btnJarraituPelikula.setEnabled(false); 
        }
    }

}
