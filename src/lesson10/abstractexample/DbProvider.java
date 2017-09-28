package lesson10.abstractexample;

/**
 * Created by Ps1X on 28.09.2017.
 */
public abstract class DbProvider {
    private String dbHost;

//    public DbProvider(String dbHost) {
//        this.dbHost = dbHost;
//    }

    abstract void connectToDb();
    abstract void disconnectFromDb();
    void printDbHost() {
        System.out.println("DB host is" + dbHost);
    }
}

