
package hw6;

public class Laptop {
    public String brandModel;
    public String cpu;
    public int ram;
    public String os;
    public String color;

    public Laptop(String brandModel, String cpu, int ram, String os, String color) {
        this.brandModel = brandModel;
        this.cpu = cpu;
        this.ram = ram;
        this.os = os;
        this.color = color;
    }

    public String getBrandModel() {
        return brandModel;
    }

    public void setBrandModel(String brandModel) {
        this.brandModel = brandModel;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Laptop [brandModel=" + brandModel + ", cpu=" + cpu + ", ram=" + ram + ", os=" + os + ", color=" + color
                + "]";
    }
    
    //        Notebook Notebook1 = new Notebook("Notebook 1", 8, "Windows11", 80000, "HP",15.6);
    //    Notebook(String name, int amountRAM, String operatingSystem, int price, String model, double diagonal)
}