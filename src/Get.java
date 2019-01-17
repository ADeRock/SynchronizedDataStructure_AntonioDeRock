public class Get implements Runnable {
    Stack sharedStack;

    Get(Stack s) {
        sharedStack = s;

    }
    @Override
    public void run() {
        for(int i = 0; i < 100; i++){
            Object newNumber = sharedStack.get();
            if (newNumber != null) {
                System.out.println("Got " + newNumber);
            }
        }
    }
}
