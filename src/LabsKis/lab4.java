package LabsKis;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.AffineTransform;
import java.awt.geom.GeneralPath;

public class lab4 {//implements Runnable {
    /*public static void main(String[] args) {
        SwingUtilities.invokeLater(new lab4());
    }*/

    /*public void run() {
        JFrame f = new JFrame("Hello, World!");
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.add(new JLabel("Hello World"));
        f.pack();
        f.setVisible(true);
    }*/
    public static void main(String[] args) {
        JFrame fr = new JFrame("Вращение треугольника вокруг своего центра тяжести");
        fr.setPreferredSize(new Dimension(300, 300));
        final JPanel pan = new JPanel();
        fr.add(pan);
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        Timer tm = new Timer(100, new ActionListener() {
            int i = 0;

            @Override
            public void actionPerformed(ActionEvent arg0) {
                //фундаментальный класс для того, чтобы представить 2-мерные формы, текст и изображения
                Graphics2D gr = (Graphics2D) pan.getRootPane().getGraphics();
                pan.update(gr);
                GeneralPath path = new GeneralPath();
                path.append(new Polygon(new int[]{25, 50, 125, 100}, new int[]{25, 75, 75, 25}, 4), true);
                int x = (25 + 50 + 125 + 100) / 4, y = (25 + 75 + 75 + 25) / 4;
                gr.translate(50, 50);
                AffineTransform tranforms = AffineTransform.getRotateInstance((i++) * 0.07, x, y);
                gr.transform(tranforms);
                gr.draw(path);
            }
        });
        tm.start();
    }
}
