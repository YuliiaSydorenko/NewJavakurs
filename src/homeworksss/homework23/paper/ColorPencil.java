package homeworksss.homework23.paper;

public class ColorPencil extends Pencil{

    private String color = "Red";

    @Override
    void draw(String figure) {
        System.out.printf("Рисую фигуру %s цветным (%s) карандашом!\n",
                figure, color);
    }

    public ColorPencil() {
    }

    public ColorPencil(String color) {
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
