package curso_1.entities;

import curso_1.entities.enums.WorkerLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Getter
@RequiredArgsConstructor
public class Worker {
    private final String name;
    private final double baseSalary;
    private final Department department;
    private final List<HourContract> contracts = new ArrayList<>();
    private final WorkerLevel level;

    public void addContract(HourContract contract) {
        contracts.add(contract);
    }

    public void removeContract(HourContract contract) {
        contracts.remove(contract);
    }

    public double income(int year, int month) {
        double sum = baseSalary;
        Calendar calendar = Calendar.getInstance();

        for (HourContract contract : contracts) {
            calendar.setTime(contract.getDate());

            int c_year = calendar.get(Calendar.YEAR);
            int c_month = calendar.get(Calendar.MONTH) + 1;

            if (year == c_year && month == c_month)
                sum += contract.totalValue();
        }

        return sum;
    }
}
