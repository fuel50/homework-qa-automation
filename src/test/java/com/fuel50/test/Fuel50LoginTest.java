package com.fuel50.test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.LocalDate;

import static java.time.format.DateTimeFormatter.ofPattern;
import static org.assertj.core.api.Assertions.assertThat;

public class Fuel50LoginTest {

    @Test
    public void validatesFuel50VideoPostedDate() {
        LocalDate expectedPostedDate = LocalDate.of(2016, 06, 29);
        WebDriver webDriver = new ChromeDriver();

        String videoPostedDate = "Jun 29, 2016";
        assertThat(LocalDate.parse(videoPostedDate, ofPattern("MMM dd, yyyy"))).isEqualTo(expectedPostedDate);
        webDriver.quit();
    }

}
