package engine.processor.processors.actor_processors;

import actors.Actor;
import engine.processor.contexts.Context;
import engine.processor.processors.Processor;
import scenes.scens.Scene;

import java.util.Map;


public interface ActorProcessor extends Processor {

    void actorProcess(Context context, Scene scene, Map<Long, Actor> actor);
}
