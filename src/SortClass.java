import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;

public class SortClass {
    public static void sortUsername(ArrayList<Users> users){
        ArrayList<String> names = new ArrayList<>();
        String Builder = "";
        for(int i = 0; i<users.size(); i++){
            names.add(users.get(i).getUsername());
        }
        Collections.sort(names);
        for(int i = 0; i<names.size(); i++){
            Builder = Builder + names.get(i);
            Builder = Builder + "\n";
        }
        JOptionPane.showInputDialog(Builder);

    }
    public static void sortUID(ArrayList<Users> users){
        ArrayList<String> names = new ArrayList<>();
        String Builder = "";
        for(int i = 0; i<users.size(); i++){
            names.add(users.get(i))
        }
    }
}
