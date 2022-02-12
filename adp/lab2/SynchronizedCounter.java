package adp.lab2;

class SynchronizedCounter implements Counter {
  private int c = 0;
  public synchronized void increment() {
    this.c++;
  }
  public synchronized void decrement() {
    this.c--;
  }
  public synchronized int value() {
    return this.c;
  }
}
