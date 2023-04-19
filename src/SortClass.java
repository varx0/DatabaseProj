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
    //This function is the single most insane and convoluted thing I've ever created.
    public static void sortUID(ArrayList<Users> users)throws IOException{
        File output = new File("temp.txt");
        File input = new File("list.txt");
        File backup = new File("list.bak");
        BufferedWriter writes = new BufferedWriter(new FileWriter(output));

        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> names2 = new ArrayList<>();
        String Builder;
        String Builder2;

        String temp;
        for(int i = 0; i < users.size(); i++){
            Builder = users.get(i).getUID() +","+ users.get(i).getUsername() +","+ users.get(i).getPassword() +","+ users.get(i).getgroups();
            names.add(Builder);
        }
        Collections.sort(names);
        for(int i = 0; i < names.size(); i++ ){
            Builder2 = names.get(i).trim();
            String[] split = Builder2.split(",");
            temp = split[0];
            split[0] = split[2];
            split[2] = temp;
            writes.write(split[1] +","+ split[0] +","+ split[2] +","+ split[3]+","+ "\n");
        }
        writes.close();
        input.renameTo(backup);
        output.renameTo(input);

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
