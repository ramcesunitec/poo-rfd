
package threads1;

/**
 *
 * @author T-102
 */
public class TerceraForma {
    public static void main(String[] args) {
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Yo soy un thread bueno");
            }
        }
        );
        
        t1.start();
    }
}
