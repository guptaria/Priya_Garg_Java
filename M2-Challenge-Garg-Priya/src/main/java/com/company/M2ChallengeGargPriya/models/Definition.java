package com.company.M2ChallengeGargPriya.models;

import java.util.Objects;

public class Definition {
    private int id;
    private String word;
    private String definition;

    public Definition(int id, String word, String definition) {
        this.id = id;
        this.word = word;
        this.definition = definition;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Definition)) return false;
        Definition definition = (Definition) o;
        return getId() == definition.getId() && Objects.equals(getWord(), definition.getWord()) && Objects.equals(getDefinition(), definition.getDefinition());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getWord(), getDefinition());
    }

    @Override
    public String toString() {
        return "WordModel{" +
                "id=" + id +
                ", word='" + word + '\'' +
                ", definition='" + definition + '\'' +
                '}';
    }
}
