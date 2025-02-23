package Java;

interface Food {
    String getType();
}

class Pizza implements Food {
    @Override
    public String getType() {
        return "The factory returned class Pizza\n" +
                "Someone ordered Fast Food!";
    }
}

class Cake implements Food {

    @Override
    public String getType() {
        return "The factory returned class Cake\n" +
                "Someone ordered a Dessert!";
    }
}

class FoodFactory {
    public static Food getFood(String foodType) {
        if (foodType.equals("cake")) {
            return new Cake();
        } else if (foodType.equals("pizza")) {
            return new Pizza();
        } else {
            return null;
        }
    }
}

public class FactoryPatternMain {
    public static void main(String[] args) {
        Food cake = FoodFactory.getFood("cake");
        assert cake != null;
        System.out.println(cake.getType());

        Food pizza = FoodFactory.getFood("pizza");
        assert pizza != null;
        System.out.println(pizza.getType());
    }
}
