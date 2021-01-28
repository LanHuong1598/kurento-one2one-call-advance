package org.kurento.tutorial.one2onecalladv.auth;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter @Setter @NoArgsConstructor
public class Credential implements Serializable {

    private String username;

    private String password;

    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    public String toString() {
        try {
            String json = OBJECT_MAPPER.writeValueAsString(this);
            return super.getClass().getSimpleName() + " " + json;
        } catch (JsonProcessingException var2) {
            return super.toString();
        }
    }
}