package task1;

import java.util.Objects;

public class Monitor extends Device {
    int resolutionX;
    int resolutionY;

    public Monitor(String manufacturer, float price, String serialNumber, int resolutionX, int resolutionY) {
        super(manufacturer, price, serialNumber);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    public int getResolutionX() {
        return resolutionX;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Monitor monitor = (Monitor) o;

        if (getResolutionX() != monitor.getResolutionX()) return false;
        return getResolutionY() == monitor.getResolutionY();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + getResolutionX();
        result = 31 * result + getResolutionY();
        return result;
    }

    @Override
    public String toString() {
        return "Monitor: " +
                "manufacturer=" + manufacturer +
                ", price=" + price +
                ", serialNumber=" + serialNumber +
                ", X=" + resolutionX +
                ", Y=" + resolutionY;
    }
}
