package com.example.demo.dto.emplyee;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public final class EmployeeDTO {
    private String name;
    private String surname;
    private String phone;
}
