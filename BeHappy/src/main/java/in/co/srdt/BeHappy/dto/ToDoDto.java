package in.co.srdt.BeHappy.dto;

import lombok.Data;

@Data
public class ToDoDto {
    private Long id;
    private String title;
    private String description;
    private Boolean completed;
}
