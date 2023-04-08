import javax.swing.*;
import java.io.*;
import java.util.ArrayList;

public class DisplayClass {
    String total = "";
    public static void editName(ArrayList<Users> users){
        String builder = "";
        for(int i = 0; i < users.size(); i++) {
            builder = builder + users.get(i).getUsername() + "\n";
        }

        String oldUser = JOptionPane.showInputDialog(builder +"\n\nEnter the username you wish to change: ");
        String newuser = JOptionPane.showInputDialog("What do you wish to change it to?");
        try {
            File inputFile = new File("list.txt");
            File tempFile = new File("temp.txt");
            tempFile.createNewFile();

            BufferedReader reads = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writes = new BufferedWriter(new FileWriter(tempFile));
            String currentLine;

            while ((currentLine = reads.readLine()) != null){
                String trimmed = currentLine.trim();
                String[] split = trimmed.split(",");
                String trimmedtwice = trimmed.replace(oldUser, newuser);
                if (split[0].equals(oldUser)){
                    writes.write(trimmedtwice+"\n");
                }else {
                    writes.write(trimmed + "\n");
                }

            }
            writes.close();
            reads.close();
            tempFile.renameTo(inputFile);
        }
        catch (Exception IOException){
            System.out.println("error");
        }

    }
    public static void editPass(ArrayList<Users> users){
        String builder = "";
        for(int i = 0; i < users.size(); i++) {
            builder = builder + users.get(i).getPassword() + "\n";
        }

        String oldUser = JOptionPane.showInputDialog(builder +"\n\nEnter the username you wish to change: ");
        String newuser = JOptionPane.showInputDialog("What do you wish to change it to?");
        try {
            File inputFile = new File("list.txt");
            File tempFile = new File("temp.txt");
            tempFile.createNewFile();

            BufferedReader reads = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writes = new BufferedWriter(new FileWriter(tempFile));
            String currentLine;

            while ((currentLine = reads.readLine()) != null){
                String trimmed = currentLine.trim();
                String[] split = trimmed.split(",");
                String trimmedtwice = trimmed.replace(oldUser, newuser);
                if (split[1].equals(oldUser)){
                    writes.write(trimmedtwice+"\n");
                }else {
                    writes.write(trimmed + "\n");
                }

            }
            writes.close();
            reads.close();
            tempFile.renameTo(inputFile);
        }
        catch (Exception IOException){
            System.out.println("error");
        }

    }
    public static void editUID(ArrayList<Users> users){
        String builder = "";
        for(int i = 0; i < users.size(); i++) {
            builder = builder + users.get(i).getUID() + "\n";
        }

        String oldUser = JOptionPane.showInputDialog(builder +"\n\nEnter the username you wish to change: ");
        String newuser = JOptionPane.showInputDialog("What do you wish to change it to?");
        try {
            File inputFile = new File("list.txt");
            File tempFile = new File("temp.txt");
            tempFile.createNewFile();

            BufferedReader reads = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writes = new BufferedWriter(new FileWriter(tempFile));
            String currentLine;

            while ((currentLine = reads.readLine()) != null){
                String trimmed = currentLine.trim();
                String[] split = trimmed.split(",");
                String trimmedtwice = trimmed.replace(oldUser, newuser);
                if (split[2].equals(oldUser)){
                    writes.write(trimmedtwice+"\n");
                }else {
                    writes.write(trimmed + "\n");
                }

            }
            writes.close();
            reads.close();
            tempFile.renameTo(inputFile);
        }
        catch (Exception IOException){
            System.out.println("Error");
        }

    }
    public static void editGroups(ArrayList<Users> users){
        String builder = "";
        for(int i = 0; i < users.size(); i++) {
            builder = builder + users.get(i).getgroups() + "\n";
        }

        String oldUser = JOptionPane.showInputDialog(builder +"\n\nEnter the username you wish to change: ");
        String newuser = JOptionPane.showInputDialog("What do you wish to change it to?");
        try {
            File inputFile = new File("list.txt");
            File tempFile = new File("temp.txt");
            tempFile.createNewFile();

            BufferedReader reads = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writes = new BufferedWriter(new FileWriter(tempFile));
            String currentLine;

            while ((currentLine = reads.readLine()) != null){
                String trimmed = currentLine.trim();
                String[] split = trimmed.split(",");
                String trimmedtwice = trimmed.replace(oldUser, newuser);
                if (split[3].equals(oldUser)) {
                    writes.write(trimmedtwice+"\n");
                } else {
                    writes.write(trimmed + "\n");
                }

            }
            writes.close();
            reads.close();
            tempFile.renameTo(inputFile);
        }
        catch (Exception IOException){
            System.out.println("Error");
        }

    }
    public static void Names(ArrayList<Users> users){
        String builder = "";
        for(int i = 0; i < users.size(); i++) {
            builder = builder + users.get(i).getUsername() + "\n";
        }
        JOptionPane.showInputDialog(builder);

    }
    public static void Remove(ArrayList<Users> users){
        String builder = "";
        for(int i = 0; i < users.size(); i++){
            builder = builder + users.get(i).getUsername() + "\n";
        }
        String toRemove = JOptionPane.showInputDialog(builder + "\n" + "Enter the name of the user you wish to remove: ");
        try {
            File inputFile = new File("list.txt");
            File tempFile = new File("Temp.txt");
            File backup = new File ("List.bak");
            tempFile.createNewFile();

            BufferedReader reads = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writes = new BufferedWriter(new FileWriter(tempFile));

            String currentLine;
            while ((currentLine = reads.readLine()) != null) {
                String trimmed = currentLine.trim();
                String[] test = trimmed.split(",");

                if(test[0].equals(toRemove)) continue;
                writes.write(currentLine + "\n");
            }
            writes.close();
            reads.close();
            inputFile.renameTo(backup);
            tempFile.renameTo(inputFile);


        }catch (Exception IOException){
            System.out.println("error");
        }

    }


    public static void UID(ArrayList<Users> users){
        String builder = "";
        for(int i = 0; i < users.size(); i++){
            builder = builder + "Name: " + users.get(i).getUsername() + " " + "UID: ";
            builder = builder +users.get(i).getUID();
            builder = builder + "\n";
        }
        JOptionPane.showInputDialog(null, builder);
    }
    public static void Groups(ArrayList<Users> users){
        String builder = "";
        for(int i = 0; i < users.size(); i++){
            builder = builder + "Name: " + users.get(i).getUsername() + " " + "Groups: ";
            builder = builder + users.get(i).getgroups();
            builder = builder + "\n";
        }
        JOptionPane.showInputDialog(null, builder);
    }
    public static void Passwords(ArrayList<Users> users){
        String builder = "";
        for(int i = 0; i < users.size(); i++){
            builder = builder + "Name: " + users.get(i).getUsername() + " " + "Password: ";
            builder = builder + users.get(i).getPassword();
            builder = builder + "\n";
        }
        JOptionPane.showInputDialog(null, builder);
    }
    public static void all(ArrayList<Users> users){
        String builder = "";
        for(int i = 0; i < users.size(); i++){
            builder = builder +users.get(i).getUsername() + ",";
            builder = builder + users.get(i).getPassword() + ",";
            builder = builder + users.get(i).getUID() + ",";
            builder = builder + users.get(i).getgroups() + "\n";
        }
        JOptionPane.showInputDialog(builder);
    }
}
