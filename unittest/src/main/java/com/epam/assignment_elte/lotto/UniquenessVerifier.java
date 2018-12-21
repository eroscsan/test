package com.epam.assignment_elte.lotto;

import java.util.HashSet;
import java.util.List;

public class UniquenessVerifier {

    public void verify(List<Integer> input){
        if(new HashSet<>(input).size() != input.size()){
            throw new RuntimeException("non unique number detected");
        }
    }

}
