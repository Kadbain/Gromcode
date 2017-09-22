package lesson9.dz;

/**
 * Created by Ps1X on 22.09.2017.
 */
public class UserRepository extends User{
    private User[] users;
//this.users = new User[]{new User(user.getId(), user.getName(), user.getSessionId())};

    public UserRepository(long id, String name, String sessionId, User[] users) {
        super(id, name, sessionId);
        this.users = users;
    }

    public UserRepository(long id, String name, String sessionId) {
        super(id, name, sessionId);
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
