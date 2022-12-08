package com.hoaxify.ws.shared;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

@Data
@AllArgsConstructor
public class GenericResponse {
    private String message;
}
