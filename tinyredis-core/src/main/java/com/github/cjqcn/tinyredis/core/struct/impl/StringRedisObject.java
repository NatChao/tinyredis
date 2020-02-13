package com.github.cjqcn.tinyredis.core.struct.impl;

import com.github.cjqcn.tinyredis.core.struct.ObjectType;
import com.github.cjqcn.tinyredis.core.struct.RedisObject;

import java.util.Objects;

public class StringRedisObject implements RedisObject {

    public static final StringRedisObject valueOf(String content) {
        return new StringRedisObject(content);
    }

    private final String content;

    public StringRedisObject(String content) {
        this.content = content;
    }

    public String content() {
        return content;
    }

    @Override
    public ObjectType type() {
        return ObjectType.string;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StringRedisObject that = (StringRedisObject) o;
        return content.equals(that.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(content);
    }
}