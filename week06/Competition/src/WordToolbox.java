import com.sun.deploy.util.StringUtils;

import static jdk.nashorn.internal.objects.NativeString.charAt;

/**
 * Created by gabrud on 2016-11-21.
 */
public class WordToolbox implements IWordToolbox{
    private String stringHeld;
    public boolean isAnAnagram(String stringToCheck){
        return false;
    }
  public int countHowMany(char charToFind){
      String s = getStringHeld();
      int counter = 0;
      for( int i=0; i<s.length(); i++ ) {
          if (charToFind == 0){
              counter++;
          }
          else if( s.toLowerCase().charAt(i) == charToFind) {
              counter++;
          }
          else if( s.toUpperCase().charAt(i) == charToFind) {
              counter++;
          }
      }return counter;
    }

    @Override
    public String setS(String s) {
        return null;
    }

    public WordToolbox(String stringHeld) {
        this.stringHeld = stringHeld;
    }


    @Override
    public void WaitingItOut() {
    }


   
    @Override
    public String getS() {
        return this.getStringHeld();
    }

    public String getStringHeld() {
        return stringHeld;
    }

    public void setStringHeld(String stringHeld) {
        this.stringHeld = stringHeld;
    }
}
