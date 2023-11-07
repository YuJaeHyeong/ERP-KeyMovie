package erp.backend.domain.notice.dto;

import erp.backend.domain.notice.entity.Notice;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Page;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class NoticeListResult {
    private Page<NoticeListResponse> list;
    private int page;
    private int size;
    private long totalCount;
    private long totalPageCount;

    public static NoticeListResult from(Page<Notice> noticeList) {
        return NoticeListResult.builder()
                .page(noticeList.getNumber() + 1)
                .size(noticeList.getSize())
                .totalCount(noticeList.getTotalElements())
                .totalPageCount(noticeList.getTotalPages())
                .list(
                        noticeList.map(NoticeListResponse::fromNotice)
                )
                .build();
    }
}
