package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class readLines {

    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


    public String[] read() throws IOException {

       return br.readLine().split(" ");
    }
}
