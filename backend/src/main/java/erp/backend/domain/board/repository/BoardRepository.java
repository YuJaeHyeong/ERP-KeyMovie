package erp.backend.domain.board.repository;

import erp.backend.domain.board.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BoardRepository extends JpaRepository<Board, Long> {
    Board findByBoardId(Long boardId);
    List<Board> findByBoardSubjectContainingOrderByBoardIdDesc(String keyword);

}
