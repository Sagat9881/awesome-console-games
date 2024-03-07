
import engine.CommandLineEngine;
import engine.Engine;
import engine.processor.processors.actor_processors.ActorProcessor;
import engine.processor.processors.actor_processors.CommandLineActorProcessor;
import engine.processor.processors.draw_processors.CommandLineDrawProcessor;
import engine.processor.processors.draw_processors.DrawProcessor;
import engine.processor.processors.input_processers.CommandLineInputProcessor;
import engine.processor.processors.input_processers.InputProcessor;

public class Main {


    public static void main(String[] args) {

        final ActorProcessor actorProcesser = new CommandLineActorProcessor();
        final DrawProcessor drawProcessor = new CommandLineDrawProcessor();
        final InputProcessor inputProcessor = new CommandLineInputProcessor();

        final Engine engine =  CommandLineEngine.build(actorProcesser,drawProcessor,inputProcessor);

        engine.start();
    }
}
