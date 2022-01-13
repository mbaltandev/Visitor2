public class Main {

    public static void main(String[] args) {
	IVisitor dortg=new DortG();
    Bilgisayar hp=new Hp();
    hp.kabul(dortg);
    }
}
