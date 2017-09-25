package lesson9.dz;

/**
 * Created by Ps1X on 22.09.2017.
 */
public class UserRepository{
    private User[] users;

    public UserRepository(User[] users) {
        this.users = users;

    }

    public User[] getUsers() {

        return users;
    }

    public String [] getUserNames() {
        String [] names = new String[getUsers().length];
            for (int i = 0; i < getUsers().length; i++) {
                if (getUsers()[i] != null ) {
                names[i] = getUsers()[i].getName();
            }
        }
        return names;
    }
    public long [] getUserIds() {
        long [] ids = new long[getUsers().length];
        if (getUsers() != null) {
        for (int i = 0; i < getUsers().length; i++) {
            if (getUsers()[i] != null)
                ids[i] = getUsers()[i].getId();
            }
        }
        return ids;
    }
    public String getUserNameById(long id) {
        String name = null;
        if (getUsers() != null){
            for (int i=0; i<getUsers().length;i++){
                if (getUsers()[i] != null && getUsers()[i].getId() == id){
                    name = getUsers()[i].getName();
                }
            }
        }
        return name;
    }
}
