package go.Custom;

import javax.swing.*;
import java.awt.*;

public class TextFieldCustom extends JTextField {
    private int radius = 10; // Default radius

    public TextFieldCustom() {
        super();
        setOpaque(false); // Make the default background invisible
        setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10)); // Add padding for the text
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
        repaint(); // Refresh the appearance when the radius is changed
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Draw the background with rounded corners
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), radius, radius);

        // Clip the text field area to prevent overlapping
        g2.setClip(new Rectangle(0, 0, getWidth(), getHeight()));

        // Make the component transparent to draw the text properly
        super.paintComponent(g2);
        g2.dispose();
    }

    @Override
    protected void paintBorder(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Draw the border with rounded corners
        g2.setColor(getForeground());
        g2.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, radius, radius);
        g2.dispose();
    }

    @Override
    public void setBounds(int x, int y, int width, int height) {
        super.setBounds(x, y, width, height);
        repaint(); // Refresh the radius whenever the size changes
    }
}
