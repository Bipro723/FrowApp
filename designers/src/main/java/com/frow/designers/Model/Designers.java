package com.frow.designers.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "designers")
public class Designers {
    private Integer id;
    private String designers;
    private String summary;
    private String location;

    public Designers() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDesigners() {
        return designers;
    }

    public void setDesigners(String designers) {
        this.designers = designers;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Designers designers1 = (Designers) o;
        return Objects.equals(id, designers1.id) && Objects.equals(designers, designers1.designers) && Objects.equals(summary, designers1.summary) && Objects.equals(location, designers1.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, designers, summary, location);
    }

    @Override
    public String toString() {
        return "Designers{" +
                "id=" + id +
                ", designers='" + designers + '\'' +
                ", summary='" + summary + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
