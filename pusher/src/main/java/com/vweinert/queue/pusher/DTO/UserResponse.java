package com.vweinert.queue.pusher.DTO;

import com.vweinert.queue.pusher.entities.User;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
public class UserResponse extends User {
    public String response;
}
