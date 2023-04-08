import com.sun.tools.javac.Main;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;
import java.io.BufferedWriter;
import java.util.*;

public class main {
    static ArrayList<Users> users2 = new ArrayList<Users>();
    public static void readList() throws Exception {


        BufferedReader redder = new BufferedReader(new FileReader("list.txt"));


        while(true){
            String line = redder.readLine();
            if(line == null){
                break;
            }
            else{
                StringBuilder total = new StringBuilder();
                String split[] = line.split(",");
                String name = split[0];
                String password = split[1];
                int UID = Integer.parseInt(split[2]);
                String groups = split[3];
                Users temp = new Users(name, password, UID, groups);
                System.out.println(temp);
                users2.add(temp);
                /* total.append(name + ", " + password + ", " + UID + ", " + groups);
                total.toString();
                System.out.println(total); */
            }

        }
    }

    public static void ManipulateUser() throws Exception{
        String input = JOptionPane.showInputDialog("A. Add user "
        + "\nB. Remove user");
        if(input.equals("A")) {
            String user = JOptionPane.showInputDialog("Enter the user now: "
            + "\n (format: Username,Password,UID,Groups)");
            Writer output;
            output = new BufferedWriter(new FileWriter("list.txt", true));
            String split2[] = user.split(",");
            try {
                if (split2[3] != null) {
                    output.append("\n" + user);
                    output.close();
                }
            } catch (Exception ArrayIndexOutOfBoundsException) {
                JOptionPane.showInputDialog(null, "Please enter user with correct format.");
            }
        } else if (input.equals("B")) {
            DisplayClass.Remove(users2);

        } else if (input.equals("C")) {
            DisplayClass.Remove(users2);
        }
    }

    public static void  displayMenu(){
        String choice = JOptionPane.showInputDialog("A. Display Names\n"
        + "B. Display Passwords\n"
        + "C. Display UID\n"
        + "D. Display Groups\n");
        if(choice.equals("A")){
            DisplayClass.Names(users2);
        } else if (choice.equals("B") || choice.equals("b")) {
            DisplayClass.Passwords(users2);
        } else if (choice.equals("C") || choice.equals("c")) {
            DisplayClass.UID(users2);
        } else if (choice.equals("D") || choice.equals("d")) {
            DisplayClass.Groups(users2);
        }
    }

    public static void editMenu(){
        String choice = JOptionPane.showInputDialog("A. Change Username\n"
        + "B. Change Password\n"
        + "C. Change UID\n"
        + "D. Change Groups");
        if(choice.equals("a") || choice.equals("A")) {
            DisplayClass.editName(users2);
        } else if (choice.equals("b") || choice.equals("B")) {
            DisplayClass.editPass(users2);
        } else if (choice.equals("c") || choice.equals("C")) {
            DisplayClass.editUID(users2);
        } else if (choice.equals("d") || choice.equals("D")) {
            DisplayClass.editGroups(users2);
        }

    }

    public static void searchMenu(){
        String searches = ("Search menu\n"
        + "A. Search Name\n"
        + "B. Search groups\n"
        + "C. Search UID\n");
        String res = JOptionPane.showInputDialog(searches);
        if(res.equals("A") || res.equals("a")) {
            SearchClass.searchName(users2);
        } else if (res.equals("B") || res.equals("b")) {
            SearchClass.searchGroups(users2);
        } else if (res.equals("C") || res.equals"c") {
            SearchClass.searchUID(users2);
        }
    }
    public static void mainMenu() throws Exception {
        String MainMenu = ("Main menu\n" +
                "A. Manipulate Users \n"
                + "B. Display Menu \n"
                + "C. Edit Users \n"
                + "D. Exit Main Menu\n"
                + "E. Search Menu\n");
        String choice = JOptionPane.showInputDialog(MainMenu);
        if(choice.equals("A") || choice.equals("a")){
            System.out.println("Add user");
            ManipulateUser();
        }
        else if(choice.equals("B") || choice.equals("b")){
            System.out.println("Display Menu");
            displayMenu();
        } else if (choice.equals("C") || choice.equals("c")) {

            System.out.println("Edit Menu");
            editMenu();
        } else if (choice.equals("D") || choice.equals("d")) {
            System.out.println("Search");
            searchMenu();
        } else if (choice.equals("E") || choice.equals("e")) {
            System.out.println("Exit");
            System.exit(0);

        } else{
            System.out.println("fail");
            System.exit(0);
        }
    }
    public static void main(String[] args)throws Exception{
        readList();
        mainMenu();
    }
}