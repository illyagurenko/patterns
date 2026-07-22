package behaviolar.visitor;

public class Center implements PlayerElement {
    public int dunks = 4;

    @Override
    public void accept(Visitor visitor) {
        visitor.visitCenter(this);
    }
}
