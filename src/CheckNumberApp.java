import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CheckNumberApp extends JFrame {
    private JTextField numberField;
    private JButton checkButton;
    private JLabel resultLabel;

    public CheckNumberApp() {

        setTitle("Genap/Ganjil & Bilangan Prima Checker");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());


        numberField = new JTextField(10);
        checkButton = new JButton("Cek");
        resultLabel = new JLabel("Masukkan angka dan tekan Cek");


        JPanel panel = new JPanel();
        panel.add(new JLabel("Angka: "));
        panel.add(numberField);
        panel.add(checkButton);


        add(panel, BorderLayout.CENTER);
        add(resultLabel, BorderLayout.SOUTH);


        checkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkNumber();
            }
        });


        numberField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) {
                    e.consume();
                }
            }
        });


        numberField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                numberField.setText("");
                resultLabel.setText("Masukkan angka dan tekan Cek");
            }
        });
    }


    private void checkNumber() {
        String input = numberField.getText();
        

        if (input.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Masukkan angka!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int number = Integer.parseInt(input);
        

        String evenOdd = (number % 2 == 0) ? "Genap" : "Ganjil";
        

        String primeStatus = isPrime(number) ? "Prima" : "Bukan Prima";


        JOptionPane.showMessageDialog(this, "Angka " + number + " adalah " + evenOdd + " dan " + primeStatus + ".");
        resultLabel.setText("Angka " + number + " adalah " + evenOdd + " dan " + primeStatus + ".");
    }


    private boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CheckNumberApp().setVisible(true);
            }
        });
    }
}
