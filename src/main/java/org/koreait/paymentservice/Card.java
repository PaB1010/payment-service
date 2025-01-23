package org.koreait.paymentservice;

public enum Card {

    WOORI_CREDIT,
    KOOKMIN_CREDIT,
    WOORI_CHECK,
    KOOKMIN_CHECK,

    WOORI(0, "우리은행 신용카드"),
    KOOKMIN(1, "국민은행 신용카드"),

    WOORI(101, "우리은행 체크카드"),
    KOOKMIN(102, "국민은행 체크카드"),



    private final int target;

    private final String title;

    Card(int target, String title) {

        this.target = target;
        this.title = title;
    }
}