import java.math.BigInteger;

class MultiplyStrings {
    public String multiplyStrings(String s1, String s2) {
        BigInteger a = new BigInteger(s1);
        BigInteger b = new BigInteger(s2);
        BigInteger result = a.multiply(b);
        return result.toString();
    }
}
