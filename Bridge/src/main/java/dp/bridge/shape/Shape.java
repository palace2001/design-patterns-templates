package dp.bridge.shape;

import dp.bridge.drawing.Drawing;

public abstract class Shape {
    private Drawing _dp;

    abstract public void draw();

    public Shape (Drawing dp) {
        _dp = dp;
    }

    public void drawLine (double x1, double y1, double x2, double y2) {
        _dp.drawLine(x1, y1, x2, y2);
    }

    public void drawCircle (double x, double y, double r) {
        _dp.drawCircle(x, y, r);
    }
}
