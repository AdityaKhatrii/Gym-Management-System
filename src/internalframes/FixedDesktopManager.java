/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package internalframes;

import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.DesktopManager;
import java.awt.Component;
import javax.swing.DefaultDesktopManager;
import javax.swing.JComponent;

public class FixedDesktopManager extends DefaultDesktopManager {

    @Override
    public void beginDraggingFrame(JComponent f) {
        // Do nothing to prevent dragging
    }

    @Override
    public void dragFrame(JComponent f, int x, int y) {
        // Do nothing to prevent dragging
    }
}

