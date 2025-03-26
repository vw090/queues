package com.vweinert.queue.pusher.entities;

import jakarta.validation.constraints.NotBlank;
import lombok.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    Long id;
    @NotBlank
    String name;
    @NotBlank
    String email;

}
