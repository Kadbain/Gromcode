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
        String [] names = new String[]{};
        for (int i = 0; i < users.length; i++) {
            names[i] = users[i].getName();
        }
        return names;
    }
    public long [] getUserIds() {
        long [] ids = new long[]{};
        for (int i = 0; i < users.length; i++) {
            ids[i] = users[i].getId();
        }
        return ids;
    }
    public String getUserNameById(long id) {
        for (int i = 0; i < users.length; i++) {
            if (id == users[i].getId()) {
                return users[i].getName();
            }
        }
        return "don't finded user";
    }
}
