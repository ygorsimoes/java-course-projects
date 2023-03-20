package com.ygorsimoes.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Greeting {

    private final Long id;
    private final String content;
}
