package scenes.scens.scene_2d;


import actors.Actor;
import engine.Player;
import scenes.plane.cartesian.AbstractCartesianPlane;
import scenes.plane.cartesian.CartesianPlane;
import scenes.scens.OObject;
import scenes.scens.Scene;

import java.util.Set;

/**
 * 2-D сцена в декартовой (прямоугольной) плоскости
 */
public class Scene2D extends AbstractCartesianPlane implements Scene<Scene2D> {

   private String[][] sceneMatrix;

    public Scene2D(CartesianPlane plane) {
        super(plane.getActors(), plane.getOObjects(), plane.getPlayer(),plane.);
    }


    @Override
    public Scene2D getForDraw() {
        return sceneMatrix;
    }
}
