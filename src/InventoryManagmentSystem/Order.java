package InventoryManagmentSystem;

public class Order implements Comparable<Order>{
    private int id;
    private Boolean isExpress;
    private int totalAmount;

    public Order(int id, Boolean isExpress, int totalAmount) {
        this.id = id;
        this.isExpress = isExpress;
        this.totalAmount = totalAmount;
    }

    @Override
    public int compareTo(Order o) {
        // isExpress : should come first
        // tie- breaker , id should resolve it

        if (this.isExpress && !o.isExpress){
            return -1;
        } else if(!this.isExpress && o.isExpress){
            return 1;
        } else {
            if(this.getId() < o.getId()){
                return -1;
            } else if(this.getId() > o.getId()){
                return 1;
            }
        }
        return 0;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Boolean getExpress() {
        return isExpress;
    }

    public void setExpress(Boolean express) {
        isExpress = express;
    }
}
