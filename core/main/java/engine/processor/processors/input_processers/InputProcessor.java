package engine.processor.processors.input_processers;

import engine.processor.contexts.Context;
import engine.processor.processors.Processor;

import java.io.InputStream;

public interface InputProcessor extends Processor {

    void processInput(InputStream in, Context context);
}
