/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

/**
 *
 * @author garba
 */
public class MenúPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenúPrincipal
     */
    public MenúPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu4 = new javax.swing.JMenu();
        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jDialog3 = new javax.swing.JDialog();
        jDialog4 = new javax.swing.JDialog();
        deskEscritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mArchivo = new javax.swing.JMenu();
        mSalir = new javax.swing.JMenuItem();
        mFormAlumnos = new javax.swing.JMenu();
        mAlumnos = new javax.swing.JMenuItem();
        mMaterias = new javax.swing.JMenu();
        mFormMaterias = new javax.swing.JMenuItem();
        mCursadas = new javax.swing.JMenu();
        mFormCursada = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();

        jMenu4.setText("jMenu4");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog3Layout = new javax.swing.GroupLayout(jDialog3.getContentPane());
        jDialog3.getContentPane().setLayout(jDialog3Layout);
        jDialog3Layout.setHorizontalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog3Layout.setVerticalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog4Layout = new javax.swing.GroupLayout(jDialog4.getContentPane());
        jDialog4.getContentPane().setLayout(jDialog4Layout);
        jDialog4Layout.setHorizontalGroup(
            jDialog4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog4Layout.setVerticalGroup(
            jDialog4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout deskEscritorioLayout = new javax.swing.GroupLayout(deskEscritorio);
        deskEscritorio.setLayout(deskEscritorioLayout);
        deskEscritorioLayout.setHorizontalGroup(
            deskEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 817, Short.MAX_VALUE)
        );
        deskEscritorioLayout.setVerticalGroup(
            deskEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 381, Short.MAX_VALUE)
        );

        mArchivo.setText("Archivo");

        mSalir.setText("Salir");
        mSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mSalirActionPerformed(evt);
            }
        });
        mArchivo.add(mSalir);

        jMenuBar1.add(mArchivo);

        mFormAlumnos.setText("Alumnos");

        mAlumnos.setText("Formulario de alumnos");
        mAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mAlumnosActionPerformed(evt);
            }
        });
        mFormAlumnos.add(mAlumnos);

        jMenuBar1.add(mFormAlumnos);

        mMaterias.setText("Materias");

        mFormMaterias.setText("Formulario de materias");
        mMaterias.add(mFormMaterias);

        jMenuBar1.add(mMaterias);

        mCursadas.setText("Cursadas");

        mFormCursada.setText("Formulario de cursadas");
        mCursadas.add(mFormCursada);

        jMenuBar1.add(mCursadas);

        jMenu6.setText("Listados");

        jMenuItem5.setText("jMenuItem5");
        jMenu6.add(jMenuItem5);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(deskEscritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(deskEscritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mSalirActionPerformed

    private void mAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mAlumnosActionPerformed
        deskEscritorio.removeAll();
        deskEscritorio.repaint();
        Alumnos alumnos= new Alumnos();
        alumnos.setVisible(true);
        deskEscritorio.add(alumnos);
        deskEscritorio.moveToFront(alumnos);
    }//GEN-LAST:event_mAlumnosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenúPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenúPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenúPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenúPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenúPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane deskEscritorio;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JDialog jDialog3;
    private javax.swing.JDialog jDialog4;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem mAlumnos;
    private javax.swing.JMenu mArchivo;
    private javax.swing.JMenu mCursadas;
    private javax.swing.JMenu mFormAlumnos;
    private javax.swing.JMenuItem mFormCursada;
    private javax.swing.JMenuItem mFormMaterias;
    private javax.swing.JMenu mMaterias;
    private javax.swing.JMenuItem mSalir;
    // End of variables declaration//GEN-END:variables
}
