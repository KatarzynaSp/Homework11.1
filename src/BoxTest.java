import java.util.Scanner;

public class BoxTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Box[] boxes = new Box[3];

        for (int i = 0; i < boxes.length; i++) {
            System.out.println("podaj wyraz ");
            String word = input.nextLine();
            System.out.println("podaj liczbę ");
            int number = input.nextInt();
            input.nextLine();
            Box box = new Box(word, number);
            if (contains(boxes, box)) {
                System.out.println("Podaj jeszcze raz");
                i--;
            } else {
                boxes[i] = box;
            }
        }
        for (Box box : boxes) {
            System.out.println(box.getWord() + " " + box.getNumber());
        }
    }

    public static boolean contains(Box[] list, Box box) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] != null && list[i].equals(box)) {
                return true;
            }
        }
        return false;
    }
}