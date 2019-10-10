package noticeboard;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;

public class NoticeBoard implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        this.frame = new JFrame();
        this.frame.setPreferredSize(new Dimension(400, 300));
        this.frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        createComponents(this.frame.getContentPane());
        this.frame.pack();
        this.frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout gridLayout = new GridLayout(3, 1);
        container.setLayout(gridLayout);
        JTextField textAreaTop = new JTextField("I was copied here from the JTextArea.");
        JButton buttonCenter = new JButton("Copy!");
        JLabel labelBottom = new JLabel(); 
        ActionEventListener copier = new ActionEventListener(textAreaTop, labelBottom);
        buttonCenter.addActionListener(copier);
        container.add(textAreaTop);
        container.add(buttonCenter);
        container.add(labelBottom);
    }
    
    public JFrame frame() {
        return this.frame;
    }
}
