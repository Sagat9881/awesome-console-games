package engine.processor.processors.input_processers;

import engine.Player;
import engine.processor.contexts.Context;
import scenes.plane.cartesian.AirBallon;
import scenes.plane.cartesian.Cartesian;
import scenes.scens.Scene;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.InputStream;
import java.util.concurrent.ForkJoinPool;

public class CommandLineInputProcessor implements InputProcessor, KeyListener {
    //TODO: пока что гвоздями прибил, потом билдер приделаю
    private final ForkJoinPool pool = ForkJoinPool.commonPool();
    private AirBallon airBallon = new AirBallon(new int[]{0, 0}).addKeyListener(this);
    private volatile Context context;

    @Override
    public void process(Context context) {
        this.context = context;
    }


    @Override
    /**
     *
     */
    public void processInput(InputStream in, Context context) {
        this.context = context;
        context.setScene(Scene.defaultScene(airBallon));
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    //TODO: Такое вот кастование - плохо, потом нужно переделать
    public void keyPressed(KeyEvent e) {
        final Player player = context.getPlayer();
        final Cartesian plane = context.getCurrentScene().getPlane();
        int xMax = plane.getXMax();
        int yMax = plane.getYMax();
        switch (e.getKeyCode()) {
            case KeyEvent.VK_D -> {
                if (player.position.x < xMax) player.position.x+=1;
            }
            case KeyEvent.VK_A -> {
                if (player.position.x > 0) player.position.x-=1;
            }
            case KeyEvent.VK_W -> {
                if (player.position.y < yMax) player.position.y+=1;
            }
            case KeyEvent.VK_S -> {
                if (player.position.y > 0) player.position.y-=1;
            }
            case KeyEvent.VK_Y -> System.exit(0);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
