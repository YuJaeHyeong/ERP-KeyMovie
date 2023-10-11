package erp.backend.domain.vacation.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class VacationInsert {
    //사원이 입사할때 자동 insert 되어야한다.
    private Long empId;
    //총 휴가
    private int vacationTotalVacation;
    //사용 휴가
    private int vacationUsedVacation;
    //총 연차
    private int vacationTotalDayOff;
    //사용 연차
    private int vacationUsedDayOff;
    //연차사용일
    private LocalDate vacationDayOffDate;

}
