package pen;

/**
 * Created by water on 14-12-27.
 */
public class PainterDraw {
    public static void main(String[] args) {
        Painter painter = new Painter();
        //String res = painter.draw(new Red(new GangBi()));
        String res = painter.draw(new GangBi(), new Red());
        System.out.println(res);
    }
}
