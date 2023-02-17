public class ProcessOnlineGadgetsOrder implements ProcessOnlineOrder{
    @Override
    public Category getCategoryToProcess() {
        return new Gadgets();
    }
}
