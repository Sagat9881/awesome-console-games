package scenes.scens.scene_2d;


import actors.Actor;
import engine.Player;
import scenes.plane.cartesian.Cartesian;
import scenes.plane.cartesian.CartesianPlane;
import scenes.scens.OObject;
import scenes.scens.Scene;

import java.util.Set;

/**
 * 2-D сцена в декартовой (прямоугольной) плоскости
 */
public class Scene2D extends CartesianPlane implements Scene {

    private Player player;

    public Scene2D(int x, int y) {
        super(x, y);
    }

    @Override
    public Set<Actor> getActors() {
        return null;
    }

    @Override
    public Set<OObject> getOObjects() {
        return null;
    }


    @Override
    public long getSceneId() {
        return 0;
    }


    @Override
    public Cartesian getPlane() {
        return this;
    }
}
