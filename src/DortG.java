public class DortG implements IVisitor{
    @Override
    public void visit(Hp hp) {
        System.out.println("Hp bilgisayar 4G");
    }

    @Override
    public void visit(Lenovo lenovo) {
        System.out.println("Lenovo bilgisayar 4G");
    }
}
