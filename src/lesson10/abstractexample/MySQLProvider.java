package lesson10.abstractexample;

/**
 * Created by Ps1X on 28.09.2017.
 */
public class MySQLProvider extends DbProvider {

//    public MySQLProvider(String dbHost) {
//        super(dbHost);
//    }

    @Override
    void connectToDb() {
        //logic for Mysql
    }

    @Override
    void disconnectFromDb() {

    }
}
