package com.exam.exam3.service.core;

import org.springframework.util.Assert;

public class UserPlateNumberCreateParams {

    private Long userId;

    private Long plateNumberId;

    public UserPlateNumberCreateParams(Long userId, Long plateNumberId) {
        Assert.notNull(userId, "The series should not be null");
        Assert.notNull(plateNumberId, "The number should not be null");
        this.userId = userId;
        this.plateNumberId = plateNumberId;
    }

    public Long getUserId() {
        return userId;
    }

    public Long getPlateNumberId() {
        return plateNumberId;
    }
}
