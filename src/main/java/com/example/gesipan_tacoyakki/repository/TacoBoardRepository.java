package com.example.gesipan_tacoyakki.repository;

import com.example.gesipan_tacoyakki.domain.TacoBoard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TacoBoardRepository extends JpaRepository<TacoBoard, Long> {
}
