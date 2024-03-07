package engine.processor.processors.draw_processors;


import actors.Actor;
import engine.Player;
import engine.processor.contexts.Context;
import engine.processor.dto.SystemCallback;
import engine.processor.processors.draw_processors.drawer.CommandLineWindowDrawer;
import engine.processor.processors.draw_processors.drawer.Drawer;
import scenes.scens.OObject;
import scenes.scens.Scene;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;


/**
 *
 */
//TODO: Пока что нужно реализовать хотя бы отрисовку стен и сцены, начать с того, чтоб определить необходимые данные, которые должен предоставлять контейнер Scene для отрисовки
public class CommandLineDrawProcessor implements DrawProcessor {
    //TODO: пока что гвоздями прибил, потом билдер приделаю
    private final Map<Long, Actor> actors = new HashMap<>();
    private final Map<Long, OObject> objects = new HashMap<>();
    //TODO: пока что гвоздями прибил, потом билдер приделаю
    private Drawer drawer = new CommandLineWindowDrawer();





    //TODO: пока что гвоздями прибил, потом билдер приделаю
    private PrintStream outputStream = System.out;

    long time = System.currentTimeMillis();

    @Override
    public void process(Context context) {
        if (time - System.currentTimeMillis() > -17) return;
        final Scene currentScene = context.getCurrentScene();
        final Player player = context.getPlayer();
        time = System.currentTimeMillis();

        processScene(currentScene, player);
    }


    @Override
    public void processScene(Scene scene, Player player) {
        try {
            //TODO: опять кастуем в рантайме, ой огребу же я тут когда нибудь
            clearAndPrintConsole(new SystemCallback(drawer.drawFrame(player, scene.getOObjects(), scene.getPlane())));
        } catch (Exception e) {
            throw new RuntimeException("Не удалось нарисовать");
        }
    }

    private void clearAndPrintConsole(SystemCallback callback){
//        System.out.println("\n".repeat(40));
        callback.call();
    }



}
