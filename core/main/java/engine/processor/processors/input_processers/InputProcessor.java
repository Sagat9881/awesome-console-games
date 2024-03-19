package engine.processor.processors.input_processers;

import engine.processor.contexts.Context;
import engine.processor.processors.Processor;
import engine.processor.processors.input_processers.dto.KeyAction;

import java.awt.event.KeyEvent;

public interface InputProcessor extends Processor {

    void processInput(KeyEvent e, KeyAction action);
}
