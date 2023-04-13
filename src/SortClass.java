import javax.swing.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class SortClass {
    public static void sortUsername(ArrayList<Users> users)throws IOException {
        File writes = new File("temp.txt");
        File input = new File("list.txt");
        File backup = new File("list.bak");
        BufferedWriter writer = new BufferedWriter(new FileWriter(writes));

        ArrayList<String> names = new ArrayList<>();
        String Builder = "";
        for(int i = 0; i<users.size(); i++){
            names.add(users.get(i).getAll());
        }
        Collections.sort(names);
        for(int i = 0; i<names.size(); i++){
            Builder = names.get(i);
            if(i+1 > names.size()){
                writer.write(Builder);
            } else {
                writer.write(Builder + "\n");
            }
        }
        writer.close();
        input.renameTo(backup);
        writes.renameTo(input);
        JOptionPane.showInputDialog(Builder);

    }
    public static void sortUID(ArrayList<Users> users){
        ArrayList<String> names = new ArrayList<>();
        String Builder = "";
        for(int i = 0; i<users.size(); i++) {
            names.add(users.get(i).getUID() +"," + users.get(i).getUsername());
        }
        Collections.sort(names);
        for(int i = 0; i <names.size(); i++){
            String[] split = names.get(i).split(",");
            Builder = Builder + "UID: " + split[0] +", " + "Username: " + split[1];
            Builder = Builder + "\n";
        }
        JOptionPane.showInputDialog(Builder);
    }

    public static void sortGroup(ArrayList<Users> users){
        ArrayList<Users> sorted = new ArrayList<>();
        while(sorted.size() < users.size()){
            for(int i =0; i < users.size(); i++){
                if(users.get(i).getgroups() == "Admin"){
                    users.get(i);
                }
            }
        }
    }


}
