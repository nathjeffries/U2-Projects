import javafx.scene.input.InputMethodTextRun;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RPGCharacterGUI {
    JFrame frame;
    static JButton Calculate = new JButton("Calculate");
    static JTextField strengthInput = new JTextField(4);
    static JTextField dexterityInput = new JTextField(4);
    static JTextField resistanceInput = new JTextField(4);
    static JTextField speedInput = new JTextField(4);
    static JTextField intelligenceInput = new JTextField(4);
    static JLabel strengthLabel = new JLabel("Enter your strength rating 0-99: ");
    static JLabel dexterityLabel = new JLabel("Enter your dexterity rating 0-99: ");
    static JLabel resistanceLabel = new JLabel("Enter your resistance rating 0-99: ");
    static JLabel speedLabel = new JLabel("Enter your speed rating 0-99: ");
    static JLabel intelligenceLabel = new JLabel("Enter your intelligence rating 0-99: ");
    static JLabel damageLabel = new JLabel();
    static JLabel armorLabel = new JLabel();
    static JLabel handlingLabel = new JLabel();
    static JLabel stealthLabel = new JLabel();
    static JLabel overallLabel = new JLabel();

    public RPGCharacterGUI() {
        frame = new JFrame("RPG Character");
        JPanel panel = new Drawing();
        frame.setSize(400, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);


        Calculate.addActionListener(new CalculateListener());




        panel.add(strengthLabel);
        panel.add(strengthInput);
        panel.add(dexterityLabel);
        panel.add(dexterityInput);
        panel.add(resistanceLabel);
        panel.add(resistanceInput);
        panel.add(speedLabel);
        panel.add(speedInput);
        panel.add(intelligenceLabel);
        panel.add(intelligenceInput);
        panel.add(Calculate);
        panel.add(damageLabel);
        panel.add(armorLabel);
        panel.add(handlingLabel);
        panel.add(stealthLabel);
        panel.add(overallLabel);
        frame.add(panel);

        frame.setVisible(true);

        frame.setVisible(true);


    }

    class Drawing extends JPanel {
        public Drawing() {
            setBackground(Color.lightGray);
        }
    }

    public class CalculateListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int strengthRating = Integer.parseInt(strengthInput.getText());
            int dexterityRating = Integer.parseInt(dexterityInput.getText());
            int resistanceRating = Integer.parseInt(resistanceInput.getText());
            int speedRating = Integer.parseInt(speedInput.getText());
            int intelligenceRating = Integer.parseInt(intelligenceInput.getText());

            damageLabel.setText("Damage: "+((strengthRating * 0.7) + (speedRating * 0.2) + (intelligenceRating * 0.1)));
            armorLabel.setText("Armor: "+((resistanceRating * 0.7) + (strengthRating * 0.2) + (intelligenceRating * 0.1)));
            handlingLabel.setText("Handling: "+((dexterityRating * 0.6) + (speedRating * 0.2) + (intelligenceRating * 0.2)));
            stealthLabel.setText("Stealth: " + ((speedRating * 0.7) + (intelligenceRating * 0.3)));
            overallLabel.setText("Overall: " + ((strengthRating + resistanceRating + dexterityRating + speedRating + intelligenceRating) / 5));


        }


    }
}