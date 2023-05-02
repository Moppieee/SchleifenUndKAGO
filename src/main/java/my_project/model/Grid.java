package my_project;
import KAGO_framework.Config;
import KAGO_framework.control.MainController;
import javafx.scene.transform.Shear;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;
import java.sql.SQLOutput;

public class Grid extends GraphicalObject {
    int size = 12;                              //Die Anzahl der Squares pro Seite
    public void draw(DrawTool drawTool) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if ((i + j%2) % 2 == 0) {  //Modulo rechnung--> bestimmt die Farbe des Rasters
                    drawTool.setCurrentColor(Color.WHITE);
                }else {
                    drawTool.setCurrentColor(Color.BLACK);
                }
                drawTool.drawFilledRectangle(50 * j, i * 50,50,50);  //Die einzelnen Squares

            }
        }
//        System.out.println("it workin´");
    }
}
