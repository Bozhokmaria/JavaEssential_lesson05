package task1;

public class Main {
    public static void main(String[] args) {
        Device device = new Device("Samsung", 120, "AB1234567CD");

        Monitor monitor = new Monitor("Samsung", 120, "AB1234567CD", 1280, 1024);
        Monitor monitor1 = new Monitor("Samsung", 120, "AB1234567CD", 1280, 1024);

        Monitor monitor2 = new Monitor("Samsung1", 1210, "AB12345617CD", 11280, 1024);

        EthernetAdapter ethernetAdapter = new EthernetAdapter("Samsung", 120, "AB1234567CD", 160, "mac");
        EthernetAdapter ethernetAdapter1 = ethernetAdapter;


        System.out.println(device);
        System.out.println(monitor);
        System.out.println(ethernetAdapter);

        System.out.println("-----------------");

        System.out.println(device.equals(monitor));
        System.out.println(device.hashCode());

        System.out.println("-----------------");

        System.out.println(monitor.hashCode());
        System.out.println(monitor.equals(device));

        System.out.println("-----------------");

        System.out.println(monitor2);
        System.out.println(monitor2.hashCode());
        System.out.println(monitor.equals(monitor2));

        System.out.println("-----------------");

        System.out.println(monitor1.hashCode());
        System.out.println(monitor.equals(monitor1));

        System.out.println("-----------------");

        System.out.println(ethernetAdapter.hashCode());
        System.out.println(ethernetAdapter.equals(ethernetAdapter1));
        System.out.println(ethernetAdapter1.hashCode());

    }
}
