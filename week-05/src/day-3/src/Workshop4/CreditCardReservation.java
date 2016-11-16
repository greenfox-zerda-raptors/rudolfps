package Workshop4;

/**
 * Created by gabrud on 2016-11-16.
 */
public class CreditCardReservation implements CreditCardy, Reservationy {
//alt+insert to get the list of routines to implement

    CreditCard creditcard;
    Reservation reservation;

    public CreditCardReservation(String dowBooking, int sumCVV, String nameCardholder, String codeAccount) {
        reservation= new Reservation(dowBooking);
        creditcard  = new CreditCard(sumCVV, nameCardholder, codeAccount);
    }

    @Override
    public void setSumCVV(int sumCVV) {
        creditcard.setSumCVV(sumCVV);
    }

    @Override
    public void setDowBooking(String dowBooking) {
        reservation.setDowBooking(dowBooking);
    }

    @Override
    public int getSumCVV() {
        return creditcard.getSumCVV();
    }

    @Override
    public void setNameCardholder(String nameCardholder) {
        creditcard.setNameCardholder(nameCardholder);
    }

    @Override
    public String getDowBooking() {
        return reservation.getDowBooking();
    }

    @Override
    public String getNameCardholder() {
        return creditcard.getNameCardholder();
    }

    @Override
    public void setCodeBooking(String codeBooking) {
        reservation.setCodeBooking(codeBooking);
    }

    @Override
    public void setCodeAccount(String codeAccount) {
        creditcard.setCodeAccount(codeAccount);
    }

    @Override
    public String getCodeBooking() {
        return reservation.getCodeBooking();
    }

    @Override
    public String getCodeAccount() {
        return creditcard.getCodeAccount();
    }

    @Override
    public boolean PlaceReserved(String dowBooking, String codeBooking) {
        return reservation.PlaceReserved(dowBooking, codeBooking);
    }

    @Override
    public int cumeSumCVV(String codeAccount) {
        return creditcard.cumeSumCVV(codeAccount);
    }

    @Override
    public boolean ValidCard(String codeAccount, int sumCVV) {
        return creditcard.ValidCard(codeAccount, sumCVV);
    }

    @Override
    public boolean PlaceCancelled(String dowBooking, String codeBooking) {
        return true;
    }

    @Override
    public String toString() {
        return reservation.toString() + " paid by " + creditcard.toString();
    }
}