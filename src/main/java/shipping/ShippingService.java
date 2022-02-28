package shipping;

import java.util.*;

public class ShippingService {
    List<Transportable> packages = new ArrayList<>();

    public void addPackage(Transportable pkg){
        packages.add(pkg);
    }

    public List<Transportable> getPackages() {
        return new ArrayList<>(packages);
    }

    public List<Transportable> collectItemsByBreakableAndWeight(boolean breakable, int weight){
        return packages.stream()
                .filter(t -> t.isBreakable() == breakable && t.getWeight() >= weight)
                .toList();
    }

    public Map<String, Integer> collectTransportableByCountry(){
        Map<String, Integer> maps = new HashMap<>();
        for(Transportable t : packages){
            String destination = t.getDestinationCountry();
            if(maps.containsKey(t.getDestinationCountry())){
                maps.put(destination, maps.get(destination) + 1);
            } else {
                maps.put(destination, 1);
            }
        }
        return maps;
    }

    public List<Transportable> sortInternationalPackagesByDistance(){
       return packages.stream()
                .filter(t -> !t.getDestinationCountry().equals("Hungary"))
                .sorted()
                .toList();
    }
}
