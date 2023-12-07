import java.math.BigDecimal;
import java.math.MathContext;

public class Operations {


    /**
     * transform  Double number to String,
     * consider that number can be Integer
     * @param d transforming Double number to String
     * @return String form number
     */
    static String printNumber (Double d) {
        String str =Double.toString(d);
        if (str.substring(str.indexOf('.')+1).equals("0"))
            return   str= Long.toString(d.longValue());
        else return str;
    }


    static MathContext mathContext= new MathContext(15);

    static BigDecimal plus (BigDecimal d1, BigDecimal d2) {
        return d1.add(d2, mathContext);
    }

    static  BigDecimal minus (BigDecimal d1, BigDecimal d2) {
        return d1.subtract(d2, mathContext);
    }

    static  BigDecimal divide (BigDecimal d1, BigDecimal d2) {
        return d1.divide(d2, mathContext);
    }

    static  BigDecimal multiply(BigDecimal d1, BigDecimal d2) {
        return d1.multiply(d2, mathContext);
    }

    static  BigDecimal sqrt (BigDecimal d1) { return d1.sqrt(mathContext);}


    static  BigDecimal result (calculate f, BigDecimal d1, BigDecimal d2) {
        return f.func(d1, d2);
    }

}
