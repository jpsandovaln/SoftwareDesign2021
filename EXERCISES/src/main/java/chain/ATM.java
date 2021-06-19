package chain;

public interface ATM {
    void setNextChain(ATM nextChain);
    void dispense(int value);
}

