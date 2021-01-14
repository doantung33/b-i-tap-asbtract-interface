import java.time.LocalDate;

public class Thit extends VatLieu implements ChietKhau {
    private double weight;

    public Thit(double weight) {
        this.weight = weight;
    }

    public Thit(String id, String name, LocalDate manufacturingDate, int cost, double weight) {
        super(id, name, manufacturingDate, cost);
        this.weight = weight;
    }

    @Override
    public double getAmount() {
        return getCost()*weight;
    }

    @Override
    public LocalDate getExpiryDate() {
        return getManufacturingDate().minusDays(7);
    }

    @Override
    public double getRealMoney() {
        if(getExpiryDate().isAfter(getManufacturingDate().plusDays(3))) {
            return (1 - 0.5) * getAmount();
        }else if (getExpiryDate().isAfter(getManufacturingDate().plusDays(5))){
            return (1-0.3) *getAmount();
        }else return (1-0.1)*getAmount();
    }

    @Override
    public String toString() {
        return "Thit{" +
                "khối lượng=" + weight +" tổng tiền= "+getRealMoney()+" chiết khấu= "+getRealMoney()+
                '}';
    }
}
