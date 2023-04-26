import KAGO_framework.Config;
import KAGO_framework.control.MainController;
import javafx.scene.transform.Shear;

public class MainProgram {


    public static void main (String[] args) {
        MainController.startFramework();
    }

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


