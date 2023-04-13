import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;

public class SortClass {
    public static void sortUsername(ArrayList<Users> users){
        ArrayList<String> names = new ArrayList<>();
        String Builder = "";
        for(int i = 0; i<users.size(); i++){
            names.add(users.get(i).getAll());
        }
        Collections.sort(names);
        for(int i = 0; i<names.size(); i++){
            Builder = Builder + names.get(i);
            Builder = Builder + "\n";
            String[] split = Builder.split(",");
            String name = split[0];
            String password = split[1];
            int UID = Integer.parseInt(split[2]);
            String groups = split[3];
            Users temp = new Users(name, password, UID, groups);
            users.add(temp);
        }
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
