package com.nalif73.lesson08;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.Math.sqrt;

public class CalculatorFrame extends JFrame {
    public CalculatorFrame() {
        setTitle("Calculator");
        setBounds(50, 50, 300, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

        JPanel top = new JPanel();
        top.setLayout(new BorderLayout());
        JTextField inputField = new JTextField();
        inputField.setEditable(false);
        top.add(inputField, BorderLayout.CENTER);

        JPanel bottom = new JPanel();
        bottom.setLayout(new GridLayout(5, 3));

        add(top, BorderLayout.NORTH);
        add(bottom, BorderLayout.CENTER);

        DigitButtonListener digitButtonListener = new DigitButtonListener(inputField);

        for (int i = 0; i < 10; i++) {
            JButton button = new JButton(String.valueOf(i));
            button.addActionListener(digitButtonListener);
            bottom.add(button);
        }

        JButton add = new JButton("+");
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton button = (JButton) e.getSource();

                StringBuilder sb = new StringBuilder(inputField.getText());
                sb.append(button.getText());

                inputField.setText(sb.toString());
            }
        });
        bottom.add(add);

        JButton minus = new JButton("-");
        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton button = (JButton) e.getSource();

                StringBuilder sb = new StringBuilder(inputField.getText());
                sb.append(button.getText());

                inputField.setText(sb.toString());
            }
        });
        bottom.add(minus);
        JButton sqrt = new JButton("SQRT");
        sqrt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double sqrt = sqrt(Double.parseDouble(inputField.getText()));
                inputField.setText(Double.toString(sqrt));
            }
        });
        bottom.add(sqrt);


        JButton clear = new JButton("C");
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputField.setText("");
            }
        });
        bottom.add(clear);

        JButton calc = new JButton("=");
        calc.addActionListener(new ActionListener() {
            // исходил из предположения что по п.3 в выражении или все сложение или все вычитание
            // т.к. п.4 задания говорит о расчтете матвыражения, видимо когда уже смешанные операции в поле ввода.
            @Override
            public void actionPerformed(ActionEvent e) {
                int calc=0;
              if(inputField.getText().contains("+")) {
                  String[] values = inputField.getText().split("\\+",0);
                  for (int i = 0; i < values.length; i++)
                      calc += Integer.parseInt(values[i]);
              }
                if(inputField.getText().contains("-")) {
                    String[] values = inputField.getText().split("\\-",0);
                    calc=Integer.parseInt(values[0]);
                    for (int i = 1; i < values.length; i++)
                        calc -= Integer.parseInt(values[i]);
                }
                inputField.setText(String.valueOf(calc));
            }
        });
        bottom.add(calc);


        setVisible(true);

    }
}
