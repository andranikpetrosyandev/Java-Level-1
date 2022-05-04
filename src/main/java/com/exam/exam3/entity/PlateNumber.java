package com.exam.exam3.entity;

import org.hibernate.annotations.Proxy;

import javax.persistence.*;

@Entity
@Proxy(lazy=false)
@Table(name = "plate_number")
public class PlateNumber {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "series", length = 2, nullable = false)
    private String series;

    @Column(name = "number", length = 3, nullable = false)
    private int number;


    public PlateNumber(String series, int number) {
        this.series = series;
        this.number = number;
    }
    public PlateNumber() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PlateNumber that = (PlateNumber) o;

        if (number != that.number) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        return series != null ? series.equals(that.series) : that.series == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (series != null ? series.hashCode() : 0);
        result = 31 * result + number;
        return result;
    }

    @Override
    public String toString() {
        return "PlateNumber{" +
                "id=" + id +
                ", series='" + series + '\'' +
                ", number=" + number +
                '}';
    }

    public Long getId() {
        return id;
    }

    public String getSeries() {
        return series;
    }

    public int getNumber() {
        return number;
    }
}
