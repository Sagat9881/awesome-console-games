package engine.processor.contexts;


import actors.Actor;
import engine.Player;
import lombok.Builder;
import scenes.scens.Scene;

import java.util.Collections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Контейнер данных необходимых для работы процессоров
 * работающих с командной строкой
 */
@Builder
public class CommandLineContext implements Context {
    private final Map<Long, Scene> scenes = new HashMap<>();
    private Scene currentScenes;
    private final Map<Long, Actor> actors = new HashMap<>();

    private final Player player;


    @Override
    public Scene getCurrentScene() {
        return currentScenes != null ? currentScenes : Scene.defaultScene();
    }

    @Override
    public Player getPlayer() {
        return player;
    }

    @Override
    public List<Long> getOObjects() {
        return Collections.emptyList();
    }

    @Override
    public void setScene(Scene scene) {
        this.currentScenes = scene;
    }


}
