package oxy.gen;

import org.junit.jupiter.api.*;

import java.lang.module.Configuration;

public class ExampleJunit5Test {
    @BeforeAll
    static void configure() {
        System.out.println("Перед всеми тестами 1 раз ");
    }
    @AfterAll
    static void ClearTrash() {
        System.out.println("После всех тестов ");
    }
    @BeforeEach
    void beforeTest() {
        System.out.println("        Выполняется перед каждым тестом ");
    }

    @Test
    void firstTest0(){
        System.out.println("    This is  @Test0 ");
    }
    @Test
    void firstTest1(){
        System.out.println("    This is  @Test1 ");
    }


}
