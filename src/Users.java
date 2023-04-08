public class Users {
    private String username;
    private String password;
    private int UID;
    private String groups;



    public Users(String username, String password, int UID, String groups){
        this.username = username;
        this.password = password;
        this.UID = UID;
        this.groups = groups;
    }


    public String getUsername(){
        return username;
    }
    public void setUsername(String newusername){
        username = newusername;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String newpassword){
        password = newpassword;
    }
    public int getUID(){
        return UID;
    }
    public void setUID(int newUID){
        UID = newUID;
    }
    public String getgroups(){
        return groups;
    }
    public void addgroups(String newgroups){
        groups = groups + newgroups;
    }
    public void removegroups(String newgroups){
        groups = groups.replace(newgroups, "");
    }
    public void removeallgroups(){
        groups = "";
    }
    public String getAll(){
        String builder = username+","+password+","+UID+","+groups;
        return builder;
    }
}
