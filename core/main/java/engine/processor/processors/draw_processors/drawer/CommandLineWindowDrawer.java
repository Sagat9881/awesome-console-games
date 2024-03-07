package engine.processor.processors.draw_processors.drawer;


import engine.Player;
import scenes.plane.cartesian.Cartesian;
import scenes.scens.OObject;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//TODO: тут то и должен скрываться рэйкастинг.
public class CommandLineWindowDrawer implements Drawer {

    @Override
    // TODO: Нужно определить какие конкретно данные и в каком виде нужны в объекте
    public Object drawFrame(Player player, Collection<OObject> objects, Cartesian plane) {
        int[] cursor = new int[]{player.position.x, player.position.y};
        String playerIcon = player.toString();
        int lengthIcon = playerIcon.length();
        int xOffset = lengthIcon > cursor[0] ? 0 : cursor[0] - lengthIcon;
        int sumLength = xOffset + lengthIcon;
        int emptyAfterIcon = plane.getXMax() > sumLength ? plane.getXMax() - sumLength : 0;

        return getStringFrame(plane, cursor, playerIcon, xOffset, emptyAfterIcon);
    }

    private static String getStringFrame(Cartesian plane, int[] cursor, String playerIcon, int xOffset, int emptyAfterIcon) {
        return IntStream.rangeClosed(0, plane.getYMax())
                .mapToObj(y -> getFrameRow(plane, cursor, playerIcon, xOffset, emptyAfterIcon, y))
                .collect(Collectors.joining("\n",AnsiColors.ANSI_GREEN.colorCode, AnsiColors.ANSI_RESET.colorCode));
    }

    private static String getFrameRow(Cartesian plane, int[] cursor, String playerIcon, int xOffset, int emptyAfterIcon, int y) {
        return y == cursor[1] ? "-".repeat(xOffset) + playerIcon + "-".repeat(emptyAfterIcon) : "-".repeat(plane.getXMax());
    }
}
