public class Users {
    private String username;
    private String password;
    private int UID;
    private String groups;


    /**
     * Creates a user object
     * @param username The username of the user
     * @param password The password of the user
     * @param UID The UID of the user
     * @param groups The groups the user belongs to
     */
    public Users(String username, String password, int UID, String groups){
        this.username = username;
        this.password = password;
        this.UID = UID;
        this.groups = groups;
    }

    /**
     * Returns username when called
     * @return Returns username String
     */
    public String getUsername(){
        return username;
    }

    /**
     * Returns password when called
     * @return Returns password string
     */
    public String getPassword(){
        return password;
    }

    /**
     * Returns UID when called.
     * @return Returns UID int
     */
    public int getUID(){
        return UID;
    }

    /**
     * Returns groups when called.
     * @return Returns Groups string
     */
    public String getgroups(){
        return groups;
    }

    /**
     * Gets every parameter of a given user.
     * @return String of all parameters of a user seperated by a comma.
     */
    public String getAll(){
        String builder = username+","+password+","+UID+","+groups;
        return builder;
    }
}
