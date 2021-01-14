import java.time.LocalDate;

public class ChienGion extends VatLieu implements ChietKhau {
    private int soLuong;

    public ChienGion(int soLuong) {
        this.soLuong = soLuong;
    }

    public ChienGion(String id, String name, LocalDate manufacturingDate, int cost, int soLuong) {
        super(id, name, manufacturingDate, cost);
        this.soLuong = soLuong;
    }

    @Override
    public double getAmount() {
        return soLuong*getCost();
    }

    @Override
    public LocalDate getExpiryDate() {
        return getManufacturingDate().minusYears(1);
    }

    @Override
    public double getRealMoney() {
        if(getExpiryDate().isAfter(getManufacturingDate().plusMonths(4))) {
            return (1 - 0.2) * getAmount();
        }else if (getExpiryDate().isAfter(getManufacturingDate().plusMonths(2))){
            return (1-0.4) *getAmount();
        }else return (1-0.05)*getAmount();
    }


    @Override
    public String toString() {
        return "ChienGion{" +
                "số lượng= " + soLuong +" tổng tiền= "+getAmount()+" chiết khấu= "+getRealMoney()+
                '}';
    }
}
