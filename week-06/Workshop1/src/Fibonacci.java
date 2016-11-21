
import com.sun.javafx.geom.AreaOp;
import com.sun.prism.shader.Solid_ImagePattern_AlphaTest_Loader;
import com.sun.xml.internal.messaging.saaj.soap.SOAPPartImpl;

    /**
     * Created by gabrud on 2016-11-06.
     */
        public class Fibonacci {
            public static void main(String args[])
            {
                Fibonacci f = new Fibonacci();

            fibo(f);


            }
            public static void fibo(Fibonacci f){


        int n1=0,n2=1,n3,i,count=10;
                System.out.print(n1+" "+n2);//printing 0 and 1

                for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
       }
   }
}
