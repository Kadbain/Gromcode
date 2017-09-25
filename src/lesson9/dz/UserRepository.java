package lesson9.dz;

/**
 * Created by Ps1X on 22.09.2017.
 */
public class UserRepository{
    private User[] users;
//this.users = new User[]{new User(user.getId(), user.getName(), user.getSessionId())};


    public UserRepository(User[] users) {
        this.users = users;

    }

    public User[] getUsers() {

        return users;
    }

    public String [] getUserNames() {
        String [] names = new String[getUsers().length];
        if (getUsers() != null ) {
            for (int i = 0; i < getUsers().length; i++) {
                names[i] = getUsers()[i].getName();
            }
        }
        return names;
    }
    public long [] getUserIds() {
        long [] ids = new long[getUsers().length];
        for (int i = 0; i < getUsers().length; i++) {
            ids[i] = getUsers()[i].getId();
        }
        return ids;
    }
    public String getUserNameById(long id) {
        for (int i = 0; i < getUsers().length; i++) {
            if (id == getUsers()[i].getId()) {
                return getUsers()[i].getName();
            }
        }
        return "don't finded user";
    }
}
