
public class Id {
    private String model;
    private int god;
    private int cena;
    private String color;

    public Id(String model, int god, int cena, String color) {
        this.model = model;
        this.god = god;
        this.cena = cena;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getGod() {
        return god;
    }

    public void setGod(int god) {
        this.god = god;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return
                "model='" + model + '\'' +
                ", god=" + god +
                ", cena=" + cena +
                ", color='" + color + '\'' +
                '}';
    }
}
