import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import org.h2.engine.Database;

/**
 * Created by gabkamabka on 2016.12.14..
 */
@DatabaseTable(tableName = "address")
public class Address {

    @DatabaseField(id = true)
    private String idForAddress;
    @DatabaseField
    private String country;
    @DatabaseField
    private String city;
    @DatabaseField
    private String street;

    public Address() {
    }

    public Address(String idForAddress, String country, String city, String street) {
        this.idForAddress = idForAddress;
        this.country = country;
        this.city = city;
        this.street = street;
    }

    public String getIdForAddress() {  return idForAddress;}
    public void setIdForAddress(String idForAddress) {  this.idForAddress = idForAddress;}
    public String getCountry() {return country;}
    public void setCountry(String country) { this.country = country;}
    public String getCity() { return city; }
    public void setCity(String city) {this.city = city; }
    public String getStreet() {   return street;}
    public void setStreet(String street) { this.street = street; }


    @Override
    public String toString() {
        return "Address{" +
                "idForAddress='" + idForAddress + '\'' +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                '}';
    }

}
