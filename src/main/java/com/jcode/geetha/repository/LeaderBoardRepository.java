package com.jcode.geetha.repository;

import com.jcode.geetha.model.LeaderBoard;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LeaderBoardRepository extends JpaRepository<LeaderBoard, Integer> {

    @Query(value = "SELECT l.* FROM leaderboard AS l ORDER BY  l.rank ASC ", nativeQuery = true)
    List<LeaderBoard> getLeaderBoardData(PageRequest pageRequest);

}
