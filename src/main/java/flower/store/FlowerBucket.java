package flower.store;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

//@Getter @Setter
public class FlowerBucket {

    // method price

    private List<FlowerPack> BucketOfFlowers = new ArrayList<FlowerPack>();
    public void add(FlowerPack flowerPack) {
        this.BucketOfFlowers.add(flowerPack);
    }

    public double getPrice() {
        double price = 0;

        for (FlowerPack pack: BucketOfFlowers){
            price += pack.getPrice();
        }
        return price;
    }
}
