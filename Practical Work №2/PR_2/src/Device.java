public class Device {
    public void powerOn() {
        System.out.println("Устройство включено.");
    }
}

class Smartphone extends Device {
    @Override
    public void powerOn() {
        System.out.println("Смартфон включается.");
    }
}

class Laptop extends Device {
    @Override
    public void powerOn() {
        System.out.println("Ноутбук включается.");
    }
}
