import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Exercise8 {
      public static void main(String[] args) {
            //Creates a way to test more than one number at a time in a visual way :)
            JFrame frame = new JFrame("Aermann's function");
            frame.setIconImage(new ImageIcon("sm.png").getImage());
            frame.setSize(200, 150);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
            JPanel panel = new JPanel();
            frame.add(panel);
            JTextField inputM = new JTextField(10);
            JTextField inputN = new JTextField(10);
            inputM.setText("3");
            inputN.setText("4");
            panel.add(inputM);
            panel.add(inputN);
            JButton button = new JButton("Calculate");
            panel.add(button);
            JLabel label = new JLabel("Result");
            panel.add(label);
            frame.setVisible(true);
            button.addActionListener(e -> {
                  int m = Integer.parseInt(inputM.getText());
                  int n = Integer.parseInt(inputN.getText());
                  String result = "0";
                  result = A(m, n);
                  label.setText("Result: " + result);
            });    
            // if you want to run it the old fashion way :)       
            //System.out.println(A(3, 9));
      }

      private static String A(int m, int n) {
            if (m == 0) {
                  return Integer.toString(n + 1);
            } else if (n == 0) {
                  return A(m - 1, 1);
            } else {
                  return A(m - 1, Integer.parseInt(A(m, n - 1)));
            }
      }
}