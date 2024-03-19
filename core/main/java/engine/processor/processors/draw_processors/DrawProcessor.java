package engine.processor.processors.draw_processors;

import engine.Player;
import engine.processor.processors.Processor;
import engine.processor.processors.draw_processors.drawer.Drawer;
import scenes.scens.Scene;

public interface DrawProcessor<S extends Scene, D extends Drawer<S>> extends Processor {

    void processScene(S scene, Player player);

    D getDrawer();

}
