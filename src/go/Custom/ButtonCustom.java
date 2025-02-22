package go.Custom;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;

public class ButtonCustom extends JButton {
    private boolean over;
    private boolean clicked;
    private Color color;
    private Color colorOver;
    private Color colorClick;
    private Color colorBorder;
    private int radius = 0;

    public ButtonCustom() {
        setColor(Color.WHITE);
        colorOver = new Color(159, 159, 158);
        colorClick = new Color(255, 98, 25);
        colorBorder = new Color(225, 68, 25);
        setContentAreaFilled(false);
        setFocusPainted(false);
        setBorder(new EmptyBorder(5, 15, 5, 15)); // Setting padding

        // Add mouse listener for hover and click effects
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                setBackground(colorOver);
                over = true;
                repaint();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setBackground(color);
                over = false;
                repaint();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                setBackground(colorClick);
                clicked = true;
                repaint();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                setBackground(over ? colorOver : color);
                clicked = false;
                repaint();
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Paint border
        g2.setColor(colorBorder);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), radius, radius);

        // Paint background
        g2.setColor(getBackground());
        g2.fillRoundRect(2, 2, getWidth() - 4, getHeight() - 4, radius, radius);

        super.paintComponent(g);
    }

    // Getters and setters
    public boolean isOver() {
        return over;
    }

    public void setOver(boolean over) {
        this.over = over;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
        setBackground(color);
    }

    public Color getColorOver() {
        return colorOver;
    }

    public void setColorOver(Color colorOver) {
        this.colorOver = colorOver;
    }

    public Color getColorClick() {
        return colorClick;
    }

    public void setColorClick(Color colorClick) {
        this.colorClick = colorClick;
    }

    public Color getColorBorder() {
        return colorBorder;
    }

    public void setColorBorder(Color colorBorder) {
        this.colorBorder = colorBorder;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
        repaint();
    }

    public boolean isClicked() {
        return clicked;
    }

    public void setClicked(boolean clicked) {
        this.clicked = clicked;
    }

    // Getter and setter for Font (to make it editable in properties)
    @Override
    public Font getFont() {
        return super.getFont();
    }

    @Override
    public void setFont(Font font) {
        super.setFont(font);
        repaint();
    }
}
