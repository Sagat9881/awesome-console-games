package engine.processor.contexts;


import actors.Actor;
import engine.Player;
import scenes.plane.cartesian.Plane;
import scenes.scens.Scene;

import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Контейнер для общих данных о действиях и окружающем мире
 */
public interface Context {

    Plane getCurrentPlane();

    Player getPlayer();

    List<Long> getOObjects();
    Map<Long, Actor> getActors();

    void setScene(Plane plane);

    KeyState getKeyState();

    class KeyState {
        final private Map<Integer, Boolean> keyToStateMap = new HashMap<>();

        public void pressKey(KeyEvent key) {
            keyToStateMap.remove(key.getKeyCode());
            keyToStateMap.put(key.getKeyCode(), Boolean.TRUE);
        }

        public void releaseKey(KeyEvent key) {
            keyToStateMap.remove(key.getKeyCode());
            keyToStateMap.put(key.getKeyCode(), Boolean.FALSE);
        }
    }
}
