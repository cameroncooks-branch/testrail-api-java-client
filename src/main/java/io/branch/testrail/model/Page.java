package io.branch.testrail.model;

import io.branch.testrail.internal.PageDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(using = PageDeserializer.class)
public class Page<T> {

    public int offset;

    public int limit;

    public int size;

    public Links _links;

    public T objects;
}
