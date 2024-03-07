package scenes.scens;


import actors.Actor;
import engine.Player;
import lombok.NoArgsConstructor;
import scenes.plane.cartesian.AirBallon;
import scenes.plane.cartesian.Cartesian;


import java.util.Collections;
import java.util.Set;

/**
 * Scene - это репрезентация происходящего на экране, т.е. некоторая часть пространства (Plane), отображаемая на текущий момент
 */
public interface Scene {

    static Scene defaultScene() {
        return new DefaultScene();
    }
    static Scene defaultScene(Cartesian plane) {
        return new DefaultScene(plane);
    }
    Set<Actor> getActors();
    Set<OObject> getOObjects();
    long getSceneId();

    Cartesian getPlane();

    @NoArgsConstructor
    class DefaultScene implements Scene {
       private Cartesian plane = new AirBallon(new int[]{0, 0});
        DefaultScene(Cartesian plane){
            this.plane = plane;
        }

        @Override
        public Set<Actor> getActors() {
            return Collections.emptySet();
        }

        @Override
        public Set<OObject> getOObjects() {
            return Collections.emptySet();
        }

        @Override
        public long getSceneId() {
            return 0;
        }


        @Override
        public Cartesian getPlane() {
            return plane;
        }
    }
}
