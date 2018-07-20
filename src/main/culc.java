package main;

import java.math.BigInteger;

public class culc {


    public BigInteger plus(BigInteger... args) {

        BigInteger resalt = BigInteger.ZERO;
        for (BigInteger arg : args) {
            resalt = resalt.add(arg);
        }
        return resalt;
    }
}
