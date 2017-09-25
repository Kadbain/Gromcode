package lesson9.dz;

/**
 * Created by Ps1X on 22.09.2017.
 */
public class UserRepository {
    private User[] users;

    public UserRepository(User[] users) {
        this.users = users;

    }

    public User[] getUsers() {

        return users;
    }

    public String[] getUserNames() {
        String[] names = new String[getUsers().length];
        for (int i = 0; i < getUsers().length; i++) {
            if (getUsers()[i] != null) {
                names[i] = getUsers()[i].getName();
            }
        }
        return names;
    }

    public long[] getUserIds() {
        if (getUsers() != null) {
            int a = 0;
            for (User user : getUsers()) {
                if (user != null) a++;
            }
            long[] ids = new long[a];
            int i = 0;
            for (User user : getUsers()) {
                if (user != null) {
                    ids[i] = user.getId();
                    i++;
                }
            }
            return ids;
        }
        return null;
    }

    public String getUserNameById(long id) {
        String name = null;
        if (getUsers() != null) {
            for (int i = 0; i < getUsers().length; i++) {
                if (getUsers()[i] != null && getUsers()[i].getId() == id) {
                    name = getUsers()[i].getName();
                }
            }
        }
        return name;
    }

    public User getUserByName(String name) {
        if (name != null) {
        if (getUsers() != null) {
                for (User user : getUsers()) {
                    if (user != null) {
                        if (user.equals(name)) {
                            return user;
                        }
                    }
                }
            }
        }
        return null;
    }

    //        if (name != null) {
//            int count = 0;
//            for (int i = 0; i < getUsers().length; i++) {
//                if (getUsers()[i] != null) {
//                    if (getUsers()[i].getName().equals(name)) {
//                        count++;
//                        if (count == 1) {
//                            return getUsers()[i];
//                        }
//                    }
//                }
//            }
//        }
//        return null;
//    }
    public User getUserById(long id) {
        if (getUsers() != null) {
            int result = 0;
            for (User user : getUsers()) {
                if (user != null) {
                    result++;
                }
            }
            long[] ids = new long[result];
            int count = 0;

        }
        return null;
    }

    public User getUserBySessionId(String sessionId) {
        return null;
    }
}
