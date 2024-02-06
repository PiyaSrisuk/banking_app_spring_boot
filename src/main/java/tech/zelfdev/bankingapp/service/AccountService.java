package tech.zelfdev.bankingapp.service;

import tech.zelfdev.bankingapp.dto.AccountDto;

import java.util.List;

public interface AccountService {
    public AccountDto createAccount(AccountDto accountDto);
    public AccountDto getAccountById(Long id);
    public AccountDto deposit(Long id, Double amount);
    public AccountDto withdraw(Long id, Double amount);
    public List<AccountDto> getAllAccounts();
    public void deleteById(Long id);
}
