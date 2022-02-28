package shipping;

public class InternationalPackage implements Transportable, Comparable {
    private static final int BASE_PRICE = 1200;
    private int weight;
    private boolean breakable;
    private String destinationCountry;
    private int distance;

    public InternationalPackage(int weight, boolean breakable, String destinationCountry, int distance) {
        this.weight = weight;
        this.breakable = breakable;
        this.destinationCountry = destinationCountry;
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public int compareTo(Object o) {
        return this.getDistance() - ((InternationalPackage)o).getDistance();
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public boolean isBreakable() {
        return breakable;
    }

    @Override
    public int calculateShippingPrice() {
        int price = breakable ? 2 * BASE_PRICE : BASE_PRICE;
        price += distance * 10;
        return price;
    }

    @Override
    public String getDestinationCountry() {
        return destinationCountry;
    }
}
