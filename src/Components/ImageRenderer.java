/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Components;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;

/**
 *
 * @author Carlo E. Aranez
 */
public class ImageRenderer extends JComponent {

    /**
     * @return the AA_img
     */
    public Icon getAA_img() {
        return AA_img;
    }

    /**
     * @param AA_img the AA_img to set
     */
    public void setAA_img(Icon AA_img) {
        this.AA_img = AA_img;
    }

    /**
     * @return the AA_drawImage
     */
    public boolean isAA_drawImage() {
        return AA_drawImage;
    }

    /**
     * @param AA_drawImage the AA_drawImage to set
     */
    public void setAA_drawImage(boolean AA_drawImage) {
        this.AA_drawImage = AA_drawImage;
    }

    
    private Icon AA_img;
    private boolean AA_drawImage;
    
    public ImageRenderer() {
        setPreferredSize(new Dimension(50,50));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        if (isAA_drawImage()) {
            g2.drawImage(((ImageIcon)getAA_img()).getImage(), 0, 0, getWidth(), getHeight(), null);
        }
    }
    
}
