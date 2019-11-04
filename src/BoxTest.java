import java.util.Arrays;
import java.util.Scanner;

public class BoxTest {
    public static void main(String[] args) {
        Box[] boxes = new Box[3];

        for (int i = 0; i < boxes.length; i++) {
            Box box = inputData();
            if (contains(boxes, box)) {
                System.out.println("Podaj jeszcze raz");
                i--;
            } else {
                boxes[i] = box;
            }
        }
        System.out.println(Arrays.toString(boxes));
    }

    public static Box inputData() {
        Scanner input = new Scanner(System.in);

        System.out.println("podaj wyraz ");
        String word = input.nextLine();
        System.out.println("podaj liczbę ");
        int number = input.nextInt();
        input.nextLine();
        Box box = new Box(word, number);
        return box;
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