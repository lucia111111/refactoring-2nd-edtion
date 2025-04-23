package com.refactoring.chap07.chap07_1;

import java.util.HashMap;
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
 * 필드는 private, 조작은 메서드를 통해서만(getUasage(), setUsage()를 이용) -> 캡슐화
 * 도메인 객체(Customer)를 통한 추상화 -> 데이터가 어떤 의미인지 명확
 * 내부 구조 은닉 -> 외부에서 직접 접근 불가
 * */
public class CustomerData_After {
    private Map<String, Customer> customers;

    public CustomerData_After(Map<String, Customer> customers) {
        this.customers = customers;
    }

    public int getUsage(String customerID, String year, String month) {
        return customers.get(customerID).getUsage(year, month);
    }

    public void setUsage(String customerID, String year, String month, int amount) {
        customers.get(customerID).setUsage(year, month, amount);
    }

    public static class Customer {
        private String name;
        private String id;
        private Map<String, Map<String, Integer>> usages; // usages[year][month]

        public Customer(String name, String id, Map<String, Map<String, Integer>> usages) {
            this.name = name;
            this.id = id;
            this.usages = usages;
        }

        public int getUsage(String year, String month) {
            return usages.get(year).get(month);
        }

        public void setUsage(String year, String month, int amount) {
            usages.get(year).put(month, amount);
        }

        public String getName() {
            return name;
        }

        public String getId() {
            return id;
        }
    }

    public static void main(String[] args) {
        Map<String, Map<String, Integer>> usages = Map.of(
                "2016", new HashMap<>(Map.of("1", 50, "2", 55)),
                "2015", new HashMap<>(Map.of("1", 70, "2", 63))
        );

        CustomerData_After.Customer customer = new CustomerData_After.Customer("Martin Fowler", "1920", usages);
        CustomerData_After customerData = new CustomerData_After(Map.of("1920", customer));

        // 외부에서는 메서드만 사용 가능
        int usageAmount = customerData.getUsage("1920", "2016", "1");  // 50
        System.out.println("Usage: " + usageAmount);

        customerData.setUsage("1920", "2016", "1", 100);  // Set new usage
        usageAmount = customerData.getUsage("1920", "2016", "1");  // 100
        System.out.println("Updated Usage: " + usageAmount);
    }
}

