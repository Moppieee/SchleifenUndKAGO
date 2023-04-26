package my_project;


import KAGO_framework.model.GraphicalObject;

public class Grid extends GraphicalObject {


    public void draw(DrawTool drawTool) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if ((i + j%2) % 2 == 0) {
                    drawTool.setCurrentColor(Color.WHITE);
                }else {
                    drawTool.setCurrentColor(Color.BLACK);
                }
                drawTool.drawFilledRectangle(isquareSize,jsquareSize,squareSize,squareSize);

            }
        }
    }
}
