import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

 class S17Q2 implements Runnable {
    private JTextArea textField;
    private JButton startButton;
    private volatile boolean isRunning;

    public S17Q2(JTextArea textField, JButton startButton) {
        this.textField = textField;
        this.startButton = startButton;
        this.isRunning = false;
    }

    
    public void run() {
        int num = 1;
        while (isRunning) {
            textField.setText(Integer.toString(num));
            num++;
            if (num > 100) {
                num = 1;
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void start() {
        isRunning = true;
        new Thread(this).start();
    }

    public void stop() {
        isRunning = false;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Number Display");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel(new BorderLayout());
        JTextArea textField = new JTextArea(1, 5);
        textField.setEditable(false);
        JButton startButton = new JButton("Start");
        S17Q2 numberDisplay = new S17Q2(textField, startButton);
        startButton.addActionListener(new ActionListener() {
           
            public void actionPerformed(ActionEvent e) {
                if (startButton.getText().equals("Start")) {
                    startButton.setText("Stop");
                    numberDisplay.start();
                } else {
                    startButton.setText("Start");
                    numberDisplay.stop();
                }
            }
        });
        panel.add(textField, BorderLayout.CENTER);
        panel.add(startButton, BorderLayout.SOUTH);
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
