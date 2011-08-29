package com.ahmadiv.gui;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;

import com.ahmadiv.dari.DariGlyphUtils;


/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class Reshaper extends javax.swing.JFrame {
    /**
     * 
     */
    private static final long serialVersionUID = 8393271945094582693L;
    private JScrollPane mainscroller;
    private JTextArea mainTextArea;
    private JMenu jMenu1;
    private JMenuItem reshapeMenuItem;
    private JMenuItem reshapeReverseMenu;
    private JTextArea outputArea;
    private JScrollPane outputscroller;
    private JMenuBar menu;

    /**
    * Auto-generated main method to display this JFrame
    */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Reshaper inst = new Reshaper();
                inst.setLocationRelativeTo(null);
                inst.setVisible(true);
            }
        });
    }
    
    public Reshaper() {
        super();
        initGUI();
    }
    
    private void initGUI() {
        try {
            setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            {
                menu = new JMenuBar();
                setJMenuBar(menu);
                {
                    jMenu1 = new JMenu();
                    menu.add(jMenu1);
                    jMenu1.setText("Action");
                    {
                        reshapeMenuItem = new JMenuItem();
                        jMenu1.add(reshapeMenuItem);
                        reshapeMenuItem.setText("Reshape");
                        reshapeMenuItem.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent evt) {
                                reshape();
                            }
                        });
                    }
                    {
                        reshapeReverseMenu = new JMenuItem();
                        jMenu1.add(reshapeReverseMenu);
                        reshapeReverseMenu.setText("Reshape & Reverse");
                        reshapeReverseMenu.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent evt) {
                                reshapeAndReverse();
                            }
                        });
                    }
                }
            }
            {
                mainscroller = new JScrollPane();
                getContentPane().add(mainscroller, BorderLayout.NORTH);
                mainscroller.setPreferredSize(new java.awt.Dimension(600, 200));
                {
                    mainTextArea = new JTextArea();
                    mainscroller.setViewportView(mainTextArea);
                }
            }
            {
                outputscroller = new JScrollPane();
                getContentPane().add(outputscroller, BorderLayout.CENTER);
                {
                    outputArea = new JTextArea();
                    outputscroller.setViewportView(outputArea);
                }
            }
            this.setTitle("Reshaper example");
            setSize(600, 400);
        } catch (Exception e) {
            //add your error handling code here
            e.printStackTrace();
        }
    }

    protected void reshape() {
        String text = mainTextArea.getText();
        text = DariGlyphUtils.reshapeText(text);
        outputArea.setText(text);
        JOptionPane.showMessageDialog(this, "Reshaped");
        
    }
    protected void reshapeAndReverse() {
        String text = mainTextArea.getText();
        text = DariGlyphUtils.reshapeText(text);
        text = (new StringBuilder(text)).reverse().toString();
        outputArea.setText(text);
        JOptionPane.showMessageDialog(this, "Reshaped & reversed");
        
    }

}
