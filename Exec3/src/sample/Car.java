package sample;

public class Car {
    private String name;
    private String model;
    private String color;
    private Integer year;
    private Boolean is4X4;

    public Car(String name, String model, String color, Integer year, Boolean is4X4) {
        this.name = name;
        this.model = model;
        this.color = color;
        this.year = year;
        this.is4X4 = is4X4;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Boolean getIs4X4() {
        return is4X4;
    }

    public void setIs4X4(Boolean is4X4) {
        this.is4X4 = is4X4;
    }
}
