package com.example.gesipan_tacoyakki.service;

import com.example.gesipan_tacoyakki.domain.TacoBoard;
import com.example.gesipan_tacoyakki.repository.TacoBoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional

public class TacoBoardService {
    private final TacoBoardRepository tacoBoardRepository;

    public Long write(String title, String content) {
        TacoBoard tacoBoard = new TacoBoard(title, content);
        tacoBoardRepository.save(tacoBoard);
        return tacoBoard.getId();
    }

    @Transactional(readOnly = true)
    public List<TacoBoard> findAll() {
        return tacoBoardRepository.findAll();
    }

    @Transactional(readOnly = true)
    public TacoBoard findOne(Long id) {
        return tacoBoardRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("글 없음"));
    }

    public void update(Long id, String title, String content) {
        TacoBoard tacoBoard = findOne(id);
        tacoBoard.update(title, content);
    }

    public void delete(Long id) {
        tacoBoardRepository.deleteById(id);
    }
}
