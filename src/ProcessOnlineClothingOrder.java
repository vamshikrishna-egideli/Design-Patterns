public class ProcessOnlineClothingOrder implements ProcessOnlineOrder{
    @Override
    public Category getCategoryToProcess() {
        return new Clothing();
    }
}
