package scenes.plane.cartesian;

import actors.Actor;
import engine.Player;
import lombok.RequiredArgsConstructor;
import scenes.scens.OObject;
import scenes.scens.Scene;

import java.util.Set;

@RequiredArgsConstructor
public abstract class AbstractCartesianPlane implements CartesianPlane {

    private final Set<Actor> actors;
    private final Set<OObject> oobjects;
    private final Player player;

    protected final char[][] planeMatrix;

    @Override
    public int getXMax() {
        return planeMatrix[0].length;
    }

    @Override
    public int getYMax() {
        return planeMatrix.length;
    }

    @Override
    public Set<Actor> getActors() {
        return actors;
    }

    @Override
    public Set<OObject> getOObjects() {
        return oobjects;
    }


    public Player getPlayer() {
        return player;
    }
}
