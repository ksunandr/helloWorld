package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

class Reader {

    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


    private String[] readString() throws IOException {

        return br.readLine().split(" ");
    }

    BigInteger[] readBigInteger() throws IOException {
        String[] strings = readString();
        BigInteger[] bigIntegers = new BigInteger[strings.length];

        for (int i = 0; i < strings.length; i++) {
            bigIntegers[i] = new BigInteger(strings[i]);
        }
        return bigIntegers;
    }
}
