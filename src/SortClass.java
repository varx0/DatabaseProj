import javax.swing.*;
import java.io.*;
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
    public static void sortUID(ArrayList<Users> users)throws IOException{
        File input = new File("list.txt");
        File output = new File("temp.txt");
        File backup = new File("list.bak");
        BufferedWriter writes = new BufferedWriter(new FileWriter(output));
        String currentLine;

        int[] result = new int[users.size()];

        int temp;
        int iterate;
        for(int i = 0; i<users.size(); i++){
            result[i] = users.get(i).getUID();
        }

        for(int i = 0; i < result.length; i++){
            for(int y = 0; y < result.length-1; y++){
                if(result[y+1] < result[y]){
                    temp = result[y+1];
                    result[y+1] = result[y];
                    result[y] = temp;
                }
            }
        }

        for(int i = 0; i < result.length; i++){
            BufferedReader reads2 = new BufferedReader(new FileReader(input));
            currentLine = reads2.readLine();
            String trimmed = currentLine.trim();
            String[] split = trimmed.split(",");
            if(result[i] == Integer.valueOf(split[3])){
                writes.write(currentLine);
            }

        }

    }

    public static void sortGroup(ArrayList<Users> users){
        ArrayList<Users> sorted = new ArrayList<>();
        while(sorted.size() < users.size()){
            for(int i =0; i < users.size(); i++){
                for(int y = i+1; i < users.size(); y++){
                    if(users.get(i).getUID() > users.get(i).getUID()){

                    }
                }
            }
        }
    }


}
