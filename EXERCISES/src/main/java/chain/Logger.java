package chain;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Logger {
    public static final int INFO = 3;
    public static final int NOTICE = 2;
    public static final int ERROR = 1;

    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    Date date = new Date();

    public abstract void setNextLogger(Logger nextLogger);
    public abstract void message(String message, int level);
}
