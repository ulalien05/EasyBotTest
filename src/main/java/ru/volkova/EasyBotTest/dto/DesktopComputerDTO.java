package ru.volkova.EasyBotTest.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

import java.io.Serializable;

@Data
public class DesktopComputerDTO {

    @NotEmpty(message = "Serial number must be entered.")
    private String serialNumber;

    private String manufacturer;

    @Min(value = 0, message = "Price cannot be negative.")
    private double price;

    @Min(value = 0, message = "Stock quantity cannot be negative.")
    private int stockQuantity;

    @NotEmpty(message = "Type must be entered.")
    private String type;
}
