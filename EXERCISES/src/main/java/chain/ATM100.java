package chain;

public class ATM100 implements ATM{
    private ATM atm;

    @Override
    public void setNextChain(ATM nextChain) {
        this.atm = nextChain;
    }

    @Override
    public void dispense(int value) {
        if (value >= 100) {
            int num = value / 100;
            int remainder = value % 100;
            System.out.println("Dispensing 100 = " + num);
            if (remainder != 0) {
                this.atm.dispense(remainder);
            }
        } else {
            this.atm.dispense(value);
        }
    }
}
