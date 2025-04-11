package com.refactoring.chap01;

public class PerformanceCalculatorFactory {

    public PerformanceCalculator createPerformanceCalculator(Performance performance, Play play) throws Exception {
        switch (play.getType()){
            case "tragedy" :
                return new TragedyCalculator(performance, play);
            case "comedy" :
                return new ComedyCalculator(performance, play);
            default:
                throw new Exception("알 수 없는 타입입니다!");
         }
    }

}
