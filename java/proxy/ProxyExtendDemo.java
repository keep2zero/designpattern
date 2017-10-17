public class ProxyExtendDemo {
  public static void main(String[] args) {
         Person me = new Me();
         Person proxy = new ProxyMeEx(me);
         proxy.pickOrange();
  }
}

interface Wash {
  public void wash();
}

class ProxyMeEx implements Person, Wash {

  private Person p;

   public ProxyMeEx(Person p) {
     this.p = p;
   }

   @Override
   public void wash() {
        System.out.println("wash one");
   }

   @Override
   public void pickOrange() {
        this.p.pickOrange();
        wash();
   }
}
