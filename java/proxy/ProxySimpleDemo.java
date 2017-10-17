/**
*
*/
public class ProxySimpleDemo {
   public static void main(String[] arg) {
            Person me = new Me();
            Person proxy = new ProxyMe(me);
            proxy.pickOrange();
   }
}

/**
*  root object
*/
interface Person {
    public void pickOrange();
}

/**
*  real object
*/
class Me implements Person{
     @Override
     public void pickOrange(){
         System.out.println("pick one");
     }
}

/**
* proxy object
*/

class ProxyMe implements Person {
   Person p;
   public ProxyMe(Person p) {

     this.p = p;

   }
   @Override
   public void pickOrange() {
        this.p.pickOrange();
   }
}
