package hu.petrik.kassza.szerver;

public class Product {



    private int id;
    private String name;
    private int price;
    private int count;
    private String description;
    private String arguments;

    public Product(int id, String name, int price, int count, String description, String arguments) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.count = count;
        this.description = description;
        this.arguments = arguments;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getCount() {
        return count;
    }

    public String getDescription() {
        return description;
    }

    public String getArguments() {
        return arguments;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setArguments(String arguments) {
        this.arguments = arguments;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", count=" + count +
                ", description='" + description + '\'' +
                ", arguments='" + arguments + '\'' +
                '}';
    }
}
