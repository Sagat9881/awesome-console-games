package engine.processor.processors.input_processers;

import engine.processor.contexts.Context;
import engine.processor.processors.input_processers.dto.KeyAction;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class CommandLineInputProcessor implements InputProcessor, KeyListener {
    private volatile Context context;

    @Override
    public void process(Context context) {
        this.context = context;
    }


    @Override
    /**
     *
     */
    public void processInput( KeyEvent e, KeyAction action) {
        Context.KeyState keyState = context.getKeyState();
        if (action == KeyAction.PRESS) {
            keyState.pressKey(e);
        }
        if (action == KeyAction.RELEASE) {
            keyState.releaseKey(e);
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        processInput(e,KeyAction.PRESS);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        processInput(e,KeyAction.RELEASE);
    }
}
