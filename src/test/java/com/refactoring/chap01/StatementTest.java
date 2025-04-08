package com.refactoring.chap01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StatementTest extends Ch01Test{
    private Statement stat;
    private Invoice invoice;

    @BeforeEach
    void setUp(){
        stat = new Statement();
        invoice = invoices.get(0);
    }

    @Test
    void statement() throws Exception {
        // given
        final String expected = """
                청구 내역 (고객명: BigCo)
                  Hamlet: $650.00원 (55석)
                  As You Like It: $580.00원 (35석)
                  Othello: $500.00원 (40석)
                총액: $1,730.00원
                적립 포인트: 47점
                """;

        // when
        final String result = stat.statement(invoice, plays);

        // then
        assertThat(result).isEqualTo(expected);
    }

}