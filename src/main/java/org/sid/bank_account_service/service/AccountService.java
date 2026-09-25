package org.sid.bank_account_service.service;

import org.sid.bank_account_service.dto.BankAccountResponseDTO;
import org.sid.bank_account_service.dto.BankAccountRequestDTO;
import org.sid.bank_account_service.entities.BankAccount;
import org.sid.bank_account_service.enums.AccountType;

public interface AccountService {
    BankAccountResponseDTO addAccount(BankAccountRequestDTO bankAccountDTO);
    BankAccountResponseDTO updateAccount(String id, BankAccountRequestDTO bankAccountDTO);
    Boolean deleteAccount(String id);
}
