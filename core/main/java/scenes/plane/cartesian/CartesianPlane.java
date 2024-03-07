package scenes.plane.cartesian;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CartesianPlane implements Cartesian {
    protected int x;
    protected int y ;
    @Override
    public int getXMax() {
        return x;
    }

    @Override
    public int getYMax() {
        return y;
    }

    @Override
    public int[] getCursor() {
        return new int[0];
    }
}
