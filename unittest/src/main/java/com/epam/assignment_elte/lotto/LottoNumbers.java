package com.epam.assignment_elte.lotto;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LottoNumbers {

    private RandomGenerator randomGenerator;
    private UniquenessVerifier uniquenessVerifier;

    public LottoNumbers(RandomGenerator randomGenerator, UniquenessVerifier uniquenessVerifier) {
        this.randomGenerator = randomGenerator;
        this.uniquenessVerifier = uniquenessVerifier;
    }

    /**
     * @param from  inclusive
     * @param to    inclusive
     * @param count how many UNIQUE numbers we need
     * @return
     */
    public List<Integer> generateNumbers(int from, int to, int count) {
        Set<Integer> numbers = new HashSet<>();
        while (numbers.size() < count) {
            int num = randomGenerator.getNumber(from, to);
            numbers.add(num);
        }
        List<Integer> result = new ArrayList<>(numbers);
        // since we defenitely need unique numbers, we want this extra check here
        uniquenessVerifier.verify(result);
        return result;
    }

}
