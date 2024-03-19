package engine.processor.processors.draw_processors;


import actors.Actor;
import engine.Player;
import engine.processor.contexts.Context;
import engine.processor.dto.SystemCallback;
import engine.processor.processors.draw_processors.drawer.CommandLineWindowDrawer;
import engine.processor.processors.draw_processors.drawer.Drawer;
import scenes.scens.OObject;
import scenes.scens.Scene;
import scenes.scens.scene_2d.Scene2D;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;


/**
 *
 */
//TODO: Пока что нужно реализовать хотя бы отрисовку стен и сцены, начать с того, чтоб определить необходимые данные, которые должен предоставлять контейнер Scene для отрисовки
public class CommandLineDrawProcessor implements DrawProcessor<Scene2D,CommandLineWindowDrawer> {
    //TODO: пока что гвоздями прибил, потом билдер приделаю
    private CommandLineWindowDrawer drawer = new CommandLineWindowDrawer();
    private int consoleX;
    private int consoleY;


    //TODO: пока что гвоздями прибил, потом билдер приделаю
    private PrintStream outputStream = System.out;

    long time = System.currentTimeMillis();

    @Override
    public void process(Context context) {
        if (System.currentTimeMillis() - time > -17) return;

        final Player player = context.getPlayer();
        time = System.currentTimeMillis();

        processScene(context.getCurrentPlane().getVisiblePlane(), player);
    }


    @Override
    public void processScene(Scene2D scene, Player player) {
        try {
            //TODO: опять кастуем в рантайме, ой огребу же я тут когда нибудь
            outputStream.println(drawer.drawFrame(scene));
        } catch (Exception e) {
            throw new RuntimeException("Не удалось нарисовать");
        }
    }

    @Override
    public CommandLineWindowDrawer getDrawer() {
        return drawer;
    }

    private void clearAndPrintConsole(SystemCallback callback) {
//        System.out.println("\n".repeat(40));
        ;
        callback.call();
    }


}
