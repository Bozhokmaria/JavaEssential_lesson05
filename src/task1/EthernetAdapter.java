package task1;

import java.util.Objects;

public class EthernetAdapter extends Device{
    int speed;
    String mac;

    public EthernetAdapter(String manufacturer, float price, String serialNumber, int speed, String mac) {
        super(manufacturer, price, serialNumber);
        this.speed = speed;
        this.mac = mac;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        EthernetAdapter that = (EthernetAdapter) o;

        if (getSpeed() != that.getSpeed()) return false;
        return getMac().equals(that.getMac());
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + getSpeed();
        result = 31 * result + getMac().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "EthernetAdapter: " +
                "manufacturer=" + manufacturer +
                ", price=" + price +
                ", serialNumber=" + serialNumber +
                ", speed=" + speed +
                ", mac=" + mac;
    }
}
