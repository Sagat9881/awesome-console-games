package engine.processor.dto;

public class SystemCallback {
    final Object frame;

    public SystemCallback(Object frame) {
        this.frame = frame;
    }

    public void call() {
        System.out.println(frame);
    }
}
