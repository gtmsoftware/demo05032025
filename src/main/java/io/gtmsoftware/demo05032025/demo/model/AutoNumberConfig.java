package io.gtmsoftware.demo05032025.demo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "auto_numbers")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AutoNumberConfig {
    @Id
    private String id;
    private String name;
    private Long currentValue;
}



