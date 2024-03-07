package engine.processor.processors.actor_processors;

import actors.Actor;
import engine.processor.contexts.Context;
import scenes.scens.OObject;
import scenes.scens.Scene;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class CommandLineActorProcessor implements ActorProcessor {
    //TODO: пока что гвоздями прибил, потом билдер приделаю
    private final Map<Long, Actor> actors = new HashMap<>();
    //TODO: пока что гвоздями прибил, потом билдер приделаю
    private final Map<Long, OObject> objects = new HashMap<>();

    @Override
    public void process(Context context) {
        final Scene scene = context.getCurrentScene();
        final  List<Long> oObjectsId = context.getOObjects();
        final Map<Long, Actor> actualActors = actors.entrySet().stream().filter(entry -> scene.getActors().contains(entry.getValue())).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

    }

    @Override
    public void actorProcess(Context context, Scene scene, Map<Long, Actor> actor) {

    }
}
