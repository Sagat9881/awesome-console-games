package scenes.scens;


/**
 * Scene - это репрезентация происходящего на экране, т.е. некоторая часть пространства (Plane), отображаемая на текущий момент
 */
public interface Scene<SM>{

    SM getForDraw();

}
