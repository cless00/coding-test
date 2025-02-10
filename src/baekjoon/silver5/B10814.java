package baekjoon.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class B10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Client> clients = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            clients.add(new Client(Integer.parseInt(input[0]), input[1], i));
        }
        clients.stream().sorted().forEach(System.out::println);
    }

    public static class Client implements Comparable<Client> {
        private int age;
        private String name;
        private int order;

        public Client(int age, String name, int order) {
            this.age = age;
            this.name = name;
            this.order = order;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getOrder() {
            return order;
        }

        public void setOrder(int order) {
            this.order = order;
        }

        @Override
        public String toString() {
            return age + " " + name;
        }

        @Override
        public int compareTo(Client o) {
            if (this.age != o.age) {
                return this.age - o.age;
            } else {
                return this.order - o.order;
            }
        }
    }
}
