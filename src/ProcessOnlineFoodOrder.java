public class ProcessOnlineFoodOrder implements ProcessOnlineOrder{
    @Override
    public Category getCategoryToProcess() {
        return new Food();
    }
}
