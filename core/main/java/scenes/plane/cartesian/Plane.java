package scenes.plane.cartesian;

import actors.Actor;
import engine.Player;
import scenes.scens.OObject;
import scenes.scens.Scene;
import scenes.scens.builder.Scene2DBuilder;

import java.util.Set;

public interface Plane {
    //TODO:НЕ ЗАБЫТЬ УБРАТЬ нужно для тестирования
    <S extends Scene> S getVisiblePlane(int xMax, int yMax);

    Set<Actor> getActors();

    Set<OObject> getOObjects();


    Player getPlayer();


}
