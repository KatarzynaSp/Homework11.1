import java.util.Objects;

class Box {
    private String word;
    private int number;

    public Box(String word, int number) {
        this.word = word;
        this.number = number;
    }

    public Box() {
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Box box = (Box) o;
        return number == box.number &&
                Objects.equals(word, box.word);
    }

    @Override
    public int hashCode() {
        return Objects.hash(word, number);
    }

    public String toString() {
        return word + " " + number;
    }
}