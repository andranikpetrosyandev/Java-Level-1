package com.homework.week14.objectmapper;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class CommitAnalyzer {
    private final File file;

    public CommitAnalyzer(File file) {
        this.file = file;
    }

    public int count()  {
        ObjectMapper objectMapper = new ObjectMapper();
        List<Commit> commitList = null;
        try {
            commitList = objectMapper.readValue( file, new TypeReference<List<Commit>>() {});
        } catch (IOException e) {
            e.printStackTrace();
        }
        int sum = 0;
        for (Commit commit : commitList) {
            sum += commit.getTotal();
        }
        return sum;
    }

}
