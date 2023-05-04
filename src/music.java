import com.sun.jdi.ThreadReference;
import org.jfugue.player.Player;

public class music implements Runnable{
    String threadName;
    Thread t;

    /**
     * names a thread
     * @param name Accepts a string as a name for the thread, to be defined in main
     */
    music(String name){
        threadName = name;
        System.out.println("Creating " + threadName);
    }

    /**
     * Creates a thread, outputs to console that the thread is running
     * It also runs music in the thread to occur only once before the thread is exited.
     */
    public void run(){
        System.out.println("Runnning " + threadName);
        try {
            for (int i = 1; i != 0; i--) {
                Player player = new Player();
                player.play("I[Piano] C5 E5 G5");
                System.out.println("MUSIC WAS REACHED");
            }
        }catch (Exception e){
            System.out.println("error");
        }
        System.out.println("exiting thread: " +threadName);
    }

    /**
     * Starts the thread, actually defines it here aswell.
     */
    public void start(){
        System.out.println("Sarting " + threadName);
        if(t == null){
            t = new Thread(this, threadName);
            t.start();
        }
    }
}
