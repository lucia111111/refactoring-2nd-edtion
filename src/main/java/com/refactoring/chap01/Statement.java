package com.refactoring.chap01;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Map;

public class Statement {

    public String statement(Invoice invoice, Map<String, Play> plays) throws Exception {
        StatementData statementData = new StatementData(invoice, plays);
        // 데이터만 처리
        return renderPlainText(statementData);
    }

    private String renderPlainText(StatementData statementData) throws Exception {
        var result = new StringBuilder("청구 내역 (고객명: " + statementData.getCustomer() + ")\n");

        for (var perf : statementData.getPerformances()) {
            // 청구 내역을 출력한다.
            result.append(
                    String.format(
                            "  %s: %s원 (%d석)\n",
                            statementData.playFor(perf).getName(),
                            getNumberFormat().format(statementData.amountFor(perf) / 100.0),
                            perf.getAudience()
                    )
            );
        }

        result.append(String.format("총액: %s원\n", getNumberFormat().format(statementData.totalAmount() / 100.0)));
        result.append(String.format("적립 포인트: %d점\n", statementData.totalVolumeCredits()));
        return result.toString();
    }

    private static NumberFormat getNumberFormat() {
        return NumberFormat.getCurrencyInstance(Locale.US);
    }

    private String renderHtml(StatementData statementData) throws Exception {
        StringBuilder result = new StringBuilder(String.format("<h1> 청구내역 (고객명: %s)\n </h1>", statementData.getCustomer()));
        result.append("<table> \n");
        result.append("<tr><th> 연극 </th> <th>좌석 수</th> <th>금액</th>");
        for (Performance performance : statementData.getPerformances()) {
            result.append(String.format("<tr><td> %s: </td> <td> $%d </td> <td> %d석 </td></tr>\n",statementData.playFor(performance).getName(), statementData.amountFor(performance) / 100, performance.getAudience()));
        }
        result.append("</table>\n");

        result.append(String.format("총액: $%d\n", statementData.totalAmount()));
        result.append(String.format("적립 포인트: %d점", statementData.totalVolumeCredits()));
        return result.toString();
    }

}