package com.homework.week14.objectmapper;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;

class CommitAnalyzerTest {

    @Test
    public void testCount() {
        File file = new File(getClass().getClassLoader().getResource("commits-data.txt").getFile());
        CommitAnalyzer commitAnalyzer = new CommitAnalyzer(file);
        Assertions.assertEquals(301,commitAnalyzer.count());

    }

}