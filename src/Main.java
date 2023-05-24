package jlab2;

public class Main {
    public static void main(String[] args) {
        Cursor cursor = new Cursor(0, 0, "horizontal", 16);
        cursor.move(15, 15);
        cursor.changeAppearance("vertical");
        cursor.hide();
        cursor.show();

        Rectangle rect = new Rectangle(15, 20);
        Rectangle rect2 = new Rectangle(12, 18);

        System.out.println("Perimeter rect: " + rect.perimeter());
        System.out.println("Square of rect: " + rect.area());
        System.out.println("Compare: " + rect.compareTo(rect2));
        System.out.println("Is similar: " + rect.isSimilarTo(rect2));

        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(33);
        queue.enqueue(5);
        queue.enqueue(-4);
        queue.enqueue(1);
        queue.enqueue(7);

        System.out.println(queue.search(-4));
    }
}
