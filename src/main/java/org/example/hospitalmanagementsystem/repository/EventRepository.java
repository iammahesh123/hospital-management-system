package org.example.hospitalmanagementsystem.repository;

import org.example.hospitalmanagementsystem.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {

//    public List<Event> findByStartGreaterThanEqualAndFinishLessThanEqual(LocalDateTime start, LocalDateTime end);
//
//    public List<Event> findByTitle(String title);
//
   public List<Event> findByStart(LocalDateTime start);
//
//    @Query("select b from Event b where b.start >= ?1 and b.end <= ?2")
//    public List<Event> findByDateBetween(LocalDateTime start, LocalDateTime end);

}
