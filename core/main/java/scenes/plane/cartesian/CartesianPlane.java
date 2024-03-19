package scenes.plane.cartesian;

import scenes.scens.Scene;

/**
 * 'Cartesian' - 'Декартова' (плоскость)
 * Интерфейс для работы с прямоугольной (декартовой) системой координат
 */
public interface CartesianPlane extends Plane {

    int getXMax();

    int getYMax();


    default <S extends Scene> S getVisiblePlane() {
        return getVisiblePlane(this.getXMax(), this.getYMax());
    }

}
