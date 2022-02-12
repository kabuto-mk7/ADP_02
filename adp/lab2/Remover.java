package adp.lab2;

import java.util.List;

class Remover implements Runnable {
    private final List<String> list;
    public Remover( final List<String> list) {
        this.list = list;
    }
    public void run() {
        while( this.list.size() > 0) {
            try {
                Thread.sleep( (long)(Math.random() * 100));
            } catch( final InterruptedException e) {}
            System.out.println( "Removing " + this.list.remove( this.list.size() - 1));
        }
    }
}