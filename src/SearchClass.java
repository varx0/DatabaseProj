import javax.swing.*;
import java.util.ArrayList;


public class SearchClass {
    /**
     * Searches the database for a matching username, and displays all data related to that user.
     * @param users Arraylist of users to be defined when the method is called.
     */
    public static void searchName(ArrayList<Users> users) {
        String searched = JOptionPane.showInputDialog("Enter Query: ");
        String builder = "";
        int total = 0;
        for(int i = 0; i < users.size(); i++){
            String current = users.get(i).getUsername();

            if(current.equals(searched)){
                builder = ("\nUsername: " + current + "\nPassword: " + users.get(i).getPassword() + "\nUID: " +users.get(i).getUID() + "\nGroup(S): " + users.get(i).getgroups());
                JOptionPane.showInputDialog(builder);
                break;
            } else {
                total++;
            }
        }
        if(total == users.size()){
            JOptionPane.showInputDialog("There is no user with that name.");
        }
    }

    /**
     * Creates and returns a list of usernames that are apart of the given group.
     * @param users Arraylist of users to be defined when the method is called.
     * @return Returns a list of usernames with the given group.
     */
    public static ArrayList<String> searchGroups(ArrayList<Users> users){
        String searched = JOptionPane.showInputDialog("Enter Query: ");
        searched = searched.toLowerCase();
        String current = "";
        String builder = "";
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < users.size(); i++ ){
            current = users.get(i).getAll();
            String[] split = current.trim().split(",");

            if(split[3].equals(searched)){
                builder = current.replace(users.get(i).getPassword(), "");
                builder = builder.replace(String.valueOf(users.get(i).getUID()), "");
                builder = builder.replace(users.get(i).getgroups(), "");
                builder = builder.replace(",", " ");
                list.add(builder);
            }
        }
        return list;
    }

    /**
     * Returns all information relevant to a user with the searched UID.
     * @param users Arraylist of users to be defined when the method is called.
     */
    public static void searchUID(ArrayList<Users> users){
        String searched = JOptionPane.showInputDialog("Enter Query: ");

        for(int i = 0; i < users.size(); i++){
            String current = users.get(i).getUsername();
            String UID = String.valueOf(users.get(i).getUID());
            if(UID.equals(String.valueOf(searched))){
                JOptionPane.showInputDialog("User with this UID(They should never occur twice): "+current);
                System.exit(0);
            }else{
                JOptionPane.showInputDialog("There are no users with that UID.");
                System.exit(0);
            }
        }

    }
}
