package org.ababup1192;


import lombok.Builder;
import lombok.Value;
import lombok.experimental.Accessors;

@Builder
@Value
@Accessors(fluent = true)
public class ImmutablePerson {
    private final int age;
    private final String firstName;
    private final String familyName;
}