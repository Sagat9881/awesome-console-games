package engine.processor.processors.actor_processors;

import actors.Actor;
import engine.processor.contexts.Context;
import scenes.plane.cartesian.Plane;
import scenes.scens.OObject;
import scenes.scens.Scene;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class CommandLineActorProcessor implements ActorProcessor {
    //TODO: пока что гвоздями прибил, потом билдер приделаю
    private Map<Long, Actor> actors = new HashMap<>();


    @Override
    public void process(Context context) {
        actors = context.getActors();
    }

    @Override
    public void actorProcess(Context context, Scene scene, Map<Long, Actor> actors) {
        actors.values()
                .stream()
                .filter(entry -> scene.getActors().contains(entry))
                .forEach(actor -> actor.act(context));
    }
}
