import com.sun.jdi.ThreadReference;
import org.jfugue.player.Player;

public class music implements Runnable{
    String threadName;
    Thread t;

    music(String name){
        threadName = name;
        System.out.println("Creating " + threadName);
    }

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

    public void start(){
        System.out.println("Sarting " + threadName);
        if(t == null){
            t = new Thread(this, threadName);
            t.start();
        }
    }
}
