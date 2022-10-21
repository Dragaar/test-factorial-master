package com.epam.rd.autotasks;

public class Factorial {
    public String factorial(String n) throws IllegalArgumentException {
        int m;
        try {
            m = Integer.parseInt(n);
            if(m < 0)  throw new IllegalArgumentException("negative value");
        } catch (Exception e){
            throw new IllegalArgumentException(e.getMessage());
        }

        long fact = 1;
        for (int i = 2; i <= m; i++) {
            fact = fact * i;
        }
        return String.valueOf(fact);
    }
}
