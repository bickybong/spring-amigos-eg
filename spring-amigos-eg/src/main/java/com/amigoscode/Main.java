package com.amigoscode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@SpringBootApplication does componentscan and enableautoconfig
@SpringBootApplication
@RestController
@RequestMapping("api/v1/customers")
public class Main {
    private final CustomerRepository customerRepository;

    public Main(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @GetMapping
    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }

    record NewCustomerRequest(
            String name,
            String email,
            Integer age) {

    }

    @PostMapping
    public void addCustomer(@RequestBody NewCustomerRequest request) {
        Customer customer = new Customer();
        customer.setName(request.name());
        customer.setEmail(request.email());
        customer.setAge(request.age());
        customerRepository.save(customer);
    }

    @DeleteMapping("{customerId}")
    public void deleteCustomer(@PathVariable("customerId") Integer id) {
        customerRepository.deleteById(id);
        System.out.println("deleted");
    }

    @PutMapping("{customerId}")
    public void putCustomer(@PathVariable("customerId") Integer id,
                            @RequestBody NewCustomerRequest request) {
        Customer customer = customerRepository.getById(id);
        customer.setName(request.name());
        customer.setEmail(request.email());
        customer.setAge(request.age());
        customerRepository.save(customer);
        System.out.println("updated");
    }

//    @GetMapping("/greet")
//    public GreetResponse greet() {
//        return new GreetResponse(
//                "Hello",
//                List.of("Java", "Go", "JS"),
//                new Person("Alex", 26, 9000)
//                );
//    }
//
////    record creates class
//
//    record Person(String name, int age, double cash) {
//
//    }
//
//    record GreetResponse(
//            String greet,
//            List<String> favProgrammingLanguages,
//            Person person
//    ) {
//    }

}
