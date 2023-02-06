import java.awt.*;
import javax.swing.JFrame;

public class DisplayGraphics extends Canvas{

    public void paint(Graphics g) {

        setBackground(Color.GRAY);

        Color oldColor5 = g.getColor();
        Color newColor5 = new Color(60, 60, 60); // Создаём чёрный цвет
        g.setColor(newColor5); // Устанавливаем черный цвет;
        g.fillRoundRect(150, 50, 100, 300, 20, 15); // Чертим прямоугольник с закругленными углами
        g.setColor(oldColor5); // Восстанавливаем исходный цвет;

        Color oldColor6 = g.getColor();
        Color newColor6 = new Color(60, 60, 60); // Создаём чёрный цвет
        g.setColor(newColor6); // Устанавливаем черный цвет;
        g.fillRoundRect(175, 355, 50, 60, 10, 10); // Чертим маленький прямоугольник с закругленными углами
        g.setColor(oldColor6); // Восстанавливаем исходный цвет;

        Color oldColor7 = g.getColor();
        Color newColor7 = new Color(255, 255, 255); // Создаём чёрный цвет
        g.setColor(newColor7); // Устанавливаем черный цвет;
        g.fillArc(155,65,90,80,180,-180);// Рисуем дугу
        g.setColor(oldColor7); // Восстанавливаем исходный цвет;

        Color oldColor8 = g.getColor();
        Color newColor8 = new Color(60, 60, 60); // Создаём красный цвет;
        g.setColor(newColor8); // Устанавливаем красный цвет;
        g.fillOval(150,75,100, 90);// // Чертим круг;
        g.setColor(oldColor8);

        Color oldColor2 = g.getColor();
        Color newColor2 = new Color(255, 0, 0); // Создаём красный цвет;
        g.setColor(newColor2); // Устанавливаем красный цвет;
        g.fillOval(165,80,70, 70);// // Чертим круг;
        g.setColor(oldColor2);

        Color oldColor9 = g.getColor();
        Color newColor9 = new Color(255, 255, 255); // Создаём чёрный цвет
        g.setColor(newColor9); // Устанавливаем черный цвет;
        g.fillArc(155,155,90,80,180,-180);// Рисуем дугу
        g.setColor(oldColor9); // Восстанавливаем исходный цвет;

        Color oldColor10 = g.getColor();
        Color newColor10 = new Color(60, 60, 60); // Создаём красный цвет;
        g.setColor(newColor10); // Устанавливаем красный цвет;
        g.fillOval(150,165,100, 90);// // Чертим круг;
        g.setColor(oldColor10);

        Color oldColor3 = g.getColor();
        Color newColor3 = new Color(255, 255, 0); // Создаём жёлтый цвет;
        g.setColor(newColor3); // Устанавливаем жёлтый цвет;
        g.fillOval(165,170,70, 70);// // Чертим круг;
        g.setColor(oldColor3);

        Color oldColor11 = g.getColor();
        Color newColor11 = new Color(255, 255, 255); // Создаём чёрный цвет
        g.setColor(newColor11); // Устанавливаем черный цвет;
        g.fillArc(155,250,90,80,180,-180);// Рисуем дугу
        g.setColor(oldColor11); // Восстанавливаем исходный цвет;

        Color oldColor12 = g.getColor();
        Color newColor12 = new Color(60, 60, 60); // Создаём красный цвет;
        g.setColor(newColor12); // Устанавливаем красный цвет;
        g.fillOval(150,260,100, 90);// // Чертим круг;
        g.setColor(oldColor12);

        Color oldColor4 = g.getColor();
        Color newColor4 = new Color(0, 255, 0); // Создаём зелёный цвет;
        g.setColor(newColor4); // Устанавливаем зелёный цвет;
        g.fillOval(165,265,70, 70);// // Чертим круг;
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
