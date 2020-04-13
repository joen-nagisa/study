import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Demo {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        System.out.println(date);
        String stander = "HH:mm:ss yyyy aa MM";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(stander);
        System.out.println(simpleDateFormat.format(date));

        String str = "00:46:21 2019 上午 12";
        Date parse = simpleDateFormat.parse(str);
        System.out.println(parse);

    }
}
