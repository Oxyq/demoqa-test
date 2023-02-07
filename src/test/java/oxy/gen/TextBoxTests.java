package oxy.gen;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {

    @BeforeAll
    static void configure() {
        Configuration.baseUrl ="https://demoqa.com";
        Configuration.browserSize="1280x1080";
    }

    @Test
    void fillFormTest() {
        open("/text-box");
$("#userName").setValue("Egor");
$("#userEmail").setValue("Egor@egor.ru");
$("#currentAddress").setValue("adress1");
$("#permanentAddress").setValue("adress2");
$("#submit").click();


//проверки
        $("#output #name").shouldHave(text("Egor"));
        $("#output #email").shouldHave(text("Egor@egor.ru"));
        $("#output #currentAddress").shouldHave(text("adress1"));
        $("#output #permanentAddress").shouldHave(text("adress2"));


    }
}

