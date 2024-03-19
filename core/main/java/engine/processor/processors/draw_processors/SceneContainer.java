package engine.processor.processors.draw_processors;

public interface SceneContainer<V> {
    default SceneContainer<V> getContainer() {
        return this;
    }
    V getValue();

    interface StringContainer extends SceneContainer<String> {

    }
}
