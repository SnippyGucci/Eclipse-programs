package gui;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import java.awt.*;
import java.awt.event.*;

public class GUI implements ActionListener {
    private int clicks = 0;
    private JLabel label = new JLabel("Number of clicks:  0     ");    
    private int source = 0;
    private JLabel label2 = new JLabel("Slider position:  0     ");
    private JFrame frame = new JFrame();
    private int status;
    private JLabel instructions = new JLabel("Click to increment or decrement the counter. Slide the slider to increase the multiplier (max is 20).");
    private int x = 0;

    public GUI() {

        // the clickable button
        JButton button = new JButton("Click to add to me :)");
        button.addActionListener(this);
        JButton button2 = new JButton("Click to subtract from me :(");
        button2.addActionListener(this::actionUnformed);
        JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 20, 0);
        slider.setMajorTickSpacing(5);
        slider.setMinorTickSpacing(1);
        slider.addChangeListener(this::stateChanged);

        // the panel with the button and text
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(instructions);
        panel.add(slider);
        panel.add(label2);
        panel.add(button);
        panel.add(button2);
        panel.add(label);

        // set up the frame and display it
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("GUI");
        frame.pack();
        frame.setVisible(true);
    }

    // process the button clicks
    public void actionPerformed(ActionEvent e) {
        clicks++;
        x+=(clicks * status);
        clicks = 0;
        label.setText("Number of clicks:  " + x);
    }
    
    public void actionUnformed(ActionEvent e) {
        clicks--;
        x+=(clicks * status);
        clicks = 0;
        label.setText("Number of clicks:  " + x);
    }
    
    public void stateChanged(ChangeEvent e) {
        JSlider source = (JSlider)e.getSource();
        status = (int)source.getValue();
        label2.setText("Slider:  " + status);
    }

    // create one Frame
    public static void main(String[] args) {
        new GUI();
    }
}