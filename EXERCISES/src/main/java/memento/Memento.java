package memento;

public class Memento {
    private String op;
    private String memory;
    private String hdd;

    public Memento(String op, String memory, String hdd) {
        this.op = op;
        this.memory = memory;
        this.hdd = hdd;
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
}
