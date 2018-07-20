package main;

import java.io.IOException;
import java.math.BigInteger;

public class Main {


    public static void main(String[] args) throws IOException {

        System.out.println("hello");

        Reader reader = new Reader();

        System.out.println("sum " + new Culc().plus(reader.readBigInteger()));

    }
}
