public class RestaurantTest {

    public static void main(String[] args) {

        RestaurantDish dish = new RestaurantDish(99, "Pad Thai", true);

        System.out.println(dish.getCostInCents());
        System.out.println(dish.getNameOfDish());
        System.out.println(dish.wouldRecommend);

        System.out.println("The " + dish.getNameOfDish() + " at " + dish.getCostInCents() + "cents is recommended!");

        dish.eat();


    }

}
