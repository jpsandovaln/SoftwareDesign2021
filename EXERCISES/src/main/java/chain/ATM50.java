package chain;

public class ATM50 implements ATM{
    private ATM atm;
    @Override
    public void setNextChain(ATM nextChain) {
        this.atm = nextChain;
    }

    @Override
    public void dispense(int value) {
        if (value >= 50) {
            int num = value / 50;
            int remainder = value % 50;
            System.out.println("Dispensing 50 = " + num);
            if (remainder != 0) {
                this.atm.dispense(remainder);
            }
        } else {
            this.atm.dispense(value);
        }
    }
}
