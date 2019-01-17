public class Put implements Runnable {
    Stack sharedStack;

    

    @Override
    public void run() {
        for(int i = 0; i < 100; i++) {
            queue.put(i);
        }
    }
}
