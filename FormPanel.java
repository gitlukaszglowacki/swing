import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class FormPanel extends JPanel {
    private JLabel nameLabel;
    private JLabel occLabel;
    private JTextField nameField;
    private JTextField occField;
    private JButton okBtn;

    public FormPanel() {
        Dimension dim = getPreferredSize();
        dim.width = 250;
        setPreferredSize(dim);

        GridBagConstraints gc = new GridBagConstraints();

        nameLabel = new JLabel("Name: ");
        occLabel = new JLabel("Occupation: ");
        nameField = new JTextField(10);
        occField = new JTextField(10);
        okBtn = new JButton("OK");

        gc.gridx = 0;
        gc.gridy = 0;
        gc.weightx = 1;
        gc.weighty = 1;
        add(nameLabel, gc);
        add(nameField, gc);

        gc.gridy = 1;
        add(occLabel, gc);
        add(occField, gc);

        Border innerBorder = BorderFactory.createTitledBorder("dodaj ludzika");
        Border outerBorder = BorderFactory.createEmptyBorder(5,5,5,5);
        setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));
    }
}

