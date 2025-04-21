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
 * getter / setter로만 된 순수 데이터 객체
 * 필드를 pulbic, getter / setter로 외부 노출 -> 외부코드에서 필드 직접 조작가능
 * */

public class CustomerData_Before {
    private Map<String, Customer> customers;

    public Map<String, Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(Map<String, Customer> customers) {
        this.customers = customers;
    }

    public static class Customer {
        private String name;
        private String id;
        private Map<String, Map<String, Integer>> usages; // usages[year][month]

        public Map<String, Map<String, Integer>> getUsages() {
            return usages;
        }

        public void setUsages(Map<String, Map<String, Integer>> usages) {
            this.usages = usages;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }
    }
}

