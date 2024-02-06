package tech.zelfdev.bankingapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.zelfdev.bankingapp.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
