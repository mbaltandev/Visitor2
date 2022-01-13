public class BesG implements IVisitor{
    @Override
    public void visit(Hp hp) {
        System.out.println("Hp bilgisayar BesG");
    }

    @Override
    public void visit(Lenovo lenovo) {
        System.out.println("Lenovo bilgisayar BesG");
    }
}
