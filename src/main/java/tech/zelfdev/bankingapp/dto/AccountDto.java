package tech.zelfdev.bankingapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AccountDto {
    private Long Id;
    private String accountHolderName;
    private Double balance;
}
