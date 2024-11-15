import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import model.Paciente;

public class NuevoPacienteFrame extends JInternalFrame {
    private JComboBox<String> cmbTipoDocumento;
    private JTextField txtNumeroDocumento, txtNombre, txtApellido;
    private JTextField txtFechaNacimiento, txtDireccion, txtOcupacion;
    private JTextField txtEdad, txtTelefono, txtEmail, txtEps;
    private JRadioButton rbMasculino, rbFemenino, rbOtro;
    private JButton btnGuardar, btnCancelar;
    private Font tahomaFontBold = new Font("Tahoma", Font.BOLD, 14);
    private Font tahomaFontPlain = new Font("Tahoma", Font.PLAIN, 14);

    public NuevoPacienteFrame() {
        super("Nuevo Paciente", true, true, true, true);
        initComponents();
    }

    private void initComponents() {
        setLayout(new BorderLayout());

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.WEST;

        // Crear y agregar componentes
        addComponent(panel, createLabel("Tipo de Documento:"), gbc, 0, 0);
        cmbTipoDocumento = new JComboBox<>(new String[]{"Tarjeta de Identidad", "Cédula de Ciudadanía", "Otro"});
        cmbTipoDocumento.setFont(tahomaFontPlain);
        addComponent(panel, cmbTipoDocumento, gbc, 1, 0);

        addComponent(panel, createLabel("Número de Documento:"), gbc, 0, 1);
        addComponent(panel, txtNumeroDocumento = createTextField(), gbc, 1, 1);

        addComponent(panel, createLabel("Nombre:"), gbc, 0, 2);
        addComponent(panel, txtNombre = createTextField(), gbc, 1, 2);

        addComponent(panel, createLabel("Apellido:"), gbc, 0, 3);
        addComponent(panel, txtApellido = createTextField(), gbc, 1, 3);

        addComponent(panel, createLabel("Fecha de Nacimiento (YYYY-MM-DD):"), gbc, 0, 4);
        addComponent(panel, txtFechaNacimiento = createTextField(), gbc, 1, 4);

        addComponent(panel, createLabel("Género:"), gbc, 0, 5);
        JPanel genderPanel = new JPanel();
        genderPanel.setLayout(new BoxLayout(genderPanel, BoxLayout.X_AXIS));
        rbMasculino = createRadioButton("Masculino");
        rbFemenino = createRadioButton("Femenino");
        rbOtro = createRadioButton("Otro");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(rbMasculino);
        genderGroup.add(rbFemenino);
        genderGroup.add(rbOtro);
        genderPanel.add(rbMasculino);
        genderPanel.add(rbFemenino);
        genderPanel.add(rbOtro);
        addComponent(panel, genderPanel, gbc, 1, 5);

        addComponent(panel, createLabel("Dirección de Residencia:"), gbc, 0, 6);
        addComponent(panel, txtDireccion = createTextField(), gbc, 1, 6);

        addComponent(panel, createLabel("Ocupación:"), gbc, 0, 7);
        addComponent(panel, txtOcupacion = createTextField(), gbc, 1, 7);

        addComponent(panel, createLabel("Edad:"), gbc, 0, 8);
        addComponent(panel, txtEdad = createTextField(), gbc, 1, 8);

        addComponent(panel, createLabel("Teléfono:"), gbc, 0, 9);
        addComponent(panel, txtTelefono = createTextField(), gbc, 1, 9);

        addComponent(panel, createLabel("Email:"), gbc, 0, 10);
        addComponent(panel, txtEmail = createTextField(), gbc, 1, 10);

        addComponent(panel, createLabel("EPS:"), gbc, 0, 11);
        addComponent(panel, txtEps = createTextField(), gbc, 1, 11);

        JPanel buttonPanel = new JPanel();
        btnGuardar = createButton("Guardar");
        btnCancelar = createButton("Cancelar");
        buttonPanel.add(btnGuardar);
        buttonPanel.add(btnCancelar);

        add(new JScrollPane(panel), BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        btnGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                guardarPaciente();
            }
        });

        btnCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        pack();
        setSize(600, 700);
    }

    private JLabel createLabel(String text) {
        JLabel label = new JLabel(text);
        label.setFont(tahomaFontBold);
        return label;
    }

    private JTextField createTextField() {
        JTextField textField = new JTextField(20);
        textField.setFont(tahomaFontPlain);
        return textField;
    }

    private JRadioButton createRadioButton(String text) {
        JRadioButton radioButton = new JRadioButton(text);
        radioButton.setFont(tahomaFontPlain);
        return radioButton;
    }

    private JButton createButton(String text) {
        JButton button = new JButton(text);
        button.setFont(tahomaFontPlain);
        return button;
    }

    private void addComponent(JPanel panel, Component component, GridBagConstraints gbc, int x, int y) {
        gbc.gridx = x;
        gbc.gridy = y;
        panel.add(component, gbc);
    }

    private void guardarPaciente() {
        try {
            Paciente paciente = new Paciente();
            paciente.setIdTipoDocumento(cmbTipoDocumento.getSelectedIndex() + 1);
            paciente.setNumeroDocumento(txtNumeroDocumento.getText());
            paciente.setNombre(txtNombre.getText());
            paciente.setApellido(txtApellido.getText());
            paciente.setFechaNacimiento(LocalDate.parse(txtFechaNacimiento.getText(), DateTimeFormatter.ISO_LOCAL_DATE));
            
            if (rbMasculino.isSelected()) {
                paciente.setIdGenero(1);
            } else if (rbFemenino.isSelected()) {
                paciente.setIdGenero(2);
            } else if (rbOtro.isSelected()) {
                paciente.setIdGenero(3);
            }
            
            paciente.setDireccionDeResidencia(txtDireccion.getText());
            paciente.setOcupacion(txtOcupacion.getText());
            paciente.setEdad(Integer.parseInt(txtEdad.getText()));
            paciente.setTelefono(txtTelefono.getText());
            paciente.setEmail(txtEmail.getText());
            paciente.setEps(txtEps.getText());

            // Aquí deberías agregar el código para guardar el paciente en tu base de datos
            JOptionPane.showMessageDialog(this, "Paciente guardado con éxito");
            dispose();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error al guardar el paciente: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 800);
        JDesktopPane desktop = new JDesktopPane();
        frame.setContentPane(desktop);
        NuevoPacienteFrame internalFrame = new NuevoPacienteFrame();
        desktop.add(internalFrame);
        internalFrame.setVisible(true);
        frame.setVisible(true);
    }
}