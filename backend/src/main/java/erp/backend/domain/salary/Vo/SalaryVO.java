package erp.backend.domain.salary.Vo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class SalaryVO {
    private final long amount = 30000000;
    private final long ASSISTANT = amount;
    private final long SENIOR_ASSISTANT = (long) (amount * 1.1);
    private final long MANAGER = (long) (amount * 1.45);
    private final long SENIOR_MANAGER = (long) (amount * 2.25);
    private final long PRESIDENT = (long) (amount * 3.5);
    private final double nationalInsurance = 0.045;
    private final double healthInsurance = 0.03335;
    private final double nursingInsurance = healthInsurance * 0.1025;
    private final double employmentInsurance = 0.008;
    private final long year = 12;
    private long bonus;

    public long getBonus() {
        return bonus;
    }

    public void setBonus(long bonus) {
        this.bonus = bonus;
    }

    private final double tax = (long) (((amount / year) + bonus) * nationalInsurance) + (long) (((amount / year) + bonus) * healthInsurance) +
            (long) (((amount / year) + bonus) * nursingInsurance) + (long) (((amount / year) + bonus) * employmentInsurance);


    // 실수령액
    public Long paymoney(String position) {
        Long pay = null;
        Long tax1 = taxmoney(position);
        switch (position) {
            case "사원":
                pay = (ASSISTANT / year) + bonus - tax1;
                break;
            case "대리":
                pay = (SENIOR_ASSISTANT / year) + bonus - tax1;
                break;
            case "과장":
                pay = (MANAGER / year) + bonus - tax1;
                break;
            case "부장":
                pay = (SENIOR_MANAGER / year) + bonus - tax1;
                break;
            case "사장":
                pay = (PRESIDENT / year) + bonus - tax1;
                break;
            default:
                break;
        }
        if (pay == null) {
            return pay;
        }
        return pay;
    }

    public Long taxmoney(String position) {
        Long tax1 = null;
        switch (position) {
            case "사원":
                tax1 = (long) (((amount / year) + bonus) * nationalInsurance) + (long) (((amount / year) + bonus) * healthInsurance) +
                        (long) (((amount / year) + bonus) * nursingInsurance) + (long) (((amount / year) + bonus) * employmentInsurance);
                break;
            case "대리":
                tax1 = (long) ((((amount * 1.1) / year) + bonus) * nationalInsurance) + (long) ((((amount * 1.1) / year) + bonus) * healthInsurance) +
                        (long) ((((amount * 1.1) / year) + bonus) * nursingInsurance) + (long) ((((amount * 1.1) / year) + bonus) * employmentInsurance);
                break;
            case "과장":
                tax1 = (long) ((((amount * 1.45) / year) + bonus) * nationalInsurance) + (long) ((((amount * 1.45) / year) + bonus) * healthInsurance) +
                        (long) ((((amount * 1.45) / year) + bonus) * nursingInsurance) + (long) ((((amount * 1.45) / year) + bonus) * employmentInsurance);
                break;
            case "부장":
                tax1 = (long) ((((amount * 2.25) / year) + bonus) * nationalInsurance) + (long) ((((amount * 2.25) / year) + bonus) * healthInsurance) +
                        (long) ((((amount * 2.25) / year) + bonus) * nursingInsurance) + (long) ((((amount * 2.25) / year) + bonus) * employmentInsurance);
                break;
            case "사장":
                tax1 = (long) ((((amount * 3.5) / year) + bonus) * nationalInsurance) + (long) ((((amount * 3.5) / year) + bonus) * healthInsurance) +
                        (long) ((((amount * 3.5) / year) + bonus) * nursingInsurance) + (long) ((((amount * 3.5) / year) + bonus) * employmentInsurance);
                break;
            default:
                break;
        }
        if (tax1 == null) {
            return tax1;
        }
        return tax1;
    }
}