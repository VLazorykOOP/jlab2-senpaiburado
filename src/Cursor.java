

public class Cursor {

    private int x; // координата x
    private int y; // координата y
    private String appearance; // вигляд: горизонтальний або вертикальний
    private int size; // розмір: від 1 до 15
    private boolean isVisible; // стан видимості курсору

    // Конструктор
    public Cursor(int x, int y, String appearance, int size) {
        this.x = x;
        this.y = y;
        this.appearance = appearance;
        this.size = size;
        this.isVisible = true;
    }

    // Змінити координати курсору
    public void move(int newX, int newY) {
        this.x = newX;
        this.y = newY;
    }

    // Змінити вигляд курсору
    public void changeAppearance(String newAppearance) {
        this.appearance = newAppearance;
    }

    // Змінити розмір курсору
    public void resize(int newSize) {
        if (newSize >= 1 && newSize <= 15) {
            this.size = newSize;
        } else {
            System.out.println("Invalid size. Size should be between 1 and 15.");
        }
    }

    // Приховати курсор
    public void hide() {
        this.isVisible = false;
    }

    // Відновити курсор
    public void show() {
        this.isVisible = true;
    }
}

