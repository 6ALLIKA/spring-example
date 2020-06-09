package spring.model.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserResponseDto {
    private String name;
    private String email;
}
