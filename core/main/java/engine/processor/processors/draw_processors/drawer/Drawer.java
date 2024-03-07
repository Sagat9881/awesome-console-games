package engine.processor.processors.draw_processors.drawer;


import engine.Player;
import scenes.plane.cartesian.Cartesian;
import scenes.scens.OObject;

import java.util.Collection;

/**
 * Рисует сцену в указанный поток вывода
 */
public interface Drawer {

    Object drawFrame(Player player, Collection<OObject> objects, Cartesian plane);
}
