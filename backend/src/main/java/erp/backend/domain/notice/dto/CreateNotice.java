package erp.backend.domain.notice.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateNotice {
    private String subject;
    private String content;
}