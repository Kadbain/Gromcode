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
        if (getUsers() != null) {
                for (User user : getUsers()) {
                    if (user != null) {
                        if (user.getName().equals(name)) {
                            return user;
                        }
                    }
                }
            }
        return null;
    }
    private User findById(long id) {
        if (getUsers() != null) {
            for (User user : getUsers()) {
                if (user != null) {
                    if (user.getId() == id) {
                        return user;
                    }
                }
            }
        }
        return null;
    }

    public User getUserBySessionId(String sessionId) {
        if (getUsers() != null) {
            for (User user : getUsers()) {
                if (user != null) {
                    if (user.getSessionId().equals(sessionId)) {
                        return user;
                    }
                }
            }
        }
        return null;
    }
    public User save(User user) {
        if (findById(user.getId()) == null) {
        for (int i = 0; i < getUsers().length; i++) {
                if (getUsers()[i] == null ) {
                    getUsers()[i] = user;
                    return getUsers()[i];
                }
            }
        }
        return null;
    }
    public User update(User user) {
        if (findById(user.getId()) != null) {
            for (int i = 0; i < getUsers().length; i++) {
                if (getUsers()[i].getId() == user.getId()) {
                    getUsers()[i] = user;
                    return getUsers()[i];
                }
            }
        }
        return null;
    }
    private int indexOfUser(long id){
        int index=0;
        for(int i=0; i<users.length;i++){
            if (users[i] == null || users[i].getId() !=id)
                index++;
            else break;
        }
        return index;
    }

    public void delete(long id) {
        if (findById(id) != null) {
            users[indexOfUser(id)] = null;
        }
    }

//    public void delete(long id) {
//        if (findById(id) != null) {
//            for (int i = 0; i < getUsers().length; i++) {
//                if (getUsers()[i].getId() == id) {
//                    break;
//                }
//                for (int j = i; j < getUsers().length - 1; j++) {
//                    getUsers()[j] = getUsers()[j + 1];
//                }
//            }
//        }
//    }
}
