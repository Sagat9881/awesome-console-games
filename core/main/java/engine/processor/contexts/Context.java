package engine.processor.contexts;


import engine.Player;
import scenes.scens.Scene;

import java.util.List;

/**
 * Контейнер для общих данных о действиях и окружающем мире
 */
public interface Context {

    Scene getCurrentScene();

    Player getPlayer();

    List<Long> getOObjects();

    void setScene(Scene airBallon);
}
