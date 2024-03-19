package scenes.scens.builder;

import actors.Actor;
import scenes.plane.cartesian.Plane;
import scenes.scens.OObject;
import scenes.scens.Scene;
import scenes.scens.scene_2d.Scene2D;

import java.util.Set;

public class Scene2DBuilder {

    public static Scene2D buildScene(Plane plane){
        Set<Actor> actors = plane.getActors();
        Set<OObject> oObjects = plane.getOObjects();

    }
}
