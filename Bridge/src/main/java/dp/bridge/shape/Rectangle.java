package dp.bridge.shape;

import dp.bridge.drawing.Drawing;

public class Rectangle extends Shape {
    double _x1, _y1, _x2, _y2;

    public Rectangle(Drawing dp, double x1, double y1, double x2, double y2) {
        super(dp);
        this._x1 = x1;
        this._y1 = y1;
        this._x2 = x2;
        this._y2 = y2;
    }

    public void draw() {
        drawLine(_x1, _y1, _x2, _y1);
        drawLine(_x2, _y1, _x2, _y2);
        drawLine(_x2, _y2, _x1, _y2);
        drawLine(_x1, _y2, _x1, _y1);
    }
}
