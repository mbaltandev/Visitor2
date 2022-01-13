public class Wifi implements IVisitor{
    @Override
    public void visit(Hp hp) {
        System.out.println("Hp bilgisayar Wifi");
    }

    @Override
    public void visit(Lenovo lenovo) {
        System.out.println("Lenovo bilgisayar Wifi");
    }
}

