package curso_1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

@Getter
@AllArgsConstructor
public class HourContract {
    Date date;

    double valuePerHour;
    int hours;

    public double totalValue() {
        return valuePerHour * hours;
    }
}
