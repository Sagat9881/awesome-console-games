package engine;

import lombok.Data;


@Data
public class Player {

    public Position position;

    public Player(Position position) {
        this.position = position;
    }

    @Data
    public static class Position {
        public int x;
        public int y;

        /**
         * angle of rotation - угол поворота
         */
        public  double aor;
    }

    @Override
    public String toString() {
        return "[.]_[.]";
    }
}
