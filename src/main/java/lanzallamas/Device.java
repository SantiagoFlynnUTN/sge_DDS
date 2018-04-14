package lanzallamas;

public class Device {
    private final String name;
    private final int kwh;
    private boolean on;

    public Device(String name, int kwh){
        this(name, kwh, false); // TODO definir default para on
    }

    public Device(String name, int kwh, boolean on){
        this.name = name;
        this.kwh = kwh;
        this.on = on;
    }

    public boolean isOn() { return on; }
    public void setOn(boolean o) {this.on = o; }
}
