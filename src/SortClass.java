import javax.swing.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class SortClass {
    /**
     * Sorts the given users parameter alphabetically by username
     * @param users ArrayList of users defined when the method is called
     * @throws IOException In the event of an errow, throws this
     */
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


    }
    //This function is the single most insane and convoluted thing I've ever created.

    /**
     * Sorts given users parameter numerically by UID
     * @param users Arraylist of users defined when the method is called.
     * @throws IOException In the event of an error, throws this.
     */
    public static void sortUID(ArrayList<Users> users)throws IOException{
        File output = new File("temp.txt");
        File input = new File("list.txt");
        File backup = new File("list.bak");
        BufferedWriter writes = new BufferedWriter(new FileWriter(output));

        ArrayList<String> names = new ArrayList<>();
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
            if(i + 1 != names.size()){
                writes.write(split[1] +","+ split[0] +","+ split[2] +","+ split[3]+ "\n");
            }
            else{
                writes.write(split[1] +","+ split[0] +","+ split[2] +","+ split[3]);
            }
        }
        writes.close();
        input.renameTo(backup);
        output.renameTo(input);

    }

    /**
     * Sorts given users parameter by group, does this in a hierarchical manor defined as follows from most power to least: Admin, Mod, User.
     * @param users ArrayList of users defined when the method is called.
     * @throws IOException In the event of an error, throws this.
     */
    public static void sortGroup(ArrayList<Users> users)throws IOException{
        File output = new File("temp.txt");
        File input = new File("list.txt");
        File backup = new File("list.bak");
        BufferedWriter writes = new BufferedWriter(new FileWriter(output));
        ArrayList<String> sorted = new ArrayList<>();

        for(int i =0; i < users.size(); i++){
            if(users.get(i).getgroups().equals("admin") || users.get(i).getgroups().equals("Admin")){
                sorted.add(users.get(i).getAll());
            }
        }
        for(int i = 0; i <users.size(); i++){
            if(users.get(i).getgroups().equals("Mod") || users.get(i).getgroups().equals("mod")){
                sorted.add(users.get(i).getAll());
            }
        }
        for(int i = 0; i<users.size(); i++){
            if(users.get(i).getgroups().equals("User") || users.get(i).getgroups().equals("user")){
                sorted.add(users.get(i).getAll());
            }
        }

        for(int i = 0; i < sorted.size(); i++) {
            if (i + 1 != users.size()) {
                writes.write(sorted.get(i) + "\n");
            } else {
                writes.write(sorted.get(i));
            }
        }
        writes.close();
        input.renameTo(backup);
        output.renameTo(input);
    }


}
