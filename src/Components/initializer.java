package Components;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import medical.and.hospital.system.AccountPanels.Doctors;
import medical.and.hospital.system.AccountPanels.Nurses;
import medical.and.hospital.system.AccountPanels.Patients;
import medical.and.hospital.system.AccountPanels.accountDisplayer;

public class initializer {

    public static void displayAccounts(JPanel contentPanel, ArrayList<String> DoctorNames, JScrollPane ScrollPane1, String accType, Patients ps) {
        ArrayList<Integer> id = getAllUserIds(accType);
        
        for (int i = 0; i < DoctorNames.size(); i++) {
            accountDisplayer ad = new accountDisplayer((i+1));
            ad.ps = ps;
            ad.setDetails((i+1), DoctorNames.get(i));
            ad.setVisible(true);
            contentPanel.add(ad, "growx");
        }
        
        ScrollPane1.setViewportView(contentPanel);
        ScrollPane1.repaint();
        ScrollPane1.revalidate();
    }
    
    public static void displayAccounts(JPanel contentPanel, ArrayList<String> DoctorNames, JScrollPane ScrollPane1, String accType, Nurses ps) {
        ArrayList<Integer> id = getAllUserIds(accType);
        
        for (int i = 0; i < DoctorNames.size(); i++) {
            accountDisplayer ad = new accountDisplayer((i+1));
            ad.ns = ps;
            ad.setDetails((i+1), DoctorNames.get(i));
            ad.setVisible(true);
            contentPanel.add(ad, "growx");
        }
        
        ScrollPane1.setViewportView(contentPanel);
        ScrollPane1.repaint();
        ScrollPane1.revalidate();
    }
    
    public static void displayAccounts(JPanel contentPanel, ArrayList<String> DoctorNames, JScrollPane ScrollPane1, String accType, Doctors ps) {
        ArrayList<Integer> id = getAllUserIds(accType);
        
        for (int i = 0; i < DoctorNames.size(); i++) {
            accountDisplayer ad = new accountDisplayer((i+1));
            ad.ds = ps;
            ad.setDetails((i+1), DoctorNames.get(i));
            ad.setVisible(true);
            contentPanel.add(ad, "growx");
        }
        
        ScrollPane1.setViewportView(contentPanel);
        ScrollPane1.repaint();
        ScrollPane1.revalidate();
    }
    
    
    
    public static ArrayList<Integer> getAllUserIds(String filePath) {
        ArrayList<Integer> ids = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = reader.readLine()) != null) {
                if (line.trim().startsWith("ID:")) {
                    try {
                        int id = Integer.parseInt(line.trim().substring(3).trim());
                        ids.add(id);
                    } catch (NumberFormatException e) {
                        System.err.println("Invalid ID format: " + line);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return ids;
    }
    
    public static ArrayList<Integer> getAllPatientIds(String filePath) {
        ArrayList<Integer> ids = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = reader.readLine()) != null) {
                if (line.trim().startsWith("ID:")) {
                    try {
                        int id = Integer.parseInt(line.trim().substring(3).trim());
                        ids.add(id);
                    } catch (NumberFormatException e) {
                        System.err.println("Invalid ID format: " + line);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return ids;
    }
    
}
