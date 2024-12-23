package com.sgi.credit_back.domain.ports.out;

import com.sgi.bank_account_back.infrastructure.dto.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CreditRepository {
    Mono<CreditResponse> createCredit(Mono<CreditRequest> customer);
    Mono<Void> deleteCredit(String id);
    Flux<CreditResponse> getAllCredits();
    Mono<CreditResponse> getCreditById(String id);
    Mono<CreditResponse> updateCredit(String id, Mono<CreditRequest> customer);
    Mono<TransactionResponse> makePayment(String idCredit, Mono<PaymentRequest> paymentRequestMono);
    Mono<BalanceResponse> getClientBalances(String idCredit);
    Flux<TransactionResponse> getClientTransactions(String idCredit);
    Mono<TransactionResponse> chargeCreditCard(String idCredit, Mono<ChargeRequest> chargeRequestMono);
}
