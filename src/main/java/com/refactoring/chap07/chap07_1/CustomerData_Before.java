package com.refactoring.chap07.chap07_1;

import java.util.Map;

/**
 *
 * const customerData = {
 *   "1920": {
 *     name: "Martin Fowler",
 *     id: "1920",
 *     usages: {
 *       "2016": {
 *         "1": 50,
 *         "2": 55
 *       },
 *       "2015": {
 *         "1": 70,
 *         "2": 63
 *       }
 *     }
 *   },
 *   ...
 * };
 *
 * */

/**
 * 외부 코드가 직접 Map 구조에 접근해 값 변경 가능
 *  -> 구조가 외부에 노출되어 있음(캡슐화x)
 * */

public class CustomerData_Before {
    public Map<String, Map<String, Map<String, Integer>>> customerData;

    public CustomerData_Before(Map<String, Map<String, Map<String, Integer>>> customerData) {
        this.customerData = customerData;
    }

    public int getUsage(String customerId, String year, String month) {
        return customerData.get(customerId).get(year).get(month);
    }

    public void setUsage(String customerId, String year, String month, int amount) {
        customerData.get(customerId).get(year).put(month, amount);
    }
}

