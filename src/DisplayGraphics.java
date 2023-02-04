import java.awt.*;
import javax.swing.JFrame;

public class DisplayGraphics extends Canvas{

    public void paint(Graphics g) {

        setBackground(Color.GRAY);

        Color oldColor5 = g.getColor();
        Color newColor5 = new Color(60, 60, 60); // Создаём чёрный цвет
        g.setColor(newColor5); // Устанавливаем черный цвет;
        g.fillRoundRect(150, 70, 100, 275, 20, 15); // Чертим прямоугольник с закругленными углами
        g.setColor(oldColor5); // Восстанавливаем исходный цвет;

        Color oldColor6 = g.getColor();
        Color newColor6 = new Color(60, 60, 60); // Создаём чёрный цвет
        g.setColor(newColor6); // Устанавливаем черный цвет;
        g.fillRoundRect(175, 350, 50, 60, 10, 10); // Чертим прямоугольник с закругленными углами
        g.setColor(oldColor6); // Восстанавливаем исходный цвет;

        Color oldColor2 = g.getColor();
        Color newColor2 = new Color(255, 0, 0); // Создаём красный цвет;
        g.setColor(newColor2); // Устанавливаем красный цвет;
        g.fillOval(165,90,70, 70);// // Чертим круг;
        g.setColor(oldColor2);

        Color oldColor3 = g.getColor();
        Color newColor3 = new Color(255, 255, 0); // Создаём жёлтый цвет;
        g.setColor(newColor3); // Устанавливаем жёлтый цвет;
        g.fillOval(165,170,70, 70);// // Чертим круг;
        g.setColor(oldColor3);

        Color oldColor4 = g.getColor();
        Color newColor4 = new Color(0, 255, 0); // Создаём зелёный цвет;
        g.setColor(newColor4); // Устанавливаем зелёный цвет;
        g.fillOval(165,250,70, 70);// // Чертим круг;
        g.setColor(oldColor4);

    }
    public static void main(String[] args) {
        DisplayGraphics m = new DisplayGraphics();
        JFrame f = new JFrame();
        f.setTitle("Светофор");
        f.add(m);
        f.setSize(400,500);
        f.setVisible(true);
    }

}
