
package pkgfinal.project;

public abstract class item {
    private String name;
    private double price;

    public item(String n, double p) {
        name = n;
        price = p;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public abstract double getitemcost();
    public String tostring(){
        return " name { :" + name + "price" + price+ "}";
    }
}
