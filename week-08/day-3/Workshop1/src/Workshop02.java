/**
 * Created by gabkamabka on 2016.12.14..
 */
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.stmt.QueryBuilder;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;
import sun.security.util.Password;

import java.sql.SQLException;
import java.util.List;

public class Workshop02 {
    public static void main(String[] args) throws SQLException {

       // String databaseUrl = "jdbc:mysql://localhost:3306/Workshop2 ? user= root&password=admin2";
        String databaseUrl ="jdbc:mysql://localhost:3306/workshop02?  user= root & password = admin2 & serverTimezone=UTC & ssl=false";

        ConnectionSource connectionSource = new JdbcConnectionSource(databaseUrl);

        TableUtils.createTableIfNotExists(connectionSource, Account.class);

        Dao<Account, String> accountDao = DaoManager.createDao(connectionSource, Account.class);

        Account account = new Account("Captain America", "uejnsd632**234.");
        createAccountIfNotExists(accountDao, account);
        Account account2 = new Account("The Tick", "tradds142**888.");
        createAccountIfNotExists(accountDao, account2);
        Account account3 = new Account("Moth Man", "lrxmri78##111.");
        createAccountIfNotExists(accountDao, account3);
        Account account4 = new Account("Ozimandias", "utrnaa93*@130.");
        createAccountIfNotExists(accountDao, account4);

        account = accountDao.queryForId("Captain America");
        System.out.println("Account: " + account.toString());
       // System.out.println("Account: " + account2.toString());
       // System.out.println("Account: " + account3.toString());
       // System.out.println("Account: " + account4.toString());


        for (Account acc : accountDao) {
            System.out.println(acc.getName());
        }

        QueryBuilder<Account, String> queryBuilder =
                accountDao.queryBuilder();

        List<Account> accountList = accountDao.queryBuilder()
                .orderBy("name", true)
                .query();

        for (Account a : accountList) {
            System.out.println(a.getName());
        }

    }

    private static void createAccountIfNotExists(Dao<Account, String> accountDao, Account acc) throws SQLException {
        if(accountDao.queryForId(acc.getName()) == null) {
            accountDao.create(acc);
        }
    }
}