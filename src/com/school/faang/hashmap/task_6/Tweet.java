package com.school.faang.hashmap.task_6;

import java.util.List;
import java.util.Objects;

public record Tweet(String author, List<String> hashtags) {

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Tweet tweet = (Tweet) o;
        return Objects.equals(author, tweet.author);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(author);
    }
}
