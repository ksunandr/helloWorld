package main;

import java.math.BigInteger;

public class Culc {

    BigInteger resalt = BigInteger.ZERO;

    public BigInteger plus(BigInteger... args) {


        for (BigInteger arg : args) {
            resalt = resalt.add(arg);
        }
        return resalt;
    }
}
