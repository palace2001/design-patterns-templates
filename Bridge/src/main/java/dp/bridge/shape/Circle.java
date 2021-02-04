package dp.bridge.shape;

import dp.bridge.drawing.Drawing;

public class Circle extends Shape {
    double _x, _y, _r;

    public Circle (Drawing dp, double x, double y, double r) {
        super(dp);
        this._x = x;
        this._y = y;
        this._r = r;
    }

    public void draw() {
        drawCircle(_x, _y, _r);
    }
}
