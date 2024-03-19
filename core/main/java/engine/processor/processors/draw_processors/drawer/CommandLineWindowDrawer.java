package engine.processor.processors.draw_processors.drawer;


import scenes.scens.Scene;
import scenes.scens.scene_2d.Scene2D;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CommandLineWindowDrawer implements Drawer<String> {

    protected String getStringFrame(Scene2D plane) {
        return Arrays.stream(plane.getForDraw())
                .map(this::getFrameRow)
                .collect(Collectors.joining("\n", AnsiColors.ANSI_GREEN.colorCode, AnsiColors.ANSI_RESET.colorCode));
    }

    protected String getFrameRow(String[] row) {
        return String.join("", row);
    }

    @Override
    public String drawFrame(Scene<String> scene) {
        return null;
    }

    public static void main(String[] args) {
        CommandLineWindowDrawer cwd = new CommandLineWindowDrawer();
        cwd.drawFrame(new Scene2D())
    }
}
