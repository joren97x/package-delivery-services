import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.event.*;

public class UserInterface extends JFrame implements ActionListener{

    private final int HEIGHT = 500;
    private final int WIDTH = 500;
    private JPanel radioPanel, senderRecipientPanel, senderPanel, recipientPanel, costAndFeePanel;
    private JLabel titleLabel, senderLabel, senderBlankLabel, recipientBlankLabel, recipientLabel, weightLabel, costLabel, additionalFeeLabel, flatFeeLabel,
    senderNameLabel, senderAddressLabel, senderZIP_codeLabel, senderCityLabel, senderStateLabel, 
    recipientNameLabel, recipientAddressLabel, recipientZIP_codeLabel, recipientCityLabel, recipientStateLabel;
    private JRadioButton standardRadioButton, twoDayRadioButton, overnightRadioButton;
    private ButtonGroup radioButtonGroup;
    private JTextField recipientName, recipientAddress, recipientZIP_code, recipientCity, 
    recipientState, senderName, senderAddress, senderZIP_code, senderState, senderCity,
    cost, weight, flatFee, additionalFee;
    private JButton submitButton;

    public UserInterface() {

        // titleLabel = new JLabel("Joren's Delivery Services");
        this.setLayout(null);
        standardRadioButton = new JRadioButton("Standard package");
        twoDayRadioButton = new JRadioButton("Two day package");
        overnightRadioButton = new JRadioButton("Overnight package");
        radioButtonGroup = new ButtonGroup();
        standardRadioButton.addActionListener(this);
        twoDayRadioButton.addActionListener(this);
        overnightRadioButton.addActionListener(this);

        senderLabel = new JLabel("Sender");
        recipientLabel = new JLabel("Recipient");
        senderBlankLabel = new JLabel("");
        recipientBlankLabel = new JLabel("");
        
        radioPanel = new JPanel();
        radioPanel.add(standardRadioButton);
        radioPanel.add(twoDayRadioButton);
        radioPanel.add(overnightRadioButton);

        radioButtonGroup.add(standardRadioButton);
        radioButtonGroup.add(twoDayRadioButton);
        radioButtonGroup.add(overnightRadioButton);

        senderNameLabel = new JLabel("Name");
        senderAddressLabel = new JLabel("Address");
        senderZIP_codeLabel = new JLabel("ZIP code");
        senderCityLabel = new JLabel("City");
        senderStateLabel = new JLabel("State");

        recipientNameLabel = new JLabel("Name");
        recipientAddressLabel = new JLabel("Address");
        recipientZIP_codeLabel = new JLabel("ZIP code");
        recipientCityLabel = new JLabel("City");
        recipientStateLabel = new JLabel("State");
        
        senderRecipientPanel = new JPanel(new GridLayout(1,12,5,5));
        senderPanel = new JPanel(new GridLayout(6,12));
        recipientPanel = new JPanel(new GridLayout(6,12));

        senderLabel = new JLabel("Sender");
        senderName = new JTextField();
        senderAddress = new JTextField();
        senderCity = new JTextField();
        senderState = new JTextField();
        senderZIP_code = new JTextField();

        recipientLabel = new JLabel("Recipient");
        recipientName = new JTextField();
        recipientAddress = new JTextField();
        recipientCity = new JTextField();
        recipientState = new JTextField();
        recipientZIP_code = new JTextField();

        recipientPanel.add(recipientLabel);
        recipientPanel.add(recipientBlankLabel);
        recipientPanel.add(recipientNameLabel);
        recipientPanel.add(recipientName);
        recipientPanel.add(recipientAddressLabel);
        recipientPanel.add(recipientAddress);
        recipientPanel.add(recipientCityLabel);
        recipientPanel.add(recipientCity);
        recipientPanel.add(recipientStateLabel);
        recipientPanel.add(recipientState);
        recipientPanel.add(recipientZIP_codeLabel);
        recipientPanel.add(recipientZIP_code);

        senderPanel.add(senderLabel);
        senderPanel.add(senderBlankLabel);
        senderPanel.add(senderNameLabel);
        senderPanel.add(senderName);
        senderPanel.add(senderAddressLabel);
        senderPanel.add(senderAddress);
        senderPanel.add(senderCityLabel);
        senderPanel.add(senderCity);
        senderPanel.add(senderStateLabel);
        senderPanel.add(senderState);
        senderPanel.add(senderZIP_codeLabel);
        senderPanel.add(senderZIP_code);

        radioPanel.setBounds(WIDTH/3, 5, 80, 280);
        radioPanel.setSize(130,90);

        senderRecipientPanel.add(senderPanel);
        senderRecipientPanel.add(recipientPanel);
        senderRecipientPanel.setBounds(10, 100, 468, 200);

        costAndFeePanel = new JPanel(new GridLayout(2, 6));
        costLabel = new JLabel("Cost");
        weightLabel = new JLabel("Weight");
        flatFeeLabel = new JLabel("Flat fee");
        additionalFeeLabel = new JLabel("Addional Fee");
        cost = new JTextField("0");
        weight = new JTextField("0");
        flatFee = new JTextField("0");
        additionalFee = new JTextField("0");

        flatFee.setVisible(false);
        additionalFee.setVisible(false);
        flatFeeLabel.setVisible(false);
        additionalFeeLabel.setVisible(false);

        costAndFeePanel.add(weightLabel);
        costAndFeePanel.add(weight);
        costAndFeePanel.add(costLabel);
        costAndFeePanel.add(cost);
        costAndFeePanel.add(flatFeeLabel);
        costAndFeePanel.add(flatFee);
        costAndFeePanel.add(additionalFeeLabel);
        costAndFeePanel.add(additionalFee);
        
        costAndFeePanel.setBounds(10, 320, 468, 50);

        submitButton = new JButton("Submit");
        submitButton.addActionListener(this);
        submitButton.setBounds(WIDTH-120, HEIGHT-120,80,35);

        this.add(radioPanel);
        this.setTitle("Joren's delivery services");
        this.add(senderRecipientPanel);
        this.add(costAndFeePanel);
        this.add(submitButton);
        this.setSize(WIDTH, HEIGHT);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {

        String command = e.getActionCommand();

        switch (command) {
            case "Standard package":
                flatFee.setVisible(false);
                additionalFee.setVisible(false);
                flatFeeLabel.setVisible(false);
                additionalFeeLabel.setVisible(false);
                break;
            case "Two day package":
                flatFee.setVisible(true);
                additionalFee.setVisible(false);
                flatFeeLabel.setVisible(true);
                additionalFeeLabel.setVisible(false);
                break;
            case "Overnight package":
                flatFee.setVisible(false);
                additionalFee.setVisible(true);
                flatFeeLabel.setVisible(false);
                additionalFeeLabel.setVisible(true);
                break;
            case "Submit":
                if(validateFields()) {
                    Person sender = new Person(senderName.getText(), senderAddress.getText(), senderCity.getText(), senderState.getText(), senderZIP_code.getText());
                    Person recipient = new Person(recipientName.getText(), recipientAddress.getText(), recipientCity.getText(), recipientState.getText(), recipientZIP_code.getText());

                    if(standardRadioButton.isSelected()) {
                        Package pkg = new Package(sender, recipient, Float.parseFloat(weight.getText()), Float.parseFloat(cost.getText()));
                        JOptionPane.showMessageDialog(null, String.valueOf(pkg.calculateCost()) + " Delivery cost.");
                    }
                    else if(overnightRadioButton.isSelected()) {
                        Overnight pkg = new Overnight(sender, recipient, Float.parseFloat(weight.getText()), Float.parseFloat(cost.getText()), Float.parseFloat(additionalFee.getText()));
                        JOptionPane.showMessageDialog(null, String.valueOf(pkg.calculateCost()) + " Delivery cost.");
                    }
                    else if(twoDayRadioButton.isSelected()) {
                        TwoDay pkg = new TwoDay(sender, recipient, Float.parseFloat(weight.getText()), Float.parseFloat(cost.getText()), Float.parseFloat(flatFee.getText()));
                        JOptionPane.showMessageDialog(null, String.valueOf(pkg.calculateCost()) + " Delivery cost.");
                    }
                }
                break;
            default:
                break;
        }
    }

    public boolean validateFields() {
        System.out.println(senderName.getText().isEmpty());
        if( senderName.getText().isEmpty() ||
            senderAddress.getText().isEmpty() ||
            senderCity.getText().isEmpty() ||
            senderState.getText().isEmpty() ||
            senderZIP_code.getText().isEmpty() ||
            recipientName.getText().isEmpty() ||
            recipientAddress.getText().isEmpty() ||
            recipientCity.getText().isEmpty() ||
            recipientState.getText().isEmpty() ||
            recipientZIP_code.getText().isEmpty() ||
            cost.getText().isEmpty() ||
            weight.getText().isEmpty()
        ) {
            JOptionPane.showMessageDialog(null,"Fill up the blank fields.");
            return false;
        }

        if(Float.parseFloat(cost.getText()) <= 0 || Float.parseFloat(weight.getText()) <= 0 ) {
            JOptionPane.showMessageDialog(null,"The weight and cost per ounce must be positive numbers greater than 0.");
            return false;
        }

        if(overnightRadioButton.isSelected() && (additionalFee.getText().isEmpty() || Float.parseFloat(additionalFee.getText()) <= 0)) {
            JOptionPane.showMessageDialog(null,"Fill upi ang additional fee oi tanga");
            return false;
        }
        else if(twoDayRadioButton.isSelected() && (flatFee.getText().isEmpty() || Float.parseFloat(flatFee.getText()) <= 0)) {
            JOptionPane.showMessageDialog(null,"Fill upi pod ang flat fee oi amaw");
            return false;
        }

        if(!overnightRadioButton.isSelected() && !twoDayRadioButton.isSelected() && !standardRadioButton.isSelected()) {
            JOptionPane.showMessageDialog(null, "Choose a package dumbass");
            return false;
        }

        return true;

    }
    
}
