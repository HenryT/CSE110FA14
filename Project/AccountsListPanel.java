/****************************************************************************

                                                        Ryan Bridges
                                                        CSE 110, Fall 2014
                                          Last Updated: October 30, 2014

                                Team 42

File Name:      AccountsListPanel.java
Description:    This class will define what our Login Page will look like and 
                how it will behave. THIS CLASS IS JUST A PLACEHOLDER RIGHT
                NOW AND DOES NOT DO ANYTHING YET OTHER THAN DISPLAY A MESSAGE
                TELLING US WHICH PANEL IT IS SUPPOSED TO BE.
 ****************************************************************************/
import javax.swing.*;
import java.awt.*;

public class AccountsListPanel extends javax.swing.JPanel
{

    // VERY IMPORTANT !! YOU MUST MAKE SURE THAT YOU GIVE EACH NEW PANEL THAT 
    // YOU DECLARE A PRIVATE VARIABLE THAT WILL STORE THE MAIN PANEL FROM GUI 
    private JPanel MainPanel;
    
    public AccountsListPanel()
    {
        initComponents();
    }
    
    /* THIS CONSTRUCTOR IS EXTREMELY IMPORTANT. WRITE A CONSTRUCTOR LIKE THIS
    FOR ALL OTHER PANELS
    
    This constructor takes in MainPanel from GUI.java which gives us access to
    the main panel where all of our GUI elements will eventually be located. */
    public AccountsListPanel(JPanel MainPanel)
    {
        this.MainPanel = MainPanel;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jLabel1 = new javax.swing.JLabel();

        jLabel1.setText("This page will list the user's bank accounts");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(184, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(272, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

}

