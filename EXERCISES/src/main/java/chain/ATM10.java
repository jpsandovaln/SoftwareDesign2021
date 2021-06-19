package chain;

public class ATM10 implements ATM{
    private ATM atm;
    @Override
    public void setNextChain(ATM nextChain) {
        this.atm = nextChain;
    }

    @Override
    public void dispense(int value) {
        if (value >= 10) {
            int num = value / 10;
            System.out.println("Dispensing 10 = " + num);
        } else {
            this.atm.dispense(value);
        }
    }
}
