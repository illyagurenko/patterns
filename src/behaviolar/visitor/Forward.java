package behaviolar.visitor;

public class Forward implements PlayerElement {
    public int threes = 6;

    @Override
    public void accept(Visitor visitor) {
        visitor.visitForward(this);
    }
}