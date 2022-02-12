package adp.lab2;

import java.util.List;

class ShowLast implements Runnable {
    private final List<String> list;

    public ShowLast(final List<String> list) {
        synchronized (this) {
            this.list = list;
        }
    }

    public void run() {
        synchronized (this.list) {
            while (true) {
                if (list.size() > 0) {
                    int lastItem = this.list.size() - 1;
                    Thread.yield();
                    System.out.println("Last item is " + this.list.get(lastItem));
                } else {
                    break;
                }
            }
            try {
                Thread.sleep((long) (Math.random() * 100));
            } catch (final InterruptedException e) {
            }
        }
    }
}
