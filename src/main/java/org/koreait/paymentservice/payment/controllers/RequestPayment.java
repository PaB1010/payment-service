package org.koreait.paymentservice.payment.controllers;

import lombok.Data;
import org.koreait.paymentservice.payment.constants.PaymentType;
import org.springframework.data.annotation.Id;

@Data
public class RequestPayment {

    private Long orderId;

    // 주문자 명
    private String customerName;

    // 주문자 이메일
    private String customerEmail;

    // 주문자 휴대전화번호
    private String customerMobile;

    private PaymentType paymentType;

    private String paymentKey;

    // 결제 금액
    private Long amount;

    // 결제 실패시 에러 코드
    private String code;

    // 결제 실패시 메세지
    private String message;
}