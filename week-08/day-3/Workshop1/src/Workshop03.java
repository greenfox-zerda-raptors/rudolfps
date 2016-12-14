    import com.j256.ormlite.dao.Dao;
    import com.j256.ormlite.dao.DaoManager;
    import com.j256.ormlite.jdbc.JdbcConnectionSource;
    import com.j256.ormlite.dao.Dao;
    import com.j256.ormlite.dao.DaoManager;
    import com.j256.ormlite.jdbc.JdbcConnectionSource;
    import com.j256.ormlite.support.ConnectionSource;
    import com.j256.ormlite.table.TableUtils;
    import java.sql.SQLException;

    /**
     * Created by gabkamabka on 2016.12.14..
     */
public class Workshop03 {
        public static void main(String[] args) throws SQLException {
            String databaseUrl = "jdbc:mysql://localhost:3306/workshop03?  user= root & password = admin2 & serverTimezone=UTC & ssl=false";

            ConnectionSource connectionSource = new JdbcConnectionSource(databaseUrl);

            TableUtils.createTableIfNotExists(connectionSource, Account.class);
            TableUtils.createTableIfNotExists(connectionSource, Address.class);

            Dao<Account, String> accountDao =
                    DaoManager.createDao(connectionSource, Account.class);

            Dao<Address, String> addressDao =
                    DaoManager.createDao(connectionSource, Address.class);


            Account account = new Account("Captain America", "uejnsd632**234.");
            createAccountIfNotExists(accountDao, account);

            account = accountDao.queryForId("Captain America");
            System.out.println("Account: " + account.toString());

            Address address = new Address("1", "Hungary", "Miskolc", "Petőfi");
            createAddressIfNotExists(addressDao, address);

            address = addressDao.queryForId("1");
            System.out.println("Address " + address.toString());


        }

        private static void createAccountIfNotExists(Dao<Account, String> accountDao, Account acc) throws SQLException {
            if (accountDao.queryForId(acc.getName()) == null) {
                accountDao.create(acc);
            }
        }

        private static void createAddressIfNotExists(Dao<Address, String> addressDao, Address add) throws SQLException {
            if (addressDao.queryForId(add.getIdForAddress()) == null) {
                addressDao.create(add);
            }
        }
    }