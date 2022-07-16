
package pkgfinal.project;


public class uncountableitem extends item {
    private float weigth;

    public uncountableitem(float w,String n, double p) {
        super(n, p);
        weigth=w;
    }

    public float getWeigth() {
        return weigth;
    }

    public void setWeigth(float weigth) {
        this.weigth = weigth;
    }
     
    public  double getitemcost(){
          return weigth*super.getPrice();
      }
     public String tostring(){
        return " weigth {:" + weigth;
    }
}
