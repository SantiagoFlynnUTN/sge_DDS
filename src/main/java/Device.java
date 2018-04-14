public class Device {

    private String name;
    private int kwh;
    private boolean on;

    public String getName() {
        return name;
    }
    public void setName(String n) {
        this.name = n;
    }

    public int getKwh() {
        return kwh;
    }
    public void setKwh(int k) { this.kwh = k; }

    public boolean isOn() { return on; }
    public void setOn(boolean o) {this.on = o; }
}
