package engine;

import engine.processor.contexts.CommandLineContext;
import engine.processor.contexts.Context;
import engine.processor.processors.actor_processors.ActorProcessor;
import engine.processor.processors.draw_processors.DrawProcessor;
import engine.processor.processors.input_processers.InputProcessor;

/**
 * Строит движок игры в консоли
 */
public class CommandLineEngine implements Engine {
    private Context context;
    private final ActorProcessor actorProcesser;
    private final DrawProcessor drawProcessor;
    private final InputProcessor inputProcessor;
    private boolean exitFlag = true;


    static {
//        System.setProperty("java.library.path", "../c++/include clearAndPrintConsole");
        System.loadLibrary("clearAndPrintConsole");
    }

    private CommandLineEngine(ActorProcessor actorProcesser, DrawProcessor drawProcessor, InputProcessor inputProcessor) {
        this.actorProcesser = actorProcesser;
        this.drawProcessor = drawProcessor;
        this.inputProcessor = inputProcessor;

    }

    /**
     * Фабричный метод, поставляющий готовый к использованию движок
     *
     * @param actorProcesser процессор действий неигровых персонажей
     * @param drawProcessor  процессор действий сцен (отрисовка, изменение, разрушение)
     * @param inputProcessor процессор обрабатывающий пользовательский ввод
     * @return
     */
    public static Engine build(ActorProcessor actorProcesser, DrawProcessor drawProcessor, InputProcessor inputProcessor) {
        //TODO: пока что чет совсем не идет
        CommandLineEngine commandLineEngine = new CommandLineEngine(actorProcesser, drawProcessor, inputProcessor);
        commandLineEngine.context = commandLineEngine.buildContext();
        return commandLineEngine;
    }

    //TODO: нужно определить что будет входить в контекст и постараться это добыть
    private Context buildContext() {

        return CommandLineContext.builder().player(new Player(new Player.Position())).build();
    }
//    public static native void clearAndPrintConsole(SystemCallback frame);
    @Override
    public void start() {
        context = buildContext();
        inputProcessor.processInput(System.in, context);
        while (exitFlag) {// пока просто заглушка в качестве костыля, потушить можно будет только убив процесс, из игры этот флаг не поменять :)
            // обработка ввода, изменение числовых показателей состояний объектов контекста (движения, прыжки) за 1 шаг цикла
            inputProcessor.process(context);
            // изменение объектов по обновленным состояниям
            actorProcesser.process(context);
            // обработка вывода на экран по измененным на предыдущих шаге данным
            drawProcessor.process(context);
        }


    }
}
