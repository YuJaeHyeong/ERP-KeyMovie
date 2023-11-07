package erp.backend.domain.message.repository;

import erp.backend.domain.message.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MessageRepository extends JpaRepository<Message, Long> {
    Message findByMessageId(Long id);

    List<Message> findByMessageReceiverEmpIdOrderByMessageIdDesc(long id);

}
