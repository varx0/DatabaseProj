import javax.swing.*;
import java.io.*;
import java.util.ArrayList;

public class DisplayClass {
    /**
     * When the method is called, the given username will be edited to become second input.
     * @param users ArrayList of users to be defined when the method is called.
     */
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
            File backup = new File ("List.bak");

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
            inputFile.renameTo(backup);
            tempFile.renameTo(inputFile);
        }
        catch (Exception IOException){
            System.out.println("error");
        }

    }

    /**
     * When the method is called, the given username's password will be edited to become the second given input.
     * @param users ArrayList of users to be defined when the method is called
     */
    public static void editPass(ArrayList<Users> users){
        String builder = "";
        for(int i = 0; i < users.size(); i++) {
            builder = builder +"Username: " + users.get(i).getUsername() + " " + "Password: " + users.get(i).getPassword() + "\n";

        }

        String oldUser = JOptionPane.showInputDialog(builder +"\n\nEnter the username you wish to change the password of: ");
        String newuser = JOptionPane.showInputDialog("What do you wish to change it to?");
        try {
            File inputFile = new File("list.txt");
            File tempFile = new File("temp.txt");
            File backup = new File ("list.bak");

            tempFile.createNewFile();

            BufferedReader reads = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writes = new BufferedWriter(new FileWriter(tempFile));
            String currentLine;

            while ((currentLine = reads.readLine()) != null){
                String trimmed = currentLine.trim();
                String[] split = trimmed.split(",");

                if (split[0].contains(oldUser)){
                    writes.write(currentLine.replace(split[1], newuser) + "\n");
                }else {
                    writes.write(trimmed + "\n");
                }

            }
            writes.close();
            reads.close();
            inputFile.renameTo(backup);
            tempFile.renameTo(inputFile);
        }
        catch (Exception IOException){
            System.out.println("error");
        }

    }

    /**
     * When the method is called, the given Username's UID is edited to become the second given input.
     * @param users ArrayList of users to be defined when the method is called.
     */
    public static void editUID(ArrayList<Users> users){
        String builder = "";
        for(int i = 0; i < users.size(); i++) {
            builder = builder + "Username: " + users.get(i).getUID() + " " + "UID: " + users.get(i).getUID() + "\n";
        }

        String oldUser = JOptionPane.showInputDialog(builder +"\n\nEnter the username of the ID you wish to change: ");
        String newuser = JOptionPane.showInputDialog("What do you wish to change it to?");
        try {
            File inputFile = new File("list.txt");
            File tempFile = new File("temp.txt");
            File backup = new File ("list.bak");

            tempFile.createNewFile();

            BufferedReader reads = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writes = new BufferedWriter(new FileWriter(tempFile));
            String currentLine;

            while ((currentLine = reads.readLine()) != null){
                String trimmed = currentLine.trim();
                String[] split = trimmed.split(",");
                String trimmedtwice = trimmed.replace(split[2], newuser);
                if (split[0].equals(oldUser)){
                    writes.write(trimmedtwice+"\n");
                }else {
                    writes.write(trimmed + "\n");
                }

            }
            writes.close();
            reads.close();
            inputFile.renameTo(backup);
            tempFile.renameTo(inputFile);
        }
        catch (Exception IOException){
            System.out.println("Error");
        }

    }

    /**
     * When the method is called, the given username's groups are edited to become the second given input.
     * @param users Arraylist of users to be defined when the method is called.
     */
    public static void editGroups(ArrayList<Users> users){
        String builder = "";
        for(int i = 0; i < users.size(); i++) {
            builder = builder + "User: " + users.get(i).getUsername() +" "+ "group: " + users.get(i).getgroups() + "\n";
        }

        String oldUser = JOptionPane.showInputDialog(builder +"\n\nEnter the user whose group you wish to change: ");
        String newuser = JOptionPane.showInputDialog("What do you wish to change the group to?");
        try {
            File inputFile = new File("list.txt");
            File tempFile = new File("temp.txt");
            File backup = new File ("list.bak");
            tempFile.createNewFile();

            BufferedReader reads = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writes = new BufferedWriter(new FileWriter(tempFile));
            String currentLine;

            while ((currentLine = reads.readLine()) != null){
                String trimmed = currentLine.trim();
                String[] split = trimmed.split(",");
                String trimmedtwice = trimmed.replace(split[3], newuser);
                if (split[0].equals(oldUser)) {
                    writes.write(trimmedtwice+"\n");
                } else {
                    writes.write(trimmed + "\n");
                }

            }
            writes.close();
            reads.close();
            inputFile.renameTo(backup);
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

    /**
     * When the method is called, deletes the user entry of a given username completely.
     * @param users Arraylist of users to be defined when the method is called.
     */
    public static void Remove(ArrayList<Users> users){
        String builder = "";
        for(int i = 0; i < users.size(); i++){
            builder = builder + users.get(i).getUsername() + "\n";
        }
        String toRemove = JOptionPane.showInputDialog(builder + "\n" + "Enter the name of the user you wish to remove: ");
        try {
            File inputFile = new File("list.txt");
            File tempFile = new File("temp.txt");
            File backup = new File ("list.bak");
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

    /**
     * Displays the Username of the user, and their correlated UID.
     * @param users Arraylist of users to be defined when the method is called.
     */
    public static void UID(ArrayList<Users> users){
        String builder = "";
        for(int i = 0; i < users.size(); i++){
            builder = builder + "Name: " + users.get(i).getUsername() + " " + "UID: ";
            builder = builder +users.get(i).getUID();
            builder = builder + "\n";
        }
        JOptionPane.showInputDialog(null, builder);
    }

    /**
     * Displays the username and correlated groups of the user.
     * @param users Arraylist of users to be defined when the method is called.
     */
    public static void Groups(ArrayList<Users> users){
        String builder = "";
        for(int i = 0; i < users.size(); i++){
            builder = builder + "Name: " + users.get(i).getUsername() + " " + "Groups: ";
            builder = builder + users.get(i).getgroups();
            builder = builder + "\n";
        }
        JOptionPane.showInputDialog(null, builder);
    }

    /**
     * Displays the Username and correlated password of given user.
     * @param users Arraylist of users to be defined when the method is called.
     */
    public static void Passwords(ArrayList<Users> users){
        String builder = "";
        for(int i = 0; i < users.size(); i++){
            builder = builder + "Name: " + users.get(i).getUsername() + " " + "Password: ";
            builder = builder + users.get(i).getPassword();
            builder = builder + "\n";
        }
        JOptionPane.showInputDialog(null, builder);
    }

}
