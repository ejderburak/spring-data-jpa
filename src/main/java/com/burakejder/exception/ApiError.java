package com.burakejder.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;
import java.util.Map;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApiError<T> {

    private String id;

    private Date errorTime;

    private T errors; // generic yaptım ne tipte gelirse o olacak
}
