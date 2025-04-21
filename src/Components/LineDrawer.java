package Components;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JComponent;

/**
 *
 * @author Carlo E. Aranez
 */
public class LineDrawer extends JComponent{

    public LineDrawer() {
        // Increase the size of the component for better visibility
        setPreferredSize(new Dimension(20, 20)); // Size increased to make the line visible
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        // Draw a line from (0, 0) to (width, 0), across the full width of the component
        g2.drawLine(0, 0, getWidth(), 0);
        g2.setBackground(this.getBackground());
    }
}
