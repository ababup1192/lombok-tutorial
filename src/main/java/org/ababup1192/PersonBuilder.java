package org.ababup1192;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class PersonBuilder {
    private final int age;
    private final String firstName;
    private final String familyName;
}
