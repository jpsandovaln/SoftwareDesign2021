package memento;

public class Computer {
    private String op;
    private String memory;
    private String hdd;

    public Computer(String op, String memory, String hdd) {
        this.op = op;
        this.memory = memory;
        this.hdd = hdd;
    }

    public Memento backup() {
        return new Memento(this.op, this.memory, this.hdd);
    }

    public void restore(Memento memento) {
        this.op = memento.getOp();
        this.memory = memento.getMemory();
        this.hdd = memento.getHdd();
    }

    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getHdd() {
        return hdd;
    }

    public void setHdd(String hdd) {
        this.hdd = hdd;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "op='" + op + '\'' +
                ", memory='" + memory + '\'' +
                ", hdd='" + hdd + '\'' +
                '}';
    }
}
