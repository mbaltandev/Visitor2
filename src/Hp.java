public class Hp implements Bilgisayar{
    @Override
    public void kabul(IVisitor visitor) {
         visitor.visit(this);
    }
}
