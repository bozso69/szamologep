package szamologep;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class vezerlo {
    JTextField kiiro = new JTextField("");
    JButton button0, button1, button2, button3, button4, button5, button6, button7, button8, button9;
    JButton buttonC, kilepesGomb;
    JButton buttonOsszeadas, buttonKivonas, buttonSzorozas, buttonOsztas, buttonEgyenlo, buttonPontosVesszo;
    util util = new util();


    public vezerlo() {

        JFrame ablak = new JFrame();
        JPanel pane = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        gombok(pane, c);


// kiiro houzzáadaás s panelhez
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 25;       //reset to default
        c.weighty = 1.0;   //request any extra vertical space
        c.anchor = GridBagConstraints.PAGE_END; //bottom of space
        c.insets = new Insets(10, 10, 10, 10);  //top padding
        c.gridx = 0;       //aligned with button 2
        c.gridwidth = 4;   //2 columns wide
        c.gridy = 0;       //third row


        kiiro.setHorizontalAlignment(SwingConstants.RIGHT);
        pane.add(kiiro, c);

// kilépésgom hozzáadás a panelhez

        kilepesGomb = new JButton("Kilépés");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridwidth = 4;
        c.weightx = 0;
        c.weighty = 0;
        c.gridx = 0;
        c.gridy = 6;
        kilepesGomb.addActionListener(new kilepesGonbKlikk());
        pane.add(kilepesGomb, c);


        ablak.add(pane);
        ablak.setLocation(200, 200);
        ablak.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ablak.pack();
        ablak.setResizable(false);
        ablak.setVisible(true);

    }

    // ******************************** GOMBOK
    private void gombok(JPanel pane, GridBagConstraints c) {


        c.ipady = 50;
        c.ipady = 50;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0;
        c.weighty = 0;

        button7 = new JButton("7");
        //c.fill = GridBagConstraints.HORIZONTAL;

        c.gridx = 0;
        c.gridy = 1;
        pane.add(button7, c);


        button8 = new JButton("8");
        c.gridx = 1;
        c.gridy = 1;
        pane.add(button8, c);


        button9 = new JButton("9");

        c.gridx = 2;
        c.gridy = 1;
        pane.add(button9, c);

        buttonOsztas = new JButton("/");
        c.gridx = 3;
        c.gridy = 1;
        pane.add(buttonOsztas, c);

        buttonPontosVesszo = new JButton(",");
        c.gridx = 4;
        c.gridy = 1;
        pane.add(buttonPontosVesszo, c);


        button4 = new JButton("4");
        c.weighty = 0;
        c.gridx = 0;
        c.gridy = 2;
        pane.add(button4, c);

        button5 = new JButton("5");
        c.weighty = 0;
        c.gridx = 1;
        c.gridy = 2;
        pane.add(button5, c);

        button6 = new JButton("6");
        c.weighty = 0;
        c.gridx = 2;
        c.gridy = 2;
        pane.add(button6, c);

        buttonSzorozas = new JButton("X");
        c.gridx = 3;
        c.gridy = 2;
        pane.add(buttonSzorozas, c);

        button1 = new JButton("1");
        c.weighty = 0;
        c.gridx = 0;
        c.gridy = 3;
        pane.add(button1, c);

        button2 = new JButton("2");
        c.weighty = 0;
        c.gridx = 1;
        c.gridy = 3;
        pane.add(button2, c);

        button3 = new JButton("3");
        c.weighty = 0;
        c.gridx = 2;
        c.gridy = 3;
        pane.add(button3, c);

        buttonOsszeadas = new JButton("+");
        c.gridx = 3;
        c.gridy = 3;
        pane.add(buttonOsszeadas, c);


        buttonC = new JButton("C");

        c.weighty = 0;
        c.gridx = 0;
        c.gridy = 4;
        pane.add(buttonC, c);


        button0 = new JButton("0");
        c.weighty = 0;
        c.gridx = 1;
        c.gridy = 4;
        pane.add(button0, c);


        buttonEgyenlo = new JButton("=");
        c.gridx = 2;
        c.gridy = 4;
        pane.add(buttonEgyenlo, c);

        buttonKivonas = new JButton("--");
        c.gridx = 3;
        c.gridy = 4;
        pane.add(buttonKivonas, c);

        button0.addActionListener(new gombKlikk());
        button1.addActionListener(new gombKlikk());
        button2.addActionListener(new gombKlikk());
        button3.addActionListener(new gombKlikk());
        button4.addActionListener(new gombKlikk());
        button5.addActionListener(new gombKlikk());
        button6.addActionListener(new gombKlikk());
        button7.addActionListener(new gombKlikk());
        button8.addActionListener(new gombKlikk());
        button9.addActionListener(new gombKlikk());

        buttonC.addActionListener(new buttonCKlikk());

        buttonKivonas.addActionListener(new gombKlikk());
        buttonOsztas.addActionListener(new gombKlikk());
        buttonSzorozas.addActionListener(new gombKlikk());
        buttonOsszeadas.addActionListener(new gombKlikk());
        buttonEgyenlo.addActionListener(new buttonEgyenloKlikk());
        buttonPontosVesszo.addActionListener(new gombKlikk());


    }

    private class gombKlikk implements ActionListener {
        public gombKlikk(String gomb) {
        }

        public gombKlikk() {

        }

        @Override
        public void actionPerformed(ActionEvent e) {
            //System.out.println(e.toString());

            kiiro.setText(kiiro.getText() + e.getActionCommand());

        }
    }

    private class buttonCKlikk implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            //kiiro.setText("");
            kiiro.setText(util.szamtorles());
        }
    }

    private class kilepesGonbKlikk implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }

    private class buttonEgyenloKlikk implements ActionListener {
        @Override
        //public void actionPerformed(ActionEvent e) {kiiro.setText(util.szamolas(kiiro.getText()));
        public void actionPerformed(ActionEvent e) {
            kiiro.setText(util.elemzes(kiiro.getText()));
        }
    }
}

