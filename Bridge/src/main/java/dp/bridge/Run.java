package dp.bridge;


import dp.bridge.drawing.Drawing;
import dp.bridge.drawing.V1Drawing;
import dp.bridge.drawing.V2Drawing;
import dp.bridge.shape.Circle;
import dp.bridge.shape.Rectangle;
import dp.bridge.shape.Shape;

public class Run {
    public static void main(String[] args) {
        Shape r1, r2;
        Drawing dp;

        dp = new V1Drawing();
        r1 = new Rectangle(dp, 1, 1, 2, 2);

        dp = new V2Drawing();
        r2 = new Circle(dp, 2, 2, 3);

        r1.draw();
        r2.draw();
    }
}
