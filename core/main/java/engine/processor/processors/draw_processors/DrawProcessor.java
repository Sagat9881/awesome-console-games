package engine.processor.processors.draw_processors;

import engine.Player;
import engine.processor.processors.Processor;
import scenes.scens.Scene;

public interface DrawProcessor extends Processor {

    void processScene(Scene scene, Player player);

}
