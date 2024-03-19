package engine.processor.contexts;


import actors.Actor;
import engine.Player;
import lombok.Builder;
import scenes.plane.cartesian.Plane;
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
    private Plane plane;

    public Map<Long, Actor> getActors() {
        return actors;
    }

    private final Map<Long, Actor> actors = new HashMap<>();

    private final Player player;
    private final KeyState keyState = new KeyState();


    @Override
    public Plane getCurrentPlane() {
        return plane;
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
    public void setScene(Plane scene) {
        this.plane = scene;
    }

    @Override
    public KeyState getKeyState() {
        return keyState;
    }


}
