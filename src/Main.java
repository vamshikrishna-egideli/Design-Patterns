/**
 Implement FactoryDesign pattern for OnlineOrderProcessing for different order categories(food, clothing etc..).
 Demonstrate how you can add new order type without violating open closed principle?
 OnlineOrderProcessingFactory and main method should not be edited when you add new order type
 */

public class Main {
    public static void main(String[] args) {
        //from factory, we can process any type of order
        OrderProcessingFactory factory = new OnlineOrderProcessingFactory();
        ProcessOrder onlineOrder = factory.makeOrderToProcess(new ProcessOnlineClothingOrder());
        Category category = onlineOrder.getCategoryToProcess();
        System.out.println(category);
    }
}