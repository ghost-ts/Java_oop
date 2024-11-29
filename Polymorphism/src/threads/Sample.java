package threads;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Sample implements Runnable{

    @Override
    public void run() {
        for(int i=1;i<=10;i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Sample.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
