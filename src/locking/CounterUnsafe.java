package locking;

public class CounterUnsafe implements Counter {

    int counter = 0;

    @Override
    public void increment() {
        final int temp = counter;
        try {
            Thread.sleep(1);
        } catch (final InterruptedException e) {
            e.printStackTrace();
        }
        counter = temp + 1;
    }

    @Override
    public int get() {
        return counter;
    }

}
