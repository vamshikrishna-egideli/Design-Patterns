public class OnlineOrderProcessingFactory implements OrderProcessingFactory {


    @Override
    public ProcessOrder makeOrderToProcess(ProcessOrder order) {
        return order;
    }
}
