package engine.processor.processors.draw_processors.drawer;


import scenes.scens.Scene;

/**
 * Рисует сцену в указанный поток вывода
 */
public interface Drawer<SM> {

        SM drawFrame(Scene<SM> scene);
}
