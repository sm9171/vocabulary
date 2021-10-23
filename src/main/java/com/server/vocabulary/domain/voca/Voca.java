package com.server.vocabulary.domain.voca;

import javax.persistence.*;
import java.util.Objects;

@Table(name = "vocas")
@Entity
public class Voca {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    private String korean;
    private String english;

    static Voca of(String korean, String english) {
        return new Voca(korean,english);
    }

    private Voca(String korean, String english) {
        this.korean = korean;
        this.english = english;
    }

    protected Voca(){

    }
    public String getKorean() {
        return korean;
    }

    public String getEnglish() {
        return english;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Voca voca = (Voca) o;
        return Objects.equals(korean, voca.korean) && Objects.equals(english, voca.english);
    }

    @Override
    public int hashCode() {
        return Objects.hash(korean, english);
    }
}
