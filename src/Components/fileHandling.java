/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Components;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Carlo E. Aranez
 */
public class fileHandling {
    
    final public static String doctor = "DoctorAccounts.txt";
    final public static String nurse = "NursesAccounts.txt";
    final public static String patients = "PatientsAccounts.txt";
    
    final public static String accountREF = "accountREF.txt";
    final public static String accTypeREF = "accTypeREF.txt";
    
    final public static String selectedPatientID = "_selectedPatientID.txt";
    final public static String selectedPatientName = "_selectedPatientName.txt";
    final public static String selectedUserType = "_selectedUserType.txt";
    
    public static void resetSelectedUser() {
        fileHandling.saveToReference(fileHandling.selectedPatientID, "");
        fileHandling.saveToReference(fileHandling.selectedUserType, "");
        fileHandling.saveToReference(fileHandling.selectedPatientName, "");
    }
    
    public static void extractNamesAndPassInfo(String filePath, ArrayList<String> names, ArrayList<String> passwords) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            String currentName = null, currentPassword = null;

            while ((line = br.readLine()) != null) {
                line = line.trim();

                if (line.startsWith("Name:")) {
                    currentName = line.substring(5).trim();
                } else if (line.startsWith("Password:")) {
                    currentPassword = line.substring(9).trim();
                    
                    if (currentName != null && currentPassword != null) {
                        names.add(currentName);
                        passwords.add(currentPassword);
                        currentName = null;
                        currentPassword = null;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static ArrayList<String> getAccountDetailsByID(String filePath, String targetId) {
        ArrayList<String> accountBlock = new ArrayList<>();
        ArrayList<String> currentBlock = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            boolean matchFound = false;

            while ((line = reader.readLine()) != null) {
                currentBlock.add(line);

                if (line.trim().equals("}")) {
                    for (String blockLine : currentBlock) {
                        if (blockLine.trim().startsWith("ID:")) {
                            String id = blockLine.split(":", 2)[1].trim();
                            if (id.equals(targetId)) {
                                matchFound = true;
                                accountBlock.addAll(currentBlock);
                                break;
                            }
                        }
                    }
                    currentBlock.clear();
                    if (matchFound) break;
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        if (accountBlock.isEmpty()) {
            System.out.println("Such account ID does not exist: " + targetId);
        }

        return accountBlock;
    }

    public static void extractIdNamePasswords(String filePath, ArrayList<String> ids, ArrayList<String> names, ArrayList<String> passwords) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            String currentId = null, currentName = null, currentPassword = null;

            while ((line = br.readLine()) != null) {
                line = line.trim();

                if (line.startsWith("ID:")) {
                    currentId = line.substring(3).trim();
                } else if (line.startsWith("Name:")) {
                    currentName = line.substring(5).trim();
                } else if (line.startsWith("Password:")) {
                    currentPassword = line.substring(9).trim();

                    if (currentId != null && currentName != null && currentPassword != null) {
                        ids.add(currentId);
                        names.add(currentName);
                        passwords.add(currentPassword);
                        currentId = null;
                        currentName = null;
                        currentPassword = null;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void extractNamesOnly(String filePath, ArrayList<String> names) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = br.readLine()) != null) {
                line = line.trim();

                if (line.startsWith("Name:")) {
                    String name = line.substring(5).trim();
                    names.add(name);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void registerUser(String fileName, int ID, String Name, String Password) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.write("ID:" + ID + "\n");
            writer.write("Name:" + Name + "\n");
            writer.write("Password:" + Password + "\n");
            writer.write("}\n");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
    
    public static void registerPatient(String fileName, String id , String name, String password, String age, String gender, String contact) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            
            writer.write("ID:" + id + "\n");
            writer.write("Name:" + name + "\n");
            writer.write("Password:" + password + "\n");
            writer.write("Age:" + age + "\n");
            writer.write("Gender:" + gender + "\n");
            writer.write("ContactNumber:" + contact + "\n");
            writer.write("Prescription:\n");
            writer.write("MedHistory:\n");
            writer.write("Appointments:\n");
            writer.write("}\n");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
    
    public static void removePatient(String filePath, String targetId, String targetName) {
        ArrayList<String> updatedLines = new ArrayList<>();
        ArrayList<String> currentBlock = new ArrayList<>();
        boolean matchFound = false;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                currentBlock.add(line);

                if (line.trim().equals("}")) {
                    String id = "", name = "";
                    for (String blockLine : currentBlock) {
                        String trimmedLine = blockLine.trim();
                        if (trimmedLine.toLowerCase().startsWith("id:")) {
                            id = trimmedLine.substring(3).trim();
                        } else if (trimmedLine.toLowerCase().startsWith("name:")) {
                            name = trimmedLine.substring(5).trim();
                        }
                    }
                    if (id.equals(targetId) && name.equalsIgnoreCase(targetName)) {
                        matchFound = true;
                    } else {
                        updatedLines.addAll(currentBlock);
                    }
                    currentBlock.clear();
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }

        if (!matchFound) {
            System.out.println("Such ID does not exist in Patients: " + targetId + " and Name: " + targetName);
            return;
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (String line : updatedLines) {
                writer.write(line);
                writer.newLine();
            }
            System.out.println("Patient removed successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    public static void removeDoctorOrNurse(String filePath, String targetId, String targetName) {
        ArrayList<String> updatedLines = new ArrayList<>();
        ArrayList<String> currentBlock = new ArrayList<>();
        boolean matchFound = false;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                currentBlock.add(line);

                if (line.trim().equals("}")) {
                    String id = "", name = "";

                    for (String blockLine : currentBlock) {
                        String trimmedLine = blockLine.trim();
                        if (trimmedLine.toLowerCase().startsWith("id:")) {
                            id = trimmedLine.substring(3).trim();
                        } else if (trimmedLine.toLowerCase().startsWith("name:")) {
                            name = trimmedLine.substring(5).trim();
                        }
                    }

                    if (id.equals(targetId) && name.equalsIgnoreCase(targetName)) {
                        matchFound = true;
                    } else {
                        updatedLines.addAll(currentBlock);
                    }

                    currentBlock.clear();
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }

        if (!matchFound) {
            System.out.println("No matching account found for ID: " + targetId + " and Name: " + targetName);
            return;
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (String line : updatedLines) {
                writer.write(line);
                writer.newLine();
            }
            System.out.println("Account removed successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    public static String getReferencedFile(String referenceFilePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(referenceFilePath))) {
            String line = br.readLine();
            return line != null ? line.trim() : null;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    public static void updateAccountById(String filePath, String currentId, String newId, String newName, String newPassword) {
        ArrayList<String> lines = new ArrayList<>();
        boolean updated = false;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            ArrayList<String> currentBlock = new ArrayList<>();

            while ((line = reader.readLine()) != null) {
                currentBlock.add(line);

                if (line.trim().equals("}")) {
                    boolean idMatch = false;
                    
                    for (String blockLine : currentBlock) {
                        if (blockLine.trim().toLowerCase().startsWith("id:")) {
                            String id = blockLine.substring(blockLine.indexOf(":") + 1).trim();
                            if (id.equals(currentId)) {
                                idMatch = true;
                                break;
                            }
                        }
                    }

                    if (idMatch) {
                        ArrayList<String> updatedBlock = new ArrayList<>();

                        for (String blockLine : currentBlock) {
                            String trimmed = blockLine.trim().toLowerCase();

                            if (trimmed.startsWith("id:")) {
                                updatedBlock.add("ID:" + newId);
                            } else if (trimmed.startsWith("name:")) {
                                updatedBlock.add("Name:" + newName);
                            } else if (trimmed.startsWith("password:")) {
                                updatedBlock.add("Password:" + newPassword);
                            } else {
                                updatedBlock.add(blockLine);
                            }
                        }

                        lines.addAll(updatedBlock);
                        updated = true;
                    } else {
                        lines.addAll(currentBlock);
                    }

                    currentBlock.clear();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        if (!updated) {
            System.out.println("No account ID matches: " + currentId + " in " + filePath);
            return;
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (String l : lines) {
                writer.write(l);
                writer.newLine();
            }
            System.out.println("Doctor account updated successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void updatePatientAccountById(
        String filePath,
        String currentId,
        String newId,
        String newName,
        String newPassword,
        String newAge,
        String newGender,
        String newContactNumber
    ) {
        ArrayList<String> lines = new ArrayList<>();
        boolean updated = false;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            ArrayList<String> currentBlock = new ArrayList<>();

            while ((line = reader.readLine()) != null) {
                currentBlock.add(line);

                if (line.trim().equals("}")) {
                    boolean idMatch = false;

                    for (String blockLine : currentBlock) {
                        if (blockLine.trim().toLowerCase().startsWith("id:")) {
                            String id = blockLine.substring(blockLine.indexOf(":") + 1).trim();
                            if (id.equals(currentId)) {
                                idMatch = true;
                                break;
                            }
                        }
                    }

                    if (idMatch) {
                        ArrayList<String> updatedBlock = new ArrayList<>();

                        for (String blockLine : currentBlock) {
                            String trimmed = blockLine.trim().toLowerCase();

                            if (trimmed.startsWith("id:")) {
                                updatedBlock.add("ID:" + newId);
                            } else if (trimmed.startsWith("name:")) {
                                updatedBlock.add("Name:" + newName);
                            } else if (trimmed.startsWith("password:")) {
                                updatedBlock.add("Password:" + newPassword);
                            } else if (trimmed.startsWith("age:")) {
                                updatedBlock.add("Age:" + newAge);
                            } else if (trimmed.startsWith("gender:")) {
                                updatedBlock.add("Gender:" + newGender);
                            } else if (trimmed.startsWith("contactnumber:")) {
                                updatedBlock.add("ContactNumber:" + newContactNumber);
                            } else {
                                updatedBlock.add(blockLine);
                            }
                        }

                        lines.addAll(updatedBlock);
                        updated = true;
                    } else {
                        lines.addAll(currentBlock);
                    }

                    currentBlock.clear();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        if (!updated) {
            System.out.println("No patient ID with ID : " + currentId + " in " + filePath);
            return;
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (String l : lines) {
                writer.write(l);
                writer.newLine();
            }
            System.out.println("Patient account updated successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<String> locateIdPos(String filePath) {
        ArrayList<String> idPosLoc = new ArrayList<>();
        
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            
            int i = 0;
            while ((line = reader.readLine()) != null) {
                i++;
                if (line.startsWith("ID:")) {
                    idPosLoc.add(String.valueOf(i));
                    System.out.println("I = "+i);
                }
            }}
        
        catch (IOException e) {
            e.printStackTrace();
        }
        return idPosLoc;
    }
    
    public static void ResetAccountIDs(String filePath) {
        ArrayList<String> updatedLines = new ArrayList<>();
        int newId = 1;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            boolean insideRecord = false;

            while ((line = reader.readLine()) != null) {
                if (line.startsWith("ID:")) {
                    insideRecord = true;
                    updatedLines.add("ID:" + newId++);
                } else if (line.equals("}")) {
                    insideRecord = false;
                    updatedLines.add("}");
                } else if (insideRecord) {
                    updatedLines.add(line);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (String updatedLine : updatedLines) {
                writer.write(updatedLine);
                writer.newLine();
            }
            System.out.println("IDs reset successfully!");
        } catch (IOException e) {
            System.out.println("Error writing to the file: " + e.getMessage());
        }
    }
    
    public static void appendToFieldInTextFile(String filePath, int id, String field, String... newValues) {
        try {
            File file = new File(filePath);
            ArrayList<String> lines = new ArrayList<>();
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            boolean isTarget = false;

            while ((line = reader.readLine()) != null) {
                if (line.startsWith("ID:" + id)) {
                    isTarget = true;
                }

                if (isTarget && line.startsWith(field)) {
                    StringBuilder updatedLine = new StringBuilder(line);
                    for (String val : newValues) {
                        updatedLine.append(val).append("|");
                    }
                    lines.add(updatedLine.toString());
                    isTarget = false;
                } else {
                    lines.add(line);
                    if (line.startsWith("}")) {
                        isTarget = false;
                    }
                }
            }
            reader.close();

            BufferedWriter writer = new BufferedWriter(new FileWriter(file, false));
            for (String updatedLine : lines) {
                writer.write(updatedLine);
                writer.newLine();
            }
            writer.close();
            System.out.println("Update successful!");
        } catch (IOException e) {
            System.out.println("An error occurred while updating the file: " + e.getMessage());
        }
    }
    
    public static void replaceMedHistory(String filePath, int id, String field, String newMedHistory) {
        try {
            File file = new File(filePath);
            ArrayList<String> lines = new ArrayList<>();
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            boolean isTarget = false;

            while ((line = reader.readLine()) != null) {
                if (line.trim().equals("ID:" + id)) {
                    isTarget = true;
                    lines.add(line);
                    continue;
                }
                
                if (isTarget && line.trim().startsWith(field)) {
                    lines.add(field + newMedHistory + (newMedHistory.endsWith("|") ? "" : "|"));
                    isTarget = false;
                } else {
                    lines.add(line);
                    if (line.trim().equals("}")) {
                        isTarget = false;
                    }
                }
            }
            reader.close();

            BufferedWriter writer = new BufferedWriter(new FileWriter(file, false));
            for (String updatedLine : lines) {
                writer.write(updatedLine);
                writer.newLine();
            }
            writer.close();
            System.out.println("MedHistory replaced successfully!");
        } catch (IOException e) {
            System.out.println("Error while replacing MedHistory: " + e.getMessage());
        }
    }


    public static void saveToReference(String file, String accountType) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(accountType);

            System.out.println(accountType + " has been saved to " + file);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
