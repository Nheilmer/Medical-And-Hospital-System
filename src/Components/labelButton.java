package Components;

import javax.swing.JLabel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author Carlo E. Aranez
 */
public class labelButton extends JLabel {

    public labelButton() {
        this.setForeground(CompConstants.ForegroundColor); // Initial text color
        this.setFont(new Font("Arial", Font.BOLD, 12));
        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); // Hand cursor for clickable feel
        
        // Add mouse listener to change text color when pressed and released
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                changeTextColorOnPress();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                resetTextColorOnRelease();
            }
        });
    }

    // Method to change text color when mouse is pressed
    private void changeTextColorOnPress() {
        this.setForeground(new Color(50,155,255)); // Change to a different color when pressed
    }

    // Method to reset text color to original when mouse is released
    private void resetTextColorOnRelease() {
        this.setForeground(CompConstants.ForegroundColor); // Reset to original color
    }
}