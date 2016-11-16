package Workshop4;

/**
 * Created by gabrud on 2016-11-16.
 */
public class CreditCard implements CreditCardy {

    private int sumCVV;
    private String nameCardholder;
    private String codeAccount;

    public CreditCard(int sumCVV, String nameCardholder, String codeAccount) {

        this.sumCVV = (sumCVV==0)?cumeSumCVV(codeAccount):sumCVV;
        this.nameCardholder=nameCardholder;
        this.nameCardholder=nameCardholder;
        this.codeAccount =codeAccount;

    }

    @Override
    public int cumeSumCVV(String codeAccount) {

        int sum = 0;
        char c;

        for (int i = 0; i < codeAccount.length()-1; i++) {
            c = codeAccount.charAt(i);
            sum += (c >= '0' && c <= '9') ? Character.getNumericValue(c) : 0;
        }

        return sum;

    }

    @Override
    public String toString () {
        return String.format("Name=%s CC#=%s CVV=%d", this.nameCardholder, this.codeAccount, this.sumCVV);
    }

    @Override
    public void setSumCVV(int sumCVV) {
        this.sumCVV = sumCVV;
    }

    @Override
    public int getSumCVV() {
        return sumCVV;
    }

    @Override
    public void setNameCardholder(String nameCardholder) {
        this.nameCardholder= nameCardholder;

    }

    @Override
    public String getNameCardholder() {
        return this.nameCardholder;
    }

    @Override
    public void setCodeAccount(String codeAccount) {
        this.codeAccount = codeAccount;
    }

    @Override
    public String getCodeAccount() {
        return this.codeAccount;
    }

    @Override
    public boolean ValidCard(String codeAccount, int sumCVV) {
        return (cumeSumCVV(codeAccount)==sumCVV);
    }
}