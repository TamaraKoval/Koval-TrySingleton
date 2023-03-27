import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {

    private static Logger logger;
    protected int num = 1;

    private Logger() {
    }

    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }

    public void log(String msg) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd kk:mm:ss");
        String logTime = simpleDateFormat.format(new Date());
        System.out.println("[" + logTime + " " + num++ + "] " + msg);
    }
}
