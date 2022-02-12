package adp.lab2;

import java.util.List;

class ShowLast implements Runnable {
    private final List<String> list;
    public ShowLast( final List<String> list) {
        this.list = list;
    }
    public void run() {
        while( this.list.size() > 0) {
            int lastItem = this.list.size() - 1;
            Thread.yield();
            System.out.println( "Last item is " +
                    this.list.get( lastItem));
            try {
                Thread.sleep( (long)(Math.random() * 100));
            } catch( final InterruptedException e) {}
        }
    }
}