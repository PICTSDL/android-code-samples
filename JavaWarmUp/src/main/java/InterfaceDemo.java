public class InterfaceDemo {
    public static void main(String[] args) {
        Monitor monitor = new Monitor();
        CPU cpu = new CPU(monitor);
        cpu.boot();
    }
}

interface ShowDesktopCallback {
    public void showDesktop();
}

class A {

}

class CPU {
    ShowDesktopCallback callback;
    public CPU(ShowDesktopCallback callback) {
        this.callback = callback;
    }

    public void boot() {
        System.out.println("Booting...");


        callback.showDesktop();
    }
}


class Monitor implements ShowDesktopCallback {

    @Override
    public void showDesktop() {
        System.out.println("This is your Desktop...!");
    }

    public void turnOff() {
        System.out.println("Turning off....");
    }
}