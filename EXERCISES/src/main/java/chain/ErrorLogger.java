package chain;

public class ErrorLogger extends  Logger{
    private  Logger newLogger;

    @Override
    public void setNextLogger(Logger nextLogger) {
        this.newLogger = nextLogger;
    }

    @Override
    public void message(String message, int level) {
        if(level <= ERROR) {
            String date = this.formatter.format(this.date);
            System.out.println(date + " ERROR: " + message);
        }
        if (this.newLogger != null) {
            this.newLogger.message(message, level);
        }
    }
}
