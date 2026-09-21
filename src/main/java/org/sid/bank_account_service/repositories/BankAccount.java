package org.sid.bank_account_service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccount extends JpaRepository<BankAccount, String> {
}
