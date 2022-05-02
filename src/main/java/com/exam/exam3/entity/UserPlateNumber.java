package com.exam.exam3.entity;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;


@Entity
@Table(name = "user_plate_numbers")
public class UserPlateNumber {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "plate_number_id", foreignKey = @ForeignKey(name = "FK_USER_PLATE_NUMBER_PLATE_NUMBER_ID"))
    private PlateNumber plateNumber;

    @ManyToOne
    @JoinColumn(name = "user_id", foreignKey = @ForeignKey(name = "FK_USER_PLATE_NUMBER_USER_ID"))
    private User user;

    public UserPlateNumber(PlateNumber plateNumber, User user) {
        this.plateNumber = plateNumber;
        this.user = user;
    }
    public UserPlateNumber() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserPlateNumber that = (UserPlateNumber) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (plateNumber != null ? !plateNumber.equals(that.plateNumber) : that.plateNumber != null) return false;
        return user != null ? user.equals(that.user) : that.user == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (plateNumber != null ? plateNumber.hashCode() : 0);
        result = 31 * result + (user != null ? user.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "UserPlateNumber{" +
                "id=" + id +
                ", plateNumber=" + plateNumber +
                ", user=" + user +
                '}';
    }

    public Long getId() {
        return id;
    }

    public PlateNumber getPlateNumber() {
        return plateNumber;
    }

    public User getUser() {
        return user;
    }
}

