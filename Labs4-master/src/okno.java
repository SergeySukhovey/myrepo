import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class okno extends JFrame {
    private int count = 0;

    private JTextField fio = new JTextField(20);
    private JLabel metka = new JLabel("Ваше имя?");
    private JLabel metkaDva = new JLabel("");
    private JLabel metkaTry = new JLabel("");


    class PushingListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            Object button = e.getSource();

            if(button instanceof JButton){
                count++;
                metkaTry.setText("Нажато " + count + " раз");
                metkaDva.setText("Спасибо, "+fio.getText()+"!");
            }
        }
    }

    class PushingListener1 implements ActionListener {
        public void actionPerformed(ActionEvent e){
            Object razmer = e.getSource();

            if(razmer instanceof JButton)
            {
                setSize(500, 500);
            }
        }

    }

    public okno(String title)
    {
        super(title);
        SozdatxOkno();
    }

    private void SozdatxOkno(){

        JButton button = new JButton(" Нажми меня! ");
        JButton razmer = new JButton(" Изменить размер окна");
        button.setBounds(45,60,150,40);
        razmer.setBounds(205,60,200,40);

        button.addActionListener(new PushingListener());
        razmer.addActionListener(new PushingListener1());

        metka.setBounds(15,15,95,30);
        metkaDva.setBounds(15,115,200,30);
        metkaTry.setBounds(15,190,200,30);

        fio.setBounds(120, 15, 100, 30);

        getContentPane().setLayout(null);
        getContentPane().add(button);
        getContentPane().add(razmer);
        getContentPane().add(metka);
        getContentPane().add(metkaDva);
        getContentPane().add(metkaTry);
        getContentPane().add(fio);

        setLocationRelativeTo(null);
    }
}