
package pkgfinal.project;


public class countableitem extends item{
   private int numofsubitem;

    public countableitem(int numofsubitem,String n,double p) {
        super(n,p);
        this.numofsubitem = numofsubitem;
    }

    public int getNumofsubitem() {
        return numofsubitem;
    }

    public void setNumofsubitem(int numofsubitem) {
        this.numofsubitem = numofsubitem;
    }
    
   public  double getitemcost(){
       return numofsubitem*super.getPrice();
   }
    public String tostring(){
        return " name { :" + numofsubitem ;
    }
}
