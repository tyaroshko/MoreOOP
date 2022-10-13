package lotr;

public class King extends Noble {
    public King() {
        super(5,15,5,15);
    }

    public static void main(String[] args) {
        King king = new King();
        System.out.println(king.toString());
    }
}
