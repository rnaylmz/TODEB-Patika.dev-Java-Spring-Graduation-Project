package com.todeb.rnaylmz.creditapplicationsystem.testservice;

import com.todeb.rnaylmz.creditapplicationsystem.model.entity.Customer;
import com.todeb.rnaylmz.creditapplicationsystem.repository.ICustomerRepository;
import com.todeb.rnaylmz.creditapplicationsystem.service.CustomerService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@ExtendWith(MockitoExtension.class)
public class CreditApplicationServiceTest {
    @Mock
    private ICustomerRepository customerRepository;

    @InjectMocks
    private CustomerService customerService;

  /*  @Test
    void getAllCustomers(){
        List<Customer> expCustomerList = getSampleTestCustomers();

        Mockito.when(customerRepository.findAll()).thenReturn(expCustomerList);

        List<Customer> actualCustomerList = customerService.getAllCustomer();

        Assert.assertEquals(expCustomerList.size(), actualCustomerList.size());

        System.out.println("First: " + expCustomerList);
        expCustomerList = expCustomerList.stream().sorted(getCustomerComparator()).collect(Collectors.toList());
        actualCustomerList = actualCustomerList.stream().sorted(getCustomerComparator()).collect(Collectors.toList());
        for (int i = 0; i < expCustomerList.size(); i++) {
            Customer currExpectedCourse = expCustomerList.get(i);
            Customer currActualCourse = actualCustomerList.get(i);
            Assert.assertEquals(currExpectedCustomer.getId(), currActualCustomer.getId());
            Assert.assertEquals(currExpectedCustomer.getTitle(), currActualCustomer.getTitle());
            // ...
        }

        System.out.println("Second : " + expCustomerList);

    }

    @Test
    void getById_successful() {
        // init step
        Customer expectedCourse = getSampleTestCourses().get(1);
        Optional<Customer> optExpectedCourse = Optional.of(expectedCourse);

        // stub - when step
        Mockito.when(ICustomerRepository.findById(Mockito.any())).thenReturn(optExpectedCourse);

        // then - validate step
        Customer actualCourse = customerService.getById(10L);

        Assert.assertEquals(actualCourse.getId(), expectedCourse.getId());
        Assert.assertEquals(actualCourse.getTitle(), expectedCourse.getTitle());
        // ...
    }

    @Test
    void getById_NOT_FOUND() {
        // stub - when step
        Mockito.when(customerRepository.findById(1L)).thenReturn(Optional.empty());

        // then - validate step
        assertThrows(EntityNotFoundException.class,
                () -> {
                    Customer actCustomer = customerService.getById(1L);
                }
        );

    }

    @Test
    void create() {
        // init step
        Customer expected = getSampleTestCourses().get(0);
        expected.setId(null);


        //when
        Mockito.when(customerRepository.save(any())).thenReturn(expected);

        // then - validate step
        CustomerDTO courseDTO = new CustomerDTO();
        courseDTO.setTitle(expected.getTitle());
        courseDTO.setDetails(expected.getDetails());
        courseDTO.setPrice(expected.getPrice());
        courseDTO.setQuota(expected.getQuota());

        Customer actualCustomer = customerService.create(customerDTO);

        verify(customerRepository, times(1)).save(expected);

        Assert.assertEquals(expected.getTitle(), actualCustomer.getTitle());
        Assert.assertEquals(expected.getDetails(), actualCustomer.getDetails());
        Assert.assertEquals(expected.getQuota(), actualCustomer.getQuota());
    }

    @Test
    void delete() {
        // init step
        Long courseId = 1L;
        Customer course = getSampleTestCourses().get(0);

        // stub - when step
        Mockito.when(customerRepository.findById(courseId)).thenReturn(Optional.of(course));
        doNothing().when(customerRepository).deleteById(courseId);

        // then - validate step
        customerService.delete(1L);

        verify(courseRepository, times(1)).deleteById(courseId);
    }

    @Test
    void update() {
        // init step

        // stub - when step

        // then - validate step
    }

    @Test
    void getAllStudentsByCourse() {
        // init step

        // stub - when step

        // then - validate step
    }

    private List<Customer> getSampleTestCourses() {
        List<Customer> sampleList = new ArrayList<>();
        Customer course = new Customer(1L, "Math", "Details 1", 45.9, 100, 0, 0, 0, null);
        Customer course2 = new Customer(2L, "Physics", "Details 2", 45.9, 100, 0, 0, 0, null);
        Customer course3 = new Customer(3L, "Chemistry", "Details 3", 45.9, 100, 0, 0, 0, null);
        sampleList.add(course2);
        sampleList.add(course);
        sampleList.add(course3);
        return sampleList;
    }

    private Comparator<Customer> getCourseComparator() {
        return (o1, o2) -> {
            if (o1.getId() - o2.getId() < 0)
                return -1;
            if (o1.getId() - o2.getId() == 0)
                return 0;
            return 1;
        };
    }

    }*/
}
