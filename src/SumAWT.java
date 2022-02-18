import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Font;

public class SumAWT extends Frame {
    SumAWT(String title){
        setTitle(title);
        setLocation(300, 200);
        setSize(300, 300);
        setLayout(null);

        Label labelA = new Label("a");
        labelA.setBounds(40, 50, 30, 30);
        Label labelB = new Label("b");
        labelB.setBounds(40, 80, 30, 30);
        Label labelSum = new Label("sum");
        labelSum.setBounds(40, 110, 30, 30);

        add(labelA);
        add(labelB);
        add(labelSum);

        TextField textFieldA = new TextField();
        textFieldA.setBounds(70, 50, 100, 30);
        TextField textFieldB = new TextField();
        textFieldB.setBounds(70, 80, 100, 30);
        TextField textFieldSum = new TextField();
        textFieldSum.setBounds(70, 110, 100, 30);

        add(textFieldA);
        add(textFieldB);
        add(textFieldSum);

        Button calc = new Button("calculate");
        calc.setBounds(70, 140, 100, 30);

        calc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               try {
                   int a = Integer.parseInt(textFieldA.getText());
                   int b = Integer.parseInt(textFieldB.getText());
                   int sum = a + b;
                   textFieldSum.setText(Integer.toString(sum));
               }
               catch (NumberFormatException ne){
                   textFieldSum.setText("Error");
               }
            }
        });

        Button clear = new Button("clear");
        clear.setBounds(70, 170, 100, 30);

        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textFieldA.setText("");
                textFieldB.setText("");
                textFieldSum.setText("");
            }
        });

        add(calc);
        add(clear);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        setVisible(true);
}

    public static void main(String[] args) {
        new SumAWT("Sum of two digits");
    }
}
