package scenes.plane.cartesian;


import engine.processor.processors.input_processers.CommandLineInputProcessor;

import javax.swing.*;

public class AirBallon extends CartesianPlane {

    public int x_location;
    public int y_location;
    private int[] cursor;

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
        return new int[]{x_location, y_location};
    }

    static JFrame finalMenu = new JFrame();


    public AirBallon(int[] cursor) {
        super(50,28);
        this.x_location = cursor[0];
        this.y_location = cursor[1];
        this.cursor = cursor;
        focusable();
        finalMenu.setVisible(true);
        finalMenu.setAutoRequestFocus(true);
        finalMenu.requestFocusInWindow();

    }


    private void focusable() {
        finalMenu.setFocusable(true);
    }

    public void requestFocus() {
        finalMenu.requestFocus();
    }

    public AirBallon addKeyListener(CommandLineInputProcessor inputProcessor) {
        finalMenu.addKeyListener(inputProcessor);
        return this;
    }

}