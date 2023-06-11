package guru.springframework.msscbrewery.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomerDto {
    private UUID id;
    private String name;
}
