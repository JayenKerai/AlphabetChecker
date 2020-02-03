package com.sparta.jk;

/*
- Returns true if constructor parameter contains one of each letter.
- Uses regex to confirm a match for each character is found.
 */
public class AlphabetChecker {
    private String regex = "(?=.*a)(?=.*b)(?=.*c)(?=.*d)(?=.*e)(?=.*f)(?=.*g)(?=.*h)(?=.*i)(?=.*j)(?=.*k)(?=.*l)(?=.*m)(?=.*n)(?=.*o)(?=.*p)(?=.*q)(?=.*r)(?=.*s)(?=.*t)(?=.*u)(?=.*v)(?=.*w)(?=.*x)(?=.*y)(?=.*z).*";

    public boolean hasAlphabet(String str) {
        return str.toLowerCase().matches(regex);
    }
}