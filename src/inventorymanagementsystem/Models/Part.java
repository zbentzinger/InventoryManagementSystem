package inventorymanagementsystem.Models;

public abstract class Part {

    private int partID;
    private String name;
    private double price;
    private int inStock;
    private int min;
    private int max;

    public Part(Part part) {

        this.partID = part.getPartID();
        this.name = part.getName();
        this.price = part.getPrice();
        this.inStock = part.getInStock();
        this.min = part.getMin();
        this.max = part.getMax();

    }

    public Part(int ID, String name, double price, int inStock, int min, int max) {

        this.partID = ID;
        this.name = name;
        this.price = price;
        this.inStock = inStock;
        this.min = min;
        this.max = max;

    }

    public void setName(String name) {

        this.name = name;

    }

    public String getName() {

        return name;

    }

    public void setPrice(double price) {

        this.price = price;

    }

    public double getPrice() {

        return price;

    }

    public void setInStock(int inStock) {

        this.inStock = inStock;

    }

    public int getInStock() {

        return inStock;

    }

    public void setMin(int min) {

        this.min = min;

    }

    public int getMin() {

        return min;

    }

    public void setMax(int max) {

        this.max = max;

    }

    public int getMax() {

        return max;

    }

    public void setPartID(int ID) {

        this.partID = ID;

    }

    public int getPartID() {

        return partID;

    }

}
