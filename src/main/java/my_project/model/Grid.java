package my_project;
import KAGO_framework.Config;
import KAGO_framework.control.MainController;
import javafx.scene.transform.Shear;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;
import java.sql.SQLOutput;

public class Grid extends GraphicalObject {
    int size = 12;
    public void draw(DrawTool drawTool) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if ((i + j%2) % 2 == 0) {
                    drawTool.setCurrentColor(Color.WHITE);
                }else {
                    drawTool.setCurrentColor(Color.BLACK);
                }
                drawTool.drawFilledRectangle(50 * j, i * 50,50,50);

            }
        }
        System.out.println("HALLO");
    }
}