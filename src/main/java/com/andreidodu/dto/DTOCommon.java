package com.andreidodu.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class DTOCommon {
    protected LocalDateTime createdDate;
    protected LocalDateTime lastModifiedDate;
}
