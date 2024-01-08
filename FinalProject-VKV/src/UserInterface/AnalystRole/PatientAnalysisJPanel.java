/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.AnalystRole;
//import org.jfree.data.category;

import userinterface.HealthRole.*;
import org.jfree.data.category.DefaultCategoryDataset;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Medicine.Medicine;
import Business.Network.Network;
import Business.Organization.AnalyticsOrganization;
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import Business.Organization.PharmacyOrganization;
//import Business.Organization.FarmerOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.HealthDoctorWorkRequest;
import Business.WorkQueue.HealthPharmacyWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.StandardBarPainter;

/**
 *
 * @author kashyap
 */
public class PatientAnalysisJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private AnalyticsOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private Network network;
    EcoSystem business;

    /**
     * Creates new form Prediction
     */
    public PatientAnalysisJPanel(JPanel userProcessContainer, UserAccount account,
            AnalyticsOrganization organization, Enterprise enterprise, EcoSystem business, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.business = business;
        this.userAccount = account;
        this.network = network;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAgeWise = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        OverallJPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        AreawiseJPanel = new javax.swing.JPanel();
        btnAreaWiseReport = new javax.swing.JButton();

        setBackground(new java.awt.Color(180, 195, 195));

        btnAgeWise.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N
        btnAgeWise.setText("SHOW REPORT");
        btnAgeWise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgeWiseActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("PATIENT ANALYSIS");

        OverallJPanel.setBackground(new java.awt.Color(102, 102, 102));
        OverallJPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Show Report", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        OverallJPanel.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        OverallJPanel.setLayout(new javax.swing.BoxLayout(OverallJPanel, javax.swing.BoxLayout.LINE_AXIS));

        jLabel2.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 22)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Agewise Patient Distribution");

        btnBack.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 22)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Doctor to Patient Distribution");

        AreawiseJPanel.setBackground(new java.awt.Color(102, 102, 102));
        AreawiseJPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Show Report", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        AreawiseJPanel.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        AreawiseJPanel.setLayout(new javax.swing.BoxLayout(AreawiseJPanel, javax.swing.BoxLayout.LINE_AXIS));

        btnAreaWiseReport.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N
        btnAreaWiseReport.setText("SHOW REPORT");
        btnAreaWiseReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAreaWiseReportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAreaWiseReport)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AreawiseJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(OverallJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnAgeWise))))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AreawiseJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(OverallJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgeWise, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAreaWiseReport, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(80, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgeWiseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgeWiseActionPerformed
        // TODO add your handling code here:

        ArrayList<WorkRequest> requestList = new ArrayList<WorkRequest>();
        Organization org = null;
       
        for(Enterprise e: network.getEnterpriseDirectory().getEnterpriseList())
        {
            if(e.getEnterpriseType().equals(e.getEnterpriseType().Hospital))
            {
                for (Organization organization : e.getOrganizationDirectory().getOrganizationList())
                {
                    if(organization instanceof DoctorOrganization){
                        for(WorkRequest request: organization.getWorkQueue().getWorkRequestList())
                            requestList.add(request);
                    }
                }
            }
        }

        
         Map<String, Integer> map = new HashMap<String, Integer>();
        DefaultCategoryDataset dcd = new DefaultCategoryDataset();
        for(WorkRequest request:requestList){
            HealthDoctorWorkRequest r = (HealthDoctorWorkRequest) request;
            if(map.containsKey(r.getPatientType())){
                int oldCount = map.get(r.getPatientType());
                int newCount = oldCount+r.getTotalPatients();
                map.put(r.getPatientType(), newCount);
            }
            else{
                map.put(r.getPatientType(), r.getTotalPatients());
            }
        }
        
        for(Map.Entry<String, Integer> entry:map.entrySet()){
            dcd.setValue(entry.getValue(), "Number", entry.getKey());
        }

        JFreeChart jchart = ChartFactory.createBarChart("Agewise Patient Distribution", "Age Group", "Number",dcd, PlotOrientation.VERTICAL, true, true, false);
        CategoryPlot cplot = jchart.getCategoryPlot();
        cplot.setRangeGridlinePaint(Color.black);
//        ((BarRenderer) cplot.getRenderer()).setBarPainter(new StandardBarPainter());
        BarRenderer r = (BarRenderer) jchart.getCategoryPlot().getRenderer();
        r.setSeriesPaint(0, Color.orange);

        ChartPanel chartPanel = new ChartPanel(jchart);

        OverallJPanel.removeAll();
        OverallJPanel.add(chartPanel);
        OverallJPanel.updateUI();
    }//GEN-LAST:event_btnAgeWiseActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAreaWiseReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAreaWiseReportActionPerformed
        // TODO add your handling code here:
        // DefaultCategoryDataSet dcd=new DefaultCategoryDataSet();

        ArrayList<WorkRequest> requestList = new ArrayList<WorkRequest>();

        for(Enterprise e: network.getEnterpriseDirectory().getEnterpriseList())
        {
            if(e.getEnterpriseType().equals(e.getEnterpriseType().Hospital))
            {
                for (Organization organization : e.getOrganizationDirectory().getOrganizationList())
                {
                    if(organization instanceof DoctorOrganization){
                        for(WorkRequest request: organization.getWorkQueue().getWorkRequestList())
                        requestList.add(request);
                    }
                }
            }
        }
        Map<String, Integer> map = new HashMap<String, Integer>();
        DefaultCategoryDataset dcd = new DefaultCategoryDataset();
        for(WorkRequest request:requestList){
            HealthDoctorWorkRequest r = (HealthDoctorWorkRequest) request;
            if(map.containsKey(r.getDoctorType())){
                int oldCount = map.get(r.getDoctorType());
                int newCount = oldCount+r.getTotalPatients();
                map.put(r.getDoctorType(), newCount);
            }
            else{
                map.put(r.getDoctorType(), r.getTotalPatients());
            }
        }
        
        for(Map.Entry<String, Integer> entry:map.entrySet()){
            dcd.setValue(entry.getValue(), "Number", entry.getKey());
        }

        JFreeChart jchart = ChartFactory.createBarChart("Doctor-Patient Distribution", "Doctor Type", "Number",dcd, PlotOrientation.VERTICAL, true, true, false);
        CategoryPlot cplot = jchart.getCategoryPlot();
        cplot.setRangeGridlinePaint(Color.black);
//        ((BarRenderer) cplot.getRenderer()).setBarPainter(new StandardBarPainter());
        BarRenderer r = (BarRenderer) jchart.getCategoryPlot().getRenderer();
        r.setSeriesPaint(0, Color.orange);

        ChartPanel chartPanel = new ChartPanel(jchart);

        AreawiseJPanel.removeAll();
        AreawiseJPanel.add(chartPanel);
        AreawiseJPanel.updateUI();
    }//GEN-LAST:event_btnAreaWiseReportActionPerformed

//    private ArrayList<String> findAllUniqueAreas(ArrayList<WorkRequest> requestList){
//        ArrayList<String> areas = new ArrayList<String>();
//        for(WorkRequest request: requestList){
//            HealthPharmacyWorkRequest r = (HealthPharmacyWorkRequest) request;
//            if(!(areas.contains(r.getArea())))
//                areas.add(r.getArea());
//        }
//        return areas;
//    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AreawiseJPanel;
    private javax.swing.JPanel OverallJPanel;
    private javax.swing.JButton btnAgeWise;
    private javax.swing.JButton btnAreaWiseReport;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}